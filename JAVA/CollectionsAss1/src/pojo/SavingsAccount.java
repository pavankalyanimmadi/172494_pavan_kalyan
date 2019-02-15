package pojo;

public class SavingsAccount implements Comparable<SavingsAccount>{
	public SavingsAccount(double acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}

	
	@Override
	public String toString() {
		return "SavingsAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	
	private double acc_balance; 
	private int acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	
	
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void deposit(double amount) {
		setAcc_balance(amount+getAcc_balance());
		
	}
	
	public boolean withDraw(double amount) {
		if(amount<=getAcc_balance()) {
			setAcc_balance(getAcc_balance()-amount);
			return true;
		}
		return false;
		
		
	}

	@Override
	public int compareTo(SavingsAccount arg0) {
		if(acc_ID>arg0.getAcc_ID())
			return 1;
		else if(acc_ID<arg0.getAcc_ID())
			return -1;
		return 0;
	}

}
