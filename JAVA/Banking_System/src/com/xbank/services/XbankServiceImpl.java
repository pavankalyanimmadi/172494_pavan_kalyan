package com.xbank.services;

import com.xbank.beans.Account;
import com.xbank.beans.Person;

public class XbankServiceImpl implements XbankService {

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto
		return false;
	}

	@Override
	public void printminiStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detailedTransactions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean changeInAddress(String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean requestCheckBook() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String trackServiceRequest(int serviceNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fundTransfer(String toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createNewAccount(String name, String address, String mobileNumber, String emailId, String accountType,
		double openingBalance, String userName, String password) {
		Account account=new Account(accountType,openingBalance);
		Person person=new Person(name,address,mobileNumber,emailId,userName,password,account);
		return account.getAccountNumber();
	}

}
