package com.meritamerica.assignment3;

public class CDOffering {
	
	private static int term;
	private static double interestRate;
	
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getTerm() {
		return term;
	}

	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setTerm(int term) {
		this.term = term;
	}
	
	public static CDOffering readFromString(String str) {
		String holder = "";
		boolean hasComma = false;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == ',') {
				term = Integer.parseInt(holder);
				holder = "";
				hasComma = true;
			}
			else {
				
				holder = holder + ch;
				
			}
			
		}
		
		interestRate = Double.parseDouble(holder);
		if(hasComma == true) return new CDOffering(term, interestRate);
		else return null;
	}
}
