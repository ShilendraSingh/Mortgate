package com.bank.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.api.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByCustomerId(Integer customerId);
	// public Customer findByPhoneNumber(Long number);

}
