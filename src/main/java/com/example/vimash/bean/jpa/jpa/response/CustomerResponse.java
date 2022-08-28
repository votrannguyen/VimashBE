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

    //Create By
    @JsonProperty("createBy")
    private Integer createBy;

    //Create Date
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
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
    @JsonProperty("telephone")
    private String telephone;

    //Fax Number
    @JsonProperty("faxNumber")
    private String faxNumber;

    //Zip Code
    @JsonProperty("zipCode")
    private String zipCode;

    //Address 1
    @JsonProperty("address1")
    private String address1;

    //Address 2
    @JsonProperty("address2")
    private String address2;

    //Address 3
    @JsonProperty("address3")
    private String address3;

    //Address 4
    @JsonProperty("address4")
    private String address4;

    //Description
    @JsonProperty("description")
    private String description;

    //Flg Customer
    @JsonProperty("delFlg")
    private String delFlg = "0";

    public CustomerResponse() {
    }

    //Contructor có ID
    public CustomerResponse(Long customerId, String customerName, Integer createBy, Date createDate, Integer updateBy,
                          Date updateDate, String routeCode, String courseCode, String telephone, String faxNumber,
                          String zipCode, String address1, String address2, String address3, String address4,
                          String description, String delFlg) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.telephone = telephone;
        this.faxNumber = faxNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.description = description;
        this.delFlg = delFlg;
    }

    //Contructor không có Id
    public CustomerResponse(String customerName, Integer createBy, Date createDate, Integer updateBy, Date updateDate,
                          String routeCode, String courseCode, String telephone, String faxNumber, String zipCode,
                          String address1, String address2, String address3, String address4, String description,
                          String delFlg) {
        this.customerName = customerName;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.telephone = telephone;
        this.faxNumber = faxNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.description = description;
        this.delFlg = delFlg;
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }
}
