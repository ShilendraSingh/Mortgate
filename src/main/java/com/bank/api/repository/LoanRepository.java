package com.bank.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.api.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
	
	public List<Loan> findByLoadAmountLessThanEqual(double amount );

	
	

}
