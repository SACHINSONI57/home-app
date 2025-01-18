package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
	
	@Id
	private Long id;
	private Long applianceId;
	private int quanity;
	private String customerName;
	private String paymentStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getApplianceId() {
		return applianceId;
	}
	public void setApplianceId(Long applianceId) {
		this.applianceId = applianceId;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
}
