package com.xbank.beans;

import java.util.ArrayList;

public class Account {
	
	private static int counter=1;
	private String accountNumber;
	private String accountType;
	private double accountBalance;
	private ArrayList<Transaction> transactions;
	
	
	public Account(String accountType, double accountBalance) {
		super();
		this.accountNumber="00000000000"+counter;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		transactions=new ArrayList<Transaction>();
		counter++;
	}
	public  String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	

}
