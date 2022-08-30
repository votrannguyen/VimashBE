package com.example.vimash.bean.jpa.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * [OVERVIEW] : T Delivery Of Entity.
 *
 * @author: (VIMASH)
 * @version: 1.0
 * @History [NUMBER] [VER] [DATE] [USER] [CONTENT]
 *          --------------------------------------------------------------------------
 *          001 1.0 2022/08/24 (VIMASH) Create new
 */

@Entity
@Table(name = "m_customer_delivery_dest")
public class DeliveryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Delivery Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "delivery_destination_id")
	@JsonProperty("delivery_destination_id")
	private Long deliveryId;

	// Company_id
	@Column(name = "company_id")
	@JsonProperty("company_id")
	private Integer companyId;

	// customer_id
	@Column(name = "customer_id")
	@JsonProperty("customer_id")
	private Integer customerId;

	// destination_code
	@Column(name = "destination_code")
	@JsonProperty("destination_code")
	private String destinationCode;

	// destination_name
	@Column(name = "destination_name")
	@JsonProperty("destination_name")
	private String destinationName;

	// pic_name
	@Column(name = "pic_name")
	@JsonProperty("pic_name")
	private String picName;

	// phone_number
	@Column(name = "phone_number")
	@JsonProperty("phone_number")
	private String phoneNumber;

	// fax_number
	@Column(name = "fax_number")
	@JsonProperty("fax_number")
	private String faxNumber;

	// post_code
	@Column(name = "post_code")
	@JsonProperty("post_code")
	private String postCode;

	// Address 1
	@Column(name = "address1")
	@JsonProperty("address1")
	private String address1;

	// Address 2
	@Column(name = "address2")
	@JsonProperty("address2")
	private String address2;

	// Address 3
	@Column(name = "address3")
	@JsonProperty("address3")
	private String address3;

	// Address 4
	@Column(name = "address4")
	@JsonProperty("address4")
	private String address4;

	// lead_time
	@Column(name = "lead_time")
	@JsonProperty("lead_time")
	private Integer leadTime;

	// Route Code
	@Column(name = "route_code")
	@JsonProperty("routeCode")
	private String routeCode;

	// Course Code
	@Column(name = "course_code")
	@JsonProperty("courseCode")
	private String courseCode;

	// output_priority_rank
	@Column(name = "output_priority_rank")
	@JsonProperty("output_priority_rank")
	private Integer outputPriorityRank;

	// free_item1
	@Column(name = "free_item1")
	@JsonProperty("free_item1")
	private String freeItem1;

	// free_item2
	@Column(name = "free_item2")
	@JsonProperty("free_item2")
	private String freeItem2;

	// free_item3
	@Column(name = "free_item3")
	@JsonProperty("free_item3")
	private String freeItem3;

	// Notes
	@Column(name = "notes")
	@JsonProperty("notes")
	private String notes;

	// Delete column
	@Column(name = "del_flg")
	@JsonProperty("del_flg")
	private String delFlg = "0";

	// Create By
	@Column(name = "create_by")
	@JsonProperty("create_by")
	private Integer createBy;

	// Create Date
	@Column(name = "create_date")
	@JsonProperty("create_date")
	private Date createDate;

	// Update By
	@Column(name = "update_by")
	@JsonProperty("update_by")
	private Integer updateBy;

	// Update Date
	@Column(name = "update_date")
	@JsonProperty("update_date")
	private Date updateDate;

	public DeliveryEntity() {
	}

	public DeliveryEntity(Integer companyId, Integer customerId, String destinationCode, String destinationName,
			String picName, String phoneNumber, String faxNumber, String postCode, String address1, String address2,
			String address3, String address4, Integer leadTime, String routeCode, String courseCode,
			Integer outputPriorityRank, String freeItem1, String freeItem2, String freeItem3, String notes,
			String delFlg, Integer createBy, Date createDate, Integer updateBy, Date updateDate) {
		super();
		this.companyId = companyId;
		this.customerId = customerId;
		this.destinationCode = destinationCode;
		this.destinationName = destinationName;
		this.picName = picName;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.postCode = postCode;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.leadTime = leadTime;
		this.routeCode = routeCode;
		this.courseCode = courseCode;
		this.outputPriorityRank = outputPriorityRank;
		this.freeItem1 = freeItem1;
		this.freeItem2 = freeItem2;
		this.freeItem3 = freeItem3;
		this.notes = notes;
		this.delFlg = delFlg;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public DeliveryEntity(Long deliveryId, Integer companyId, Integer customerId, String destinationCode,
			String destinationName, String picName, String phoneNumber, String faxNumber, String postCode,
			String address1, String address2, String address3, String address4, Integer leadTime, String routeCode,
			String courseCode, Integer outputPriorityRank, String freeItem1, String freeItem2, String freeItem3,
			String notes, String delFlg, Integer createBy, Date createDate, Integer updateBy, Date updateDate) {
		super();
		this.deliveryId = deliveryId;
		this.companyId = companyId;
		this.customerId = customerId;
		this.destinationCode = destinationCode;
		this.destinationName = destinationName;
		this.picName = picName;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.postCode = postCode;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.leadTime = leadTime;
		this.routeCode = routeCode;
		this.courseCode = courseCode;
		this.outputPriorityRank = outputPriorityRank;
		this.freeItem1 = freeItem1;
		this.freeItem2 = freeItem2;
		this.freeItem3 = freeItem3;
		this.notes = notes;
		this.delFlg = delFlg;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
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

	public Integer getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(Integer leadTime) {
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

}