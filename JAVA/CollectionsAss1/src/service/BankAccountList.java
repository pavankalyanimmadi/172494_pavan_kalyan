package service;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import pojo.SavingsAccount;

public class BankAccountList {
	TreeSet<SavingsAccount> accounts;
	
	public  BankAccountList() {
		accounts=new TreeSet<SavingsAccount>();
	}
	
	public void addAccount(SavingsAccount account) {
		accounts.add(account);
		
	}
	
	public void removeAccount(SavingsAccount account) {
		accounts.remove(account);
		
	}
	
	public TreeSet<SavingsAccount> getAccounts(){
		return accounts;
	}

}
