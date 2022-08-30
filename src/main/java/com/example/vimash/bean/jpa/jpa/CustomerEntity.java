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
    private Long customerId;


    @Column(name = "company_id")
    @JsonProperty("companyId")
    private Long companyId;

    //Customer Name
    @Column(name = "customer_name")
    @JsonProperty("customerName")
    private String customerName;

    //Customer Code
    @Column(name = "customer_code")
    @JsonProperty("customerCode")
    private String customerCode;

    @Column(name = "pic_name")
    @JsonProperty("picName")
    private String picName;

    @Column(name = "bank_name")
    @JsonProperty("bankName")
    private String bankName;

    @Column(name = "bank_branch_name")
    @JsonProperty("bankBranchName")
    private String bankBranchName;

    @Column(name = "bank_acc_number")
    @JsonProperty("bankAccNumber")
    private String bankAccNumber;


    @Column(name = "bank_acc_holder")
    @JsonProperty("bankAccHolder")
    private String bankAccHolder;

    @Column(name = "lead_time")
    @JsonProperty("leadTime")
    private Integer leadTime;

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
    @Column(name = "phone_number")
    @JsonProperty("phone_number")
    private String phoneNumber;

    //Fax Number
    @Column(name = "fax_number")
    @JsonProperty("faxNumber")
    private String faxNumber;

    //Zip Code
    @Column(name = "post_code")
    @JsonProperty("postCode")
    private String postCode;

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

    @Column(name = "output_priority_rank")
    @JsonProperty("outputPriorityRank")
    private Integer outputPriorityRank;

    @Column(name = "free_item1")
    @JsonProperty("freeItem1")
    private String freeItem1;

    @Column(name = "free_item2")
    @JsonProperty("freeItem2")
    private String freeItem2;

    @Column(name = "free_item3")
    @JsonProperty("freeItem3")
    private String freeItem3;

    //Description
    @Column(name = "notes")
    @JsonProperty("notes")
    private String notes;

    //Flg Customer
    @Column(name = "del_flg")
    @JsonProperty("delFlg")
    private String delFlg = "0";

    public CustomerEntity() {
    }

    //Contructor có ID

    public CustomerEntity(Long customerId, Long companyId, String customerName, String customerCode, String picName, String bankName, String bankBranchName, String bankAccNumber, String bankAccHolder, Integer leadTime, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String routeCode, String courseCode, String phoneNumber, String faxNumber, String postCode, String address1, String address2, String address3, String address4, Integer outputPriorityRank, String freeItem1, String freeItem2, String freeItem3, String notes, String delFlg) {
        this.customerId = customerId;
        this.companyId = companyId;
        this.customerName = customerName;
        this.customerCode = customerCode;
        this.picName = picName;
        this.bankName = bankName;
        this.bankBranchName = bankBranchName;
        this.bankAccNumber = bankAccNumber;
        this.bankAccHolder = bankAccHolder;
        this.leadTime = leadTime;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.postCode = postCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.outputPriorityRank = outputPriorityRank;
        this.freeItem1 = freeItem1;
        this.freeItem2 = freeItem2;
        this.freeItem3 = freeItem3;
        this.notes = notes;
        this.delFlg = delFlg;
    }

    public CustomerEntity(Long companyId, String customerName, String customerCode, String picName, String bankName, String bankBranchName, String bankAccNumber, String bankAccHolder, Integer leadTime, Integer createBy, Date createDate, Integer updateBy, Date updateDate, String routeCode, String courseCode, String phoneNumber, String faxNumber, String postCode, String address1, String address2, String address3, String address4, Integer outputPriorityRank, String freeItem1, String freeItem2, String freeItem3, String notes, String delFlg) {
        this.companyId = companyId;
        this.customerName = customerName;
        this.customerCode = customerCode;
        this.picName = picName;
        this.bankName = bankName;
        this.bankBranchName = bankBranchName;
        this.bankAccNumber = bankAccNumber;
        this.bankAccHolder = bankAccHolder;
        this.leadTime = leadTime;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.routeCode = routeCode;
        this.courseCode = courseCode;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.postCode = postCode;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.outputPriorityRank = outputPriorityRank;
        this.freeItem1 = freeItem1;
        this.freeItem2 = freeItem2;
        this.freeItem3 = freeItem3;
        this.notes = notes;
        this.delFlg = delFlg;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankAccNumber() {
        return bankAccNumber;
    }

    public void setBankAccNumber(String bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    public String getBankAccHolder() {
        return bankAccHolder;
    }

    public void setBankAccHolder(String bankAccHolder) {
        this.bankAccHolder = bankAccHolder;
    }

    public Integer getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Integer leadTime) {
        this.leadTime = leadTime;
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

    public Integer getOutputPriorityRank() {
        return outputPriorityRank;
    }

    public void setOutputPriorityRank(Integer outputPriorityRank) {
        this.outputPriorityRank = outputPriorityRank;
    }

    public String getFreeItem1() {
        return freeItem1;
    }

    public void setFreeItem1(String freeItem1) {
        this.freeItem1 = freeItem1;
    }

    public String getFreeItem2() {
        return freeItem2;
    }

    public void setFreeItem2(String freeItem2) {
        this.freeItem2 = freeItem2;
    }

    public String getFreeItem3() {
        return freeItem3;
    }

    public void setFreeItem3(String freeItem3) {
        this.freeItem3 = freeItem3;
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

    public CustomerEntity(Long customerId) {
        this.customerId = customerId;
    }
}

