package com.intern.customerorderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.intern.customerorderservice.constants.OrderConstants.*;

import com.intern.customerorderservice.entity.CustomerOrderDetails;

//@FeignClient(name="customer", url="localhost:9001")
@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerProxy {
	
	@GetMapping(GET_CUSTOMER_BY_ID)
	public CustomerOrderDetails retrieveCustomerDetails(@PathVariable int id);

}
