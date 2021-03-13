package com.meritamerica.assignment3;

import java.util.*;




public class AccountHolder implements Comparable <AccountHolder> {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	
	private ArrayList <CheckingAccount> checkingAccounts;
	private ArrayList <SavingsAccount> savingsAccounts;
	private ArrayList<CDAccount>cdAccounts;
	
	

	AccountHolder(String firstName, String middleName, String lastName, String ssn){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		
		checkingAccounts = new ArrayList<CheckingAccount>();
		savingsAccounts = new ArrayList<SavingsAccount>();
		cdAccounts = new ArrayList<CDAccount>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setMiddleName(String name) {
		this.middleName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getSSN() {
		return this.ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
    public CheckingAccount addCheckingAccount(double openingBalance) {
    	
    	checkingAccounts.add(new CheckingAccount(openingBalance));
    	return checkingAccounts.get(checkingAccounts.size()-1);
    	
    }
    
   public SavingsAccount addSavingsAccount(double openingBalance) {
    	
    	savingsAccounts.add(new SavingsAccount(openingBalance));
    	return savingsAccounts.get(savingsAccounts.size()-1);
    	
    }
   
   public CDAccount addCDAccount(CDOffering offering, double amount) {
   	
   	cdAccounts.add(new CDAccount(offering, amount));
   	return cdAccounts.get(cdAccounts.size()-1);
   	
   }
		
		
	public ArrayList <CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;
	}
	
	public int getNumberOfCheckingAccounts() {
		return checkingAccounts.size();
	}
	
	public int getNumberOfCDAccounts() {
		return cdAccounts.size();
	}
	
	public int getNumberOfSavingsAccounts() {
		return savingsAccounts.size();
	}
	
	
	
	
	@Override
	public int compareTo(AccountHolder o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
