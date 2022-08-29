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
public class CustomerEntity<c6b323b76622e931dd193f37698fd2a333c9cb6d> implements Serializable {

    //Customer Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Long customerId;

    // customer_code
    @Column(name = "customer_code")
    @JsonProperty("customerCode")
    private String customerCode;

    //Customer Name
    @Column(name = "customer_name")
    @JsonProperty("customerName")
    private String customerName;

    //pic Name
    @Column(name = "pic_name")
    @JsonProperty("picName")
    private String picName;

    //Fax Number
    @JsonProperty("faxNumber")
    private String faxNumber;

    //lead time
    @JsonProperty("leadTime")
    private String leadTime;

    //post code
    @Column(name = "post_code")
    @JsonProperty("postCode")
    private String postCode;

    //Create By
    @Column(name = "create_by")
    @JsonProperty("createBy")
    private Integer createBy;

    //Create Date
    @Column(name = "create_date")
    @JsonProperty("createDate")
    private Date createDate;

    //Update By
    @Column(name = "update_by")
    @JsonProperty("updateBy")
    private Integer updateBy;

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

    // phone number
    @Column(name = "phone_number")
    @JsonProperty("phoneNumber")
    private String phoneNumber;

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
    @Column(name = "del_flg")
    @JsonProperty("delFlg")
    private String delFlg = "0";

    public CustomerEntity() {
    }

    //Contructor có ID
    public CustomerEntity(Long customerId, String customerCode, String customerName, String picName, String faxNumber, String leadTime, String postCode, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String routeCode, String courseCode, String telephone, String phoneNumber, String zipCode, String address1, String address2, String address3, String address4, String description, String delFlg) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.picName = picName;
        this.faxNumber = faxNumber;
        this.leadTime = leadTime;
        this.postCode = postCode;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.telephone = telephone;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.description = description;
        this.delFlg = delFlg;
    }

    //Contructor không có Id
    public CustomerEntity(String customerCode, String customerName, String picName, String faxNumber, String leadTime, String postCode, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String routeCode, String courseCode, String telephone, String phoneNumber, String zipCode, String address1, String address2, String address3, String address4, String description, String delFlg) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.picName = picName;
        this.faxNumber = faxNumber;
        this.leadTime = leadTime;
        this.postCode = postCode;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.telephone = telephone;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.description = description;
        this.delFlg = delFlg;
    }

            public Long getCustomerId () {
            return customerId;
        }

            public void setCustomerId (Long customerId){
            this.customerId = customerId;
        }

            public String getCustomerCode () {
            return customerCode;
        }

            public void setCustomerCode (String customerCode){
            this.customerCode = customerCode;
        }

            public String getCustomerName () {
            return customerName;
        }

            public void setCustomerName (String customerName){
            this.customerName = customerName;
        }

            public String getPicName () {
            return picName;
        }

            public void setPicName (String picName){
            this.picName = picName;
        }

            public String getFaxNumber () {
            return faxNumber;
        }

            public void setFaxNumber (String faxNumber){
            this.faxNumber = faxNumber;
        }

            public String getLeadTime () {
            return leadTime;
        }

            public void setLeadTime (String leadTime){
            this.leadTime = leadTime;
        }

            public String getPostCode () {
            return postCode;
        }

            public void setPostCode (String postCode){
            this.postCode = postCode;
        }

            public Integer getCreateBy () {
            return createBy;
        }

            public void setCreateBy (Integer createBy){
            this.createBy = createBy;
        }

            public Date getCreateDate () {
            return createDate;
        }

            public void setCreateDate (Date createDate){
            this.createDate = createDate;
        }

            public Integer getUpdateBy () {
            return updateBy;
        }

            public void setUpdateBy (Integer updateBy){
            this.updateBy = updateBy;
        }

            public Date getUpdateDate () {
            return updateDate;
        }

            public void setUpdateDate (Date updateDate){
            this.updateDate = updateDate;
        }

            public String getRouteCode () {
            return routeCode;
        }

            public void setRouteCode (String routeCode){
            this.routeCode = routeCode;
        }

            public String getCourseCode () {
            return courseCode;
        }

            public void setCourseCode (String courseCode){
            this.courseCode = courseCode;
        }

            public String getTelephone () {
            return telephone;
        }

            public void setTelephone (String telephone){
            this.telephone = telephone;
        }

            public String getPhoneNumber () {
            return phoneNumber;
        }

            public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

            public String getZipCode () {
            return zipCode;
        }

            public void setZipCode (String zipCode){
            this.zipCode = zipCode;
        }

            public String getAddress1 () {
            return address1;
        }

            public void setAddress1 (String address1){
            this.address1 = address1;
        }

            public String getAddress2 () {
            return address2;
        }

            public void setAddress2 (String address2){
            this.address2 = address2;
        }

            public String getAddress3 () {
            return address3;
        }

            public void setAddress3 (String address3){
            this.address3 = address3;
        }

            public String getAddress4 () {
            return address4;
        }

            public void setAddress4 (String address4){
            this.address4 = address4;
        }

            public String getDescription () {
            return description;
        }

            public void setDescription (String description){
            this.description = description;
        }

            public String getDelFlg () {
            return delFlg;
        }

            public void setDelFlg (String delFlg){
            this.delFlg = delFlg;
        }
        }
