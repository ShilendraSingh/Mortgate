package com.bank.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplyLoanRequestDto {

	private int loanId;
	private int customerId;
}
