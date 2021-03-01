package com.meritamerica.assignment1;

public class SavingsAccount extends CheckingAccount {
		
		public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

		private static final double ANNUAL_INTEREST_RATE =  0.01;
		
        double fv = 100.0 * Math.pow(1 + 0.01, 3);

		
		public String toString(){
			return "Savings Account Balance: $" + currentBalance + "\n" +
				"Savings Account Interest Rate: " + ANNUAL_INTEREST_RATE*100 + "\n" +
				"Savings Account Balance in 3 years: $" + futureValue(3) + "\n";		
		}

	
}