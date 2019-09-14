package com.bank.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDeatilsResponseDto {

	
	private int loadId;
	private double loadAmount;
	private int loantenure;
	private int loaninterestrate;
	private int loanEMI;
}
