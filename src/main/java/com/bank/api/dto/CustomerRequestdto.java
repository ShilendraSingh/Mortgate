package com.bank.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
public class CustomerRequestdto {
	
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private long phoneNumber;
	private String emailId;
	private String propertyName;
	private String propertyType;
	private Long propertyValue;
}
