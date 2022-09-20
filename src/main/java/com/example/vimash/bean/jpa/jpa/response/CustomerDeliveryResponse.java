package com.example.vimash.bean.jpa.jpa.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CustomerDeliveryResponse implements Serializable {
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

    //lead time
    @JsonProperty("leadTime")
    private String leadTime;

    //Route Code
    @JsonProperty("routeCode")
    private String routeCode;

    //Course Code
    @JsonProperty("courseCode")
    private String courseCode;

    //Description
    @JsonProperty("description")
    private String description;

    // phone number
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    //Fax Number
    @JsonProperty("faxNumber")
    private String faxNumber;

    // post code
    @JsonProperty("postCode")
    private String postCode;

    // address
    @JsonProperty("address1")
    private String address1;

    // address
    @JsonProperty("address2")
    private String address2;

    // address
    @JsonProperty("address3")
    private String address3;

    // address
    @JsonProperty("address4")
    private String address4;


    public CustomerDeliveryResponse() {
    }

    public CustomerDeliveryResponse(Long customerId, String customerCode, String customerName, String picName, String leadTime, String routeCode, String courseCode, String description, String phoneNumber, String faxNumber, String postCode, String address1, String address2, String address3, String address4) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.picName = picName;
        this.leadTime = leadTime;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.postCode = postCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
    }
}
