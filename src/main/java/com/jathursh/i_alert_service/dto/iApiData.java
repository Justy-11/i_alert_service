package com.jathursh.i_alert_service.dto;

import java.time.ZonedDateTime;

public class iApiData {

    private CountryData countryData;

    private ZonedDateTime lastRefreshed;

    private ZonedDateTime lastOriginUpdate;

    public ZonedDateTime getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(ZonedDateTime lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public ZonedDateTime getLastOriginUpdate() {
        return lastOriginUpdate;
    }

    public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
        this.lastOriginUpdate = lastOriginUpdate;
    }

    public CountryData getCountryData() {
        return countryData;
    }

    public void setCountryData(CountryData countryData) {
        this.countryData = countryData;
    }
}
