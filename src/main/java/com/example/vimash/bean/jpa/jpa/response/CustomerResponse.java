package com.example.vimash.bean.jpa.jpa.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class CustomerResponse implements Serializable {
    //Customer Id
    @JsonProperty("customerId")
    private Long customerId;

    // customer_code
    @JsonProperty("customerCode")
    private String customerCode;

    //Customer Name
    @JsonProperty("customerName")
    private String customerName;

    // pic name
    @JsonProperty("picName")
    private String picName;

    // address
    @JsonProperty("address")
    private String address;

    // phone number
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    // post code
    @JsonProperty("postCode")
    private String postCode;

    //Fax Number
    @JsonProperty("faxNumber")
    private String faxNumber;

    //lead time
    @JsonProperty("leadTime")
    private String leadTime;

    //Route Code
    @JsonProperty("routeCode")
    private String routeCode;

    //Course Code
    @JsonProperty("courseCode")
    private String courseCode;

    public CustomerResponse() {
    }

    public CustomerResponse(Long customerId, String customerCode, String postCode, String customerName, String picName, String address, String phoneNumber, String faxNumber, String leadTime, String routeCode, String courseCode) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.postCode = postCode;
        this.picName = picName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.leadTime = leadTime;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
    }

    public CustomerResponse(String customerCode, String customerName, String postCode, String picName, String address, String phoneNumber, String faxNumber, String leadTime, String routeCode, String courseCode) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.picName = picName;
        this.postCode = postCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.leadTime = leadTime;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(String leadTime) {
        this.leadTime = leadTime;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
