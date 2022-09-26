package com.intern.customerservice.controller;

import static com.intern.customerservice.constants.CustomerConstants.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.customerservice.entity.CustomResponse;
import com.intern.customerservice.entity.Customer;
import com.intern.customerservice.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(GET_CUSTOMER_BY_ID)
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomerById(id);
	}
	
	@PostMapping(CREATE_NEW_CUSTOMER)
	public ResponseEntity<CustomResponse> saveCustomer(@RequestBody Customer customer){
		return service.createCustomer(customer);
	}
	
}
