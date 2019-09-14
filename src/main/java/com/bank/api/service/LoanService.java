package com.bank.api.service;

import org.springframework.stereotype.Service;

import com.bank.api.dto.ApplyLoanRequestDto;
import com.bank.api.dto.ApplyLoanResponseDto;
import com.bank.api.dto.LoanDeatilsResponseDto;

@Service
public interface LoanService {

   public ApplyLoanResponseDto applyLoan(ApplyLoanRequestDto applyLoanRequestDto);
	
	public LoanDeatilsResponseDto viewLoan(int customerId);
}
