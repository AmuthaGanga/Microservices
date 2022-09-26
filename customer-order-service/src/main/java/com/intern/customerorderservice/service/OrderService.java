package com.intern.customerorderservice.service;

import static com.intern.customerorderservice.constants.OrderConstants.CREATE_SUCCESS;
import static com.intern.customerorderservice.constants.OrderConstants.STATUS_CREATED;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intern.customerorderservice.entity.CustomResponse;
import com.intern.customerorderservice.entity.CustomerOrderDetails;
import com.intern.customerorderservice.entity.Order;
import com.intern.customerorderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private CustomerProxy customerProxy;
	
	public Order fetchOrderById(int orderId) {
		return repository.findById(orderId).get();
	}
	
	public List<Order> fetchOrdersByCustomerId(int customerId){
		return repository.findByCustomerId(customerId);
	}
	
	public ResponseEntity<CustomResponse> createOrder(Order order){
		Order savedOrder = repository.save(order);
		
		CustomResponse response = new CustomResponse(STATUS_CREATED, CREATE_SUCCESS, new Date(), savedOrder);
		ResponseEntity<CustomResponse> responseEntity = new ResponseEntity<CustomResponse>(response, null, HttpStatus.CREATED);
		
		return responseEntity;
	}

	public CustomerOrderDetails getCustomerOrderDetails(int customerId) {
		CustomerOrderDetails customerOrderDetails = customerProxy.retrieveCustomerDetails(customerId);
		double totalSpent = repository.getCustomerOrderDetails(customerId);
		customerOrderDetails.setAmountSpent(totalSpent);
		 
		return customerOrderDetails;
	}
}
