package com.intern.customerorderservice.entity;

import org.springframework.stereotype.Component;

@Component
public class CustomerOrderDetails {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private double amountSpent;
	
	public CustomerOrderDetails() {
		super();
	}

	public CustomerOrderDetails(int customerId, String firstName, String lastName, String phone, String address,
			double amountSpent) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.amountSpent = amountSpent;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}

	@Override
	public String toString() {
		return "CustomerOrderDetails [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", address=" + address + ", amountSpent=" + amountSpent + "]";
	}

	
}
