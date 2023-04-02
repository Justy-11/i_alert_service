package com.jathursh.i_alert_service.dto;

import java.util.List;

// 28/3
public class AlertStatus {

    String alertLevel;  // RED, GREEN, BLUE

    List<String> measureToBeTaken;

    private StateData summary;

    public StateData getSummaryData() {
        return summary;
    }

    public void setSummaryData(StateData summaryData) {
        this.summary = summaryData;
    }



    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public List<String> getMeasureToBeTaken() {
        return measureToBeTaken;
    }

    public void setMeasureToBeTaken(List<String> measureToBeTaken) {
        this.measureToBeTaken = measureToBeTaken;
    }
}
