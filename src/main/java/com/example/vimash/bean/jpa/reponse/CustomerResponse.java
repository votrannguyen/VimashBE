package com.example.vimash.bean.jpa.reponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerResponse{
	@JsonProperty
	private Long customerId;
	
	@JsonProperty
	private String customerName;
	
	@JsonProperty
	private Integer createBy;
	
	@JsonProperty
	private String zipCode;
	
	@JsonProperty
	private String address1;
	
	@JsonProperty
	private String address2;
	
	@JsonProperty
	private String address3;
	
	@JsonProperty
	private String address4;
	
	@JsonProperty
	private String telephone;
	
	@JsonProperty
	private String faxNumber;
	
	@JsonProperty
	private Date createDate;
	
	@JsonProperty
	private String routeCode;
	
	@JsonProperty 
	private String courseCode;

	public CustomerResponse(Long customerId, String customerName, Integer createBy, String zipCode, String address1,
			String address2, String address3, String address4, String telephone, String faxNumber, Date createDate,
			String routeCode, String courseCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.createBy = createBy;
		this.zipCode = zipCode;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.telephone = telephone;
		this.faxNumber = faxNumber;
		this.createDate = createDate;
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

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
