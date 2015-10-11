package com.psamp.account;

public class Account {
	String name;
	int id;
	double balance;
	boolean isNegative;
	
	Account(String n, int i, double b) {
		this.name = n; 
		this.balance = b;
		this.id = i;
	}
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	public double depositMoney(double mny) {
		this.balance += mny;
		return this.balance;
	}
	
	public double withdrawMoney(double mny) {
		double newBalance = this.balance - mny;
		return newBalance;
	}
	
	public boolean checkIfAccountIsInTheNegative() {
		if(this.balance < 0 ) {
		
			this.isNegative = true;
		
		} else {
			
			this.isNegative = false;
			
		}
		
		return this.isNegative;
	}
	
	public double payTaxes() {
		double taxes = this.balance * 6 / 100;
		
		this.balance = this.balance - taxes;
		
		return taxes;
	}
	
	public boolean canPayHouseMortgage() {
		
		boolean payMortgage;
		
		if(this.balance < 1100) {
			
			payMortgage = false;
			
		} else {
			
			payMortgage = true; 
		
		}
		
		return payMortgage;
	}
	
	public int getAccountID() {
		return this.id;
	}

}
