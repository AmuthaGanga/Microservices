package com.intern.customerorderservice.constants;

import org.springframework.stereotype.Component;

@Component
public class OrderConstants {

	public OrderConstants() {
		
	}
	
	public static final String GET_ORDER_BY_ID = "/orders/getOrderById/{id}";
	
	public static final String GET_ORDERS_BY_CUSTOMER_ID = "/orders/getOrdersByCustomerId/{id}";
	
	public static final String GET_CUSTOMER_ORDER_DETAILS = "/orders/getCustomerOrderDetails/{id}";
	
	public static final String GET_CUSTOMER_BY_ID = "/customers/getCustomerById/{id}";
	
	public static final String CREATE_NEW_ORDER = "/orders/saveOrder";
	
	public static final String CREATE_SUCCESS = "Order created successfully!!";
	
	public static final String STATUS_CREATED = "Created";

}
