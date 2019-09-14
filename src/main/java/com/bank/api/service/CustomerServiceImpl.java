package com.bank.api.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bank.api.dto.CustomerRequestdto;
import com.bank.api.dto.CustomerResponsedto;

import com.bank.api.entity.Customer;

import com.bank.api.repository.CustomerRepository;
import com.bank.api.repository.LoanRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public CustomerResponsedto register(CustomerRequestdto customerRequestdto) {
		double amount = 0.0;
		Customer customer = new Customer();

		CustomerResponsedto customerResponsedto = new CustomerResponsedto();

		BeanUtils.copyProperties(customerRequestdto, customer);
		

		/*
		 * customer.setDob(customerRequestdto.getDob());
		 * customer.setEmailId(customerRequestdto.getEmailId());
		 * customer.setFirstName(customerRequestdto.getFirstName());
		 * customer.setGender(customerRequestdto.getGender());
		 * customer.setLastName(customerRequestdto.getLastName());
		 * customer.setPhoneNumber(customerRequestdto.getPhoneNumber());
		 * customer.setPropertyName(customerRequestdto.getPropertyName());
		 * customer.setPropertyType(customerRequestdto.getPropertyType());
		 * customer.setPropertyValue(customerRequestdto.getPropertyValue());
		 */
		
		customerRepository.save(customer);

		amount = customerRequestdto.getPropertyValue() * 0.8;
		customerResponsedto.setLoanList(loanRepository.findByLoadAmountLessThanEqual(amount));

		customerResponsedto.setMessgae("Customer has been registred ");
		customerResponsedto.setStatusCode(201);

		return customerResponsedto;
	}

	}
