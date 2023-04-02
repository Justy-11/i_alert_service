package com.jathursh.i_alert_service.service;

import com.jathursh.i_alert_service.dto.AlertStatus;
import com.jathursh.i_alert_service.dto.StateData;
import com.jathursh.i_alert_service.dto.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {

    @Autowired
    private iDataProvider i_data_provider;

    public AlertStatus getAlertAboutState(String state) {

        AlertStatus alertStatus = new AlertStatus();

        StateData stateData = i_data_provider.getStateData(state);

        alertStatus.setSummaryData(stateData);

        if (stateData.getTotalConfirmed() < 1000) {
            alertStatus.setAlertLevel("GREEN");
            alertStatus.setMeasureToBeTaken(List.of("Everything is Normal !!"));
        } else if (stateData.getTotalConfirmed() > 1000 && stateData.getTotalConfirmed() < 10000) {
            alertStatus.setAlertLevel("ORANGE");
            alertStatus.setMeasureToBeTaken(List.of("Only Essential services are allowed", "List of services that come under essential service"));
        } else {
            alertStatus.setAlertLevel("RED");
            alertStatus.setMeasureToBeTaken(List.of("Absolute lock-down", "Only Medical and food services are allowed here"));
        }

        return alertStatus;
    }

    public SummaryData getOverAllSummary() {

        return i_data_provider.getSummaryData();
    }
}
