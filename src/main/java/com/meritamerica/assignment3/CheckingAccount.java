package com.meritamerica.assignment3;

public class CheckingAccount extends BankAccount{

	private double balance;
	private long accountNumber;
	private double interestRate;

	CheckingAccount(double balance) {
		super(balance);
		this.balance  = balance;
		// TODO Auto-generated constructor stub
	}
	
	
	public double futureValue(int year) {
		return balance * Math.pow(1 + 0.0001, year);
	}
	

}
