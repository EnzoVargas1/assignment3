package com.meritamerica.assignment3;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		try {
			MeritBank.readFromFile("assignment3/src/test/testMeritBank_good.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}