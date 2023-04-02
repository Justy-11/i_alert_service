package com.jathursh.i_alert_service.service;

import com.jathursh.i_alert_service.dto.StateData;
import com.jathursh.i_alert_service.dto.SummaryData;
import com.jathursh.i_alert_service.dto.iApiData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class iDataProvider {

    final String url = "https://api.rootnet.in/covid19-in/stats/latest";

    @Autowired
    RestTemplate restTemplate;

    public StateData getStateData(String state){

        iApiData apiData = restTemplate.getForObject(url, iApiData.class);
        assert apiData != null;
        return Arrays.stream(apiData.getCountryData().getRegional())
                .filter(e -> e.getLoc().equalsIgnoreCase(state))
                .findAny()
                .orElse(new StateData());

    }

    public SummaryData getSummaryData() {

        iApiData apiData = restTemplate.getForObject(url, iApiData.class);

        assert apiData != null;
        SummaryData summaryData = apiData.getCountryData().getSummary();

        summaryData.setUpdateTime(apiData.getLastRefreshed());

        return summaryData;
    }
}
