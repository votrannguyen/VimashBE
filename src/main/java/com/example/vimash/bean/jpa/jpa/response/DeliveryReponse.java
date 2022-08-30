package com.example.vimash.bean.jpa.jpa.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryReponse implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("delivery_destination_id")
	private Long deliveryId;

	@JsonProperty("destination_name")
	private String destinationName;

	@JsonProperty("pic_name")
	private String picName;

	@JsonProperty("post_code")
	private String postCode;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("phone_number")
	private String phoneNumber;

	@JsonProperty("fax_number")
	private String faxNumber;

	@JsonProperty("lead_time")
	private Integer leadTime;

	@JsonProperty("routeCode")
	private String routeCode;

	@JsonProperty("courseCode")
	private String courseCode;

	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
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

	public DeliveryReponse() {
		super();
	}

	public DeliveryReponse(Long deliveryId, String destinationName, String picName, String postCode, String address1,
			String phoneNumber, String faxNumber, Integer leadTime, String routeCode, String courseCode) {
		super();
		this.deliveryId = deliveryId;
		this.destinationName = destinationName;
		this.picName = picName;
		this.postCode = postCode;
		this.address1 = address1;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.leadTime = leadTime;
		this.routeCode = routeCode;
		this.courseCode = courseCode;
	}

}
