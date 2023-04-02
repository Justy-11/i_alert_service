package com.jathursh.i_alert_service.dto;

public class CountryData {

    private SummaryData summary;

    private StateData[] regional;

    public SummaryData getSummary() {
        return summary;
    }

    public void setSummary(SummaryData summary) {
        this.summary = summary;
    }

    public StateData[] getRegional() {
        return regional;
    }

    public void setRegional(StateData[] regional) {
        this.regional = regional;
    }
}
