package com.xbank.beans;

import java.util.Date;

public class Transaction {
	private static int counter=100;
	private  int transactionId;
	private String toAccount;
	private Date date;
	private double amount;
	
	public Transaction(String toAccount, Date date, double amount) {
		super();
		this.toAccount = toAccount;
		this.date = date;
		this.amount = amount;
		this.transactionId=counter;
		counter++;
		
		
	}
	
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setBalance(double balance) {
		this.amount = amount;
	}
	
	 

}
