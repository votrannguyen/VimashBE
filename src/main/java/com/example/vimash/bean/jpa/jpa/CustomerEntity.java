package com.example.vimash.bean.jpa.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * [OVERVIEW] : T  Customer Info Of Entity.
 *
 * @author: (VIMASH)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/08/24      (VIMASH)         Create new
 */


@Entity
@Table(name = "m_customer")
public class CustomerEntity implements Serializable {

    //Customer Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Integer customerId;

    //Customer Name
    @Column(name = "customer_name")
    @JsonProperty("customerName")
    private String customerName;

    //Create By
    @Column(name = "create_by")
    @JsonProperty("createBy")
    private String createBy;

    //Create Date
    @Column(name = "create_date")
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    private String updateBy;

    //Update Date
    @Column(name = "update_date")
    @JsonProperty("updateDate")
    private Date updateDate;

    //Route Code
    @Column(name = "route_code")
    @JsonProperty("routeCode")
    private String routeCode;

    //Course Code
    @Column(name = "course_code")
    @JsonProperty("courseCode")
    private String courseCode;

    //Telephone
    @Column(name = "telephone")
    @JsonProperty("telephone")
    private String telephone;

    //Fax Number
    @Column(name = "fax_number")
    @JsonProperty("faxNumber")
    private String faxNumber;

    //Zip Code
    @Column(name = "zip_code")
    @JsonProperty("zipCode")
    private String zipCode;

    //Address 1
    @Column(name = "address1")
    @JsonProperty("address1")
    private String address1;

    //Address 2
    @Column(name = "address2")
    @JsonProperty("address2")
    private String address2;

    //Address 3
    @Column(name = "address3")
    @JsonProperty("address3")
    private String address3;

    //Address 4
    @Column(name = "address4")
    @JsonProperty("address4")
    private String address4;

    //Description
    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    //Flg Customer
    @Column(name = "flg_customer")
    @JsonProperty("flgCustomer")
    private String flgCustomer = "0";

    public CustomerEntity() {
    }

    public CustomerEntity(Integer customerId, String customerName, String createBy, Date createDate, String updateBy,
                          Date updateDate, String routeCode, String courseCode, String telephone, String faxNumber,
                          String zipCode, String address1, String address2, String address3, String address4,
                          String description, String flgCustomer) {
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
        this.flgCustomer = flgCustomer;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
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

    public String getFlgCustomer() {
        return flgCustomer;
    }

    public void setFlgCustomer(String flgCustomer) {
        this.flgCustomer = flgCustomer;
    }
}
