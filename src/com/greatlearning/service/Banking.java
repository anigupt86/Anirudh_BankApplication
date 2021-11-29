package com.greatlearning.service;
import java.util.Scanner;

public class Banking {

	private int balance = 10000;
	private static Scanner sc = new Scanner(System.in);
	
	public void deposit(int amount) {
		if(amount>0) {
			balance = balance+ amount;
			System.out.println("Successfully added Rs. "+ amount+  "Your balance is now Rs." + balance);
		}
	}
	
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Insufficient Balance");
			return;
			
		}
		
		balance = balance - amount;
		System.out.println("Successfully withdrawn Rs. "+ amount+  "Your balance is now Rs." + balance);
	}
	
	public void transfer(int amount, String recipinetbankAccountNo) {
		
		int generatedOtp = OtpGenerator.generateOtp();
		
		System.out.println("OTP is"+ generatedOtp);
		
		System.out.println("Please enter Otp");
		
		int enteredOtp = sc.nextInt();
		
		if(generatedOtp != enteredOtp) {
			System.out.println("Not Authorised");
			return;
			
		}
		
		if(amount>balance) {
			System.out.println("Insufficient Balance");
			return;
			}
		balance = balance - amount;
		System.out.println("Successfully transferred  Rs. "+ amount+  "Your balance is now Rs." + balance);
	}
	
	
}
