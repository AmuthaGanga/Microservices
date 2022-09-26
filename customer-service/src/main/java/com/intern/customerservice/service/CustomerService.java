package com.intern.customerservice.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intern.customerservice.entity.CustomResponse;
import com.intern.customerservice.entity.Customer;
import com.intern.customerservice.repository.CustomerRepository;

import static com.intern.customerservice.constants.CustomerConstants.*;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public Customer getCustomerById(int customerId){
		Optional<Customer> customer = repository.findById(customerId);
		
		return customer.get();
	}
	
	public ResponseEntity<CustomResponse> createCustomer(Customer customer){
		Customer savedCustomer = repository.save(customer);
		
		CustomResponse response = new CustomResponse(STATUS_CREATED, CREATE_SUCCESS, new Date(), savedCustomer);
		ResponseEntity<CustomResponse> responseEntity = new ResponseEntity<CustomResponse>(response, null, HttpStatus.CREATED);
		
		return responseEntity;
	}

}
