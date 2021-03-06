package com.psamp.account;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTests {
	
	Account account;
	
//	Note that this object will be created before every single test. The effects of methods called inside each test won't carry over.
	
	@Before 
	public void beforeTests() {
		account = new Account("Lorem Ipsum", 1, 3000);
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
	
	@Test
	public void testGetAccountID() {
		int expected = 1;
		int actual = account.getAccountID();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUpdateName() {
		String expected = "Lorem Ipsum-Dolor";
		String actual = account.updateName("Lorem Ipsum-Dolor");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSaveMoney() {
		double expected = 30;
		double actual = account.saveMoney(30);
		double delta = .001;;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testGetSavings() {
		double expected = 0;
		double actual = account.getSavings();
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

}