package com.bank.api.entity;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class Loan implements Serializable {
	
	private static final long serialVersionUID = 7307436302352891448L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loadId;
	private double loadAmount;
	private int loantenure;
	private int loaninterestrate;
	private int loanEMI;
	
	}
