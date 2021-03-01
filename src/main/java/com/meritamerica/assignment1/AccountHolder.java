package com.meritamerica.assignment1;


public class AccountHolder {
	private String myFirstName;
	private String myMiddleName;
	private String myLastName;
	private String mySsn;
	private CheckingAccount myCheckingAccount;
	private SavingsAccount mySavingAccount;
	
	public AccountHolder() {
		myFirstName = "";
		myMiddleName = "";
		myLastName =  "";
		mySsn = "";
		myCheckingAccount = new CheckingAccount(0.0);
		mySavingAccount = new SavingsAccount(0.0);
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingAccountOpeningBalance) {
		myFirstName = firstName;
		myMiddleName = middleName;
		myLastName = lastName;
		mySsn = ssn;
		myCheckingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		mySavingAccount = new SavingsAccount(savingAccountOpeningBalance);
	}
	
	//returns account holder first name
	
	public String getFirstName() {
		return myFirstName;
	}
	
	public void setFirstName(String firstName) {
		myFirstName = firstName;
	}
	
	public String getMiddleName(String middleName) {
		return myMiddleName;
	}
	
	public void setMiddleName(String middleName) {
		myMiddleName = middleName;
	}
	public String getLastName() {
		return myLastName;
	}
	
	public void setLastName(String lastName) {
		myLastName = lastName;
	}
	
	public String getSSN() {
		return mySsn;
	}
	
	public void setSSN(String ssn) {
		mySsn = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return myCheckingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return mySavingAccount;
	}
	
	public String toString(){
		return "Name: " + myFirstName + " " + myMiddleName + " " + myLastName + "\n" +
			"SSN: " + mySsn + "\n" + "\n" +
			myCheckingAccount.toString() +
			mySavingAccount.toString();
					
	}

	
}