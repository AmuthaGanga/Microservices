package com.intern.customerorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderServiceApplication.class, args);
	}

}
