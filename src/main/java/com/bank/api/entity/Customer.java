package com.bank.api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class Customer implements Serializable {

	private static final long serialVersionUID = -7975233571986911985L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private long phoneNumber;
	private String emailId;
	private String propertyName;
	private String propertyType;
	private Long propertyValue;

	@OneToOne
	private Loan loan;
}
