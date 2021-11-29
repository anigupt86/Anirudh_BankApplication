package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	
	//Create Objects
	private static Scanner sc = new Scanner(System.in);
	private static Customer customer = new Customer("GL00001234", "password123");
	private static Banking banking = new Banking();
	
	public static void main(String []args) {
		int amount;
		int choice;
		String recepientAccountNo;
		
		displayWelcomeMessage();
		
		if(isCredentialsOk()) {
			System.out.println("Successfully authenticate");
			displayMenu();
			
			do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
		
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the amount you want to deposit");
				amount = sc.nextInt();
				banking.deposit(amount);
				break;
			
			case 2:
				System.out.println("Enter the amount you want to withdraw");
				amount = sc.nextInt();
				banking.withdraw(amount);
				break;
				
			case 3:
				System.out.println("Enter the amount you want to transfer");
				amount = sc.nextInt();
				System.out.println("Enter the recepient accountNumber");
				recepientAccountNo = sc.next();
				banking.transfer(amount, recepientAccountNo);
				break;
				
				
				}
			
			}while(choice!=4);
		}
		
		else {
			System.out.println("Authentication failure");
		}
	}
	
	private static void displayMenu() {
		
		System.out.println("----------------");
		
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Logout");
		
		System.out.println("----------------");
		
		
	}
	
	private static void displayWelcomeMessage() {
		System.out.println("Welcome toGreatLearning Bank");
	}
	
	private static boolean isCredentialsOk() {
		System.out.println("Enter your Account Number:");
		String accountNo = sc.next();
		System.out.println(accountNo);
		
		System.out.println("Enter your Password:");
		String password = sc.next();
		System.out.println(password);
		
		return customer.getBankAccountNo().equals(accountNo) && customer.getPassword().equals(password);
		
	}

}
