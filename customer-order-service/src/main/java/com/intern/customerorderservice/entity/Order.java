package com.intern.customerorderservice.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int customerId;
	private Date orderDate;
	private String status;
	private String comments;
	private Date shippedDate;
	private int shipperId;
	
	
	public Order() {
		super();
	}

	public Order(int customerId, Date orderDate, String status, String comments) {
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.status = status;
		this.comments = comments;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	@Override
	public String toString() {
		return "CustomerOrderDetails [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
				+ ", status=" + status + ", comments=" + comments + ", shippedDate=" + shippedDate + ", shipperId="
				+ shipperId + "]";
	}

	
}
