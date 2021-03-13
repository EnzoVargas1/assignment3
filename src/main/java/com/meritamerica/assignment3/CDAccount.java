package com.meritamerica.assignment3;

public class CDAccount extends BankAccount{
	
	private CDOffering cdOffering;
	private double balance;
	
	CDAccount(CDOffering cdOffering, double balance) {
		super(cdOffering, balance);
		// TODO Auto-generated constructor stub
		this.cdOffering = cdOffering;
		this.balance = balance;
	}
	
	public boolean deposit(double amount) {
		return false;
	}
	
	public boolean withdraw(double amount) {
		return false;
	}
	
	public double futureValue() {
		return balance * Math.pow(1 + cdOffering.getInterestRate(), cdOffering.getTerm());
	}

	

}
