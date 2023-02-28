package com.Spring_Layered_App.dto;

public class Customer {
	
	private int customerID;
	
	private String customerName;
	
	private String customerLocation;

	public Customer(int customerID, String customerName, String customerLocation) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	@Override
	public String toString() {
		return "Stundent [customerID=" + customerID + ", customerName=" + customerName + ", customerLocation="
				+ customerLocation + "]";
	}

}
