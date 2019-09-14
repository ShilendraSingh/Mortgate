package com.bank.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.api.dto.ApplyLoanRequestDto;
import com.bank.api.dto.ApplyLoanResponseDto;
import com.bank.api.dto.LoanDeatilsResponseDto;
import com.bank.api.entity.Customer;
import com.bank.api.entity.Loan;
import com.bank.api.repository.CustomerRepository;
import com.bank.api.repository.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Override
	public ApplyLoanResponseDto applyLoan(ApplyLoanRequestDto applyLoanRequestDto) {

		ApplyLoanResponseDto applyLoanResponseDto = new ApplyLoanResponseDto();
		Loan loan = loanRepository.findById(applyLoanRequestDto.getLoanId()).get();

		Customer cust = customerRepository.findById(applyLoanRequestDto.getCustomerId()).get();
		cust.setLoan(loan);
		customerRepository.save(cust);
		applyLoanResponseDto.setMessage("success");

		applyLoanResponseDto.setStatusCode(201);
		return applyLoanResponseDto;
	}

	@Override
	public LoanDeatilsResponseDto viewLoan(int customerId) {

		LoanDeatilsResponseDto loanDeatilsResponseDto=new LoanDeatilsResponseDto();
		Customer cust=customerRepository.findByCustomerId(customerId);
		
		Loan loan=cust.getLoan();
		BeanUtils.copyProperties(loan, loanDeatilsResponseDto);
		return loanDeatilsResponseDto;
	}

}
