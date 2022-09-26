package com.intern.customerservice.constants;

import org.springframework.stereotype.Component;

@Component
public class CustomerConstants {

	public CustomerConstants() {
		
	}
	
	public static final String GET_CUSTOMER_BY_ID = "/customers/getCustomerById/{id}";
	
	public static final String CREATE_NEW_CUSTOMER = "/customers/saveCustomer";
	
	public static final String CREATE_SUCCESS = "Customer created successfully!!";
	
	public static final String STATUS_CREATED = "Created";

}
