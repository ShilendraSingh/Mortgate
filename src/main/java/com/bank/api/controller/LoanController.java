package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.dto.ApplyLoanRequestDto;
import com.bank.api.dto.ApplyLoanResponseDto;
import com.bank.api.dto.LoanDeatilsResponseDto;
import com.bank.api.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	 @PutMapping("/apply") 
	 public ResponseEntity<ApplyLoanResponseDto> applyLoan(@RequestBody ApplyLoanRequestDto applyLoanRequestDto) {
	  
	  
	  return new ResponseEntity<>(loanService.applyLoan(applyLoanRequestDto), HttpStatus.CREATED); }
	  
	  
	  @GetMapping("/search/{customerId}") 
	  public ResponseEntity<LoanDeatilsResponseDto> viewLoan(@PathVariable int customerId) {
	  
	  
	  return new ResponseEntity<>(loanService.viewLoan(customerId),HttpStatus.CREATED); }
	  

}
