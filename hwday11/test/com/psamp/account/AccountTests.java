package com.psamp.account;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTests {
	
	Account account;
	
	@Before public void beforeTests() {
		account = new Account("Lorem Ipsum", 3000);
	}

	@Test
	public void testGetBalance() {
		double expected = 3000;
		double actual = account.getBalance();
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testDepositMoney() {
		double expected = 3100;
		double actual = account.depositMoney(100);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testWithdrawMoney() {
		double expected = 2800;
		double actual = account.withdrawMoney(200);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testCheckIfAccountIsInTheNegative() {
		boolean expected = false;
		boolean actual = account.checkIfAccountIsInTheNegative();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPayTaxes() {
		double expected = 180;
		double actual = account.payTaxes();
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	
	@Test
	public void testCanPayHouseMortgage() {
		boolean expected = true;
		boolean actual = account.canPayHouseMortgage();
		
		assertEquals(expected, actual);
	}

}
