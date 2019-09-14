package com.bank.api.service;

import org.springframework.stereotype.Service;


import com.bank.api.dto.CustomerRequestdto;
import com.bank.api.dto.CustomerResponsedto;


@Service
public interface CustomerService {

	public CustomerResponsedto register(CustomerRequestdto customerRequestdto);
	
	

}
