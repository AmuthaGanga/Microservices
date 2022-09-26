package com.intern.customerorderservice.controller;

import static com.intern.customerorderservice.constants.OrderConstants.CREATE_NEW_ORDER;
import static com.intern.customerorderservice.constants.OrderConstants.GET_CUSTOMER_ORDER_DETAILS;
import static com.intern.customerorderservice.constants.OrderConstants.GET_ORDER_BY_ID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.customerorderservice.entity.CustomResponse;
import com.intern.customerorderservice.entity.CustomerOrderDetails;
import com.intern.customerorderservice.entity.Order;
import com.intern.customerorderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping(GET_ORDER_BY_ID)
	public Order getOrderById(@PathVariable int id) {
		return service.fetchOrderById(id);
	}
	
	@PostMapping(CREATE_NEW_ORDER)
	public ResponseEntity<CustomResponse> saveCustomer(@RequestBody Order order){
		return service.createOrder(order);
	}
	
	@GetMapping(GET_CUSTOMER_ORDER_DETAILS)
	public CustomerOrderDetails getCustomerOrderDetails(@PathVariable int id) {
		return service.getCustomerOrderDetails(id);
	}
}
