package com.example.vimash.bean.jpa.jpa;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * [OVERVIEW] : T Delivery Of Entity.
 *
 * @author: (VIMASH)
 * @version: 1.0
 * @History
 * [NUMBER]  [VER]     [DATE]          [USER]             [CONTENT]
 * --------------------------------------------------------------------------
 * 001       1.0       2022/08/24      (VIMASH)         Create new
 */

@Entity
@Table(name = "m_delivery")
public class DeliveryEntity implements Serializable {

    //User Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    @JsonProperty("deliveryId")
    private Integer deliveryId;

    //Delivery Name
    @Column(name = "delivery_name")
    @JsonProperty("deliveryName")
    private String deliveryName;

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

    //Description
    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    //Customer
    @Column(name = "customer_id")
    @JsonProperty("customerId")
    private Integer customerId;

    //Flg Deivery
    @Column(name = "flg_delivery")
    @JsonProperty("flgDelivery")
    private String flgDelivery = "0";

    public DeliveryEntity() {
    }

    public DeliveryEntity(Integer deliveryId, String deliveryName, String telephone, String faxNumber, String zipCode,
                          String address1, String address2, String address3, String address4, String createBy, Date createDate,
                          String updateBy, Date updateDate, String routeCode, String courseCode, String description,
                          Integer customerId, String flgDelivery) {
        this.deliveryId = deliveryId;
        this.deliveryName = deliveryName;
        this.telephone = telephone;
        this.faxNumber = faxNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.description = description;
        this.customerId = customerId;
        this.flgDelivery = flgDelivery;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFlgDelivery() {
        return flgDelivery;
    }

    public void setFlgDelivery(String flgDelivery) {
        this.flgDelivery = flgDelivery;
    }
}
