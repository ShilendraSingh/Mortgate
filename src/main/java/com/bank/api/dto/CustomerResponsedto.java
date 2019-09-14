package com.bank.api.dto;

import java.util.List;

import com.bank.api.entity.Loan;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CustomerResponsedto {
	private String messgae;
	private int statusCode;
	
	private List<Loan> loanList;
	
}