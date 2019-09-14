package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.dto.CustomerRequestdto;
import com.bank.api.dto.CustomerResponsedto;

import com.bank.api.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/apply")
	public ResponseEntity<CustomerResponsedto> register(@RequestBody CustomerRequestdto customerRequestdto) {

		return new ResponseEntity<>(customerService.register(customerRequestdto), HttpStatus.CREATED);

	}

	
	
	 

}
