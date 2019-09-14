package com.bank.api.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import com.bank.api.dto.CustomerRequestdto;
import com.bank.api.dto.CustomerResponsedto;
import com.bank.api.entity.Loan;
import com.bank.api.repository.CustomerRepository;
import com.bank.api.repository.LoanRepository;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {

	@Mock
	private CustomerRepository customerRepository;

	@Mock
	private LoanRepository loanRepository;

	@InjectMocks
	private CustomerServiceImpl customerServiceImpl;

	@Test
	public void testRegister() {

		List<Loan> loanList = new ArrayList<>();
		Loan loan = new Loan();
		loan.setLoadAmount(0.0);
		loan.setLoadId(1);
		loan.setLoanEMI(1);
		loan.setLoaninterestrate(1);
		loan.setLoantenure(1);
		loanList.add(loan);
		Mockito.when(loanRepository.findByLoadAmountLessThanEqual(Mockito.anyDouble())).thenReturn(loanList);

		CustomerRequestdto customerRequestdto = new CustomerRequestdto();
		customerRequestdto.setDob("");
		customerRequestdto.setEmailId("");
		customerRequestdto.setFirstName("");
		customerRequestdto.setGender("");
		customerRequestdto.setLastName("");
		customerRequestdto.setPhoneNumber(1L);
		customerRequestdto.setPropertyName("");
		customerRequestdto.setPropertyType("");
		customerRequestdto.setPropertyValue(1L);
		CustomerResponsedto actual = customerServiceImpl.register(customerRequestdto);
		assertEquals(1, actual.getLoanList().size());
	}

	@Test
	public void testApplyLoan() {

	}

	@Test
	public void testViewLoan() {

	}
}
