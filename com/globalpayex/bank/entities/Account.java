package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.MinBalanceNotMaintainedException;

public class Account {
	
	int amount;
	String Accountnumber;
	String AccountType;
	
	public Account(int amount, String Accountnumber, String AccountType) {
		this.amount = amount;
		this.Accountnumber = Accountnumber;
		this.AccountType = AccountType;
	}
	
	public int deposit(int balance) {
		this.amount += balance;
		
		return this.amount;
	}
	
	public int withdraw(int amount) throws MinBalanceNotMaintainedException{
		
		System.out.println("Transaction starts...");
		try {
			if(amount<=0)
			{
				throw new IllegalArgumentException("amount cannot be negative or zero");
			}
			
			if(this.amount-amount < 1000) {
				
				//throw an exception to the caller.
				//check the scenario before throwing a custom exception
				//IllegalStateException
				
				//throw new IllegalStateException("Balance cannot go below 1000");
				throw new MinBalanceNotMaintainedException("Balance cannot go below 1000");
				
			}
			this.amount -= amount;
			return this.amount;
		}finally {
			System.out.println("Transaction ends...");
		}
				
	}			

}
