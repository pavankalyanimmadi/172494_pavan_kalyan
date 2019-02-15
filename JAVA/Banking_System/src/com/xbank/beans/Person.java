package com.xbank.beans;

import java.util.ArrayList;

public class Person {
	private String name;
	private String address;
	private String mobileNumber;
	private String emailId;
	private String userName;
	private String password;
	private ArrayList<Account> accounts;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public Person(String name, String address, String mobileNumber, String emailId, String userName, String password,Account account) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		accounts=new ArrayList<Account>();
		this.accounts.add(account);
	}
	
	
	
	

}
