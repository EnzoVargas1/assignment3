package com.meritamerica.assignment3;

public abstract class BankAccount {
	
	private double balance;
	private long accountNumber;
	private double interestRate;
	private CDOffering cdOffering;
	
	
    BankAccount(double balance){
		
	}
	
	BankAccount(double balance, double interestRate){
		
	}
	
	BankAccount(double balance, double interestRate, java.util.Date accountOpenedOn){
		
	}
	
	BankAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn){
		
	}
	
	 BankAccount(CDOffering cdOffering, double balance){
		
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(double amount) {
		if(amount < 0 && amount < balance ) {
			balance+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public java.util.Date getOpenedOn(){
		return java.util.Date;
	}
	
	public static BankAccount readFromString(String accountData) {
		
	}
	
	public String writeToString() {
		
	}


	
	


}
