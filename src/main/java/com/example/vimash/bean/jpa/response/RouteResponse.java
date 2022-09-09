package com.example.vimash.bean.jpa.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RouteResponse implements Serializable {
    @JsonProperty("routeCode")
    private String customerCode;

    //Customer Name
    @JsonProperty("routeName")
    private String customerName;

    public RouteResponse() {
    }

    public RouteResponse(String customerCode, String customerName) {
        this.customerCode = customerCode;
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
