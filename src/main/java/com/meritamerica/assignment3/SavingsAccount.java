package com.meritamerica.assignment3;

public class SavingsAccount extends BankAccount{
	
	private double balance;
	private long accountNumber;
	private double interestRate;
	
	
	SavingsAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	public double futureValue(int year) {
		return balance * Math.pow(1 + 0.01, year);
	}

}
