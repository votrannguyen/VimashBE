package com.example.vimash.bean.jpa.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class CustomerResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("customerId")
    private Long customerId;

    // customer_code
    @JsonProperty("customerCode")
    private String customerCode;

    //Customer Name
    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("picName")
    private String picName;

    //Fax Number
    @JsonProperty("faxNumber")
    private String faxNumber;


    //post code
    @JsonProperty("postCode")
    private String postCode;

    //Create By
    @JsonProperty("createBy")
    private Integer createBy;

    //Create Date
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @JsonProperty("updateBy")
    private Integer updateBy;

    //Update Date
    @JsonProperty("updateDate")
    private Date updateDate;

    //Route Code
    @JsonProperty("routeCode")
    private String routeCode;

    //Course Code
    @JsonProperty("courseCode")
    private String courseCode;

    //Telephone
    @JsonProperty("phoneNumber")
    private String phoneNumber;



    //Zip Code

    //Address 1
    @JsonProperty("address1")
    private String address1;

    //Address 2)
    @JsonProperty("address2")
    private String address2;

    //Address 3
    @JsonProperty("address3")
    private String address3;

    //Address 4
    @JsonProperty("address4")
    private String address4;

    @JsonProperty("leadTime")
    private Integer leadTime;

    //Description
    @JsonProperty("notes")
    private String notes;

    //Flg Customer
    @JsonProperty("delFlg")
    private String delFlg = "0";

    public CustomerResponse() {
    }

    public CustomerResponse(Long customerId, String customerCode, String customerName, String faxNumber, String postCode, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String routeCode, String courseCode, String phoneNumber, String address1, String address2, String address3, String address4, String notes, String delFlg) {
        super();
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.faxNumber = faxNumber;
        this.postCode = postCode;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.phoneNumber = phoneNumber;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.notes = notes;
        this.delFlg = delFlg;
    }
    public CustomerResponse(String customerCode, String customerName, String postCode, String picName, String address, String phoneNumber, String faxNumber, Integer leadTime, String routeCode, String courseCode) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.picName = picName;
        this.postCode = postCode;
        this.address1 = address;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.leadTime = leadTime;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
    }
}