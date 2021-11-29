package com.greatlearning.model;

public class Customer {
	
	//DataMembers
	private String bankAccountNo;
	private String password;
	
	//Define Constructor
	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo = bankAccountNo;
		this.password = password;
		
	}
	
	//Create getters and setters
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountno(String bankAccountNo) {
		this.bankAccountNo  = bankAccountNo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password  = password;
	}

}
