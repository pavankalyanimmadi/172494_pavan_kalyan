package com.xbank.services;

public interface XbankService {
	
	public boolean login(String userName,String password);
	public void printminiStatement();
	public void detailedTransactions();
	public boolean changeInAddress(String address);
	public boolean requestCheckBook();
	public String trackServiceRequest(int serviceNumber);
	public boolean fundTransfer(String toAccount,double amount);
	public boolean changePassword(String newPassword);
	public String createNewAccount(String name,String address,String mobileNumber,String emailId,String accountType,double openingBalance,String userName,String password);

	
	
	
	

}
  