package try1;

import java.util.Iterator;
import java.util.TreeSet;

import pojo.SavingsAccount;
import service.BankAccountList;

public class Test {

	public static void main(String[] args) {

		BankAccountList bl=new BankAccountList();
		
		
		SavingsAccount a1=new SavingsAccount(5000, 555,"XY",true);
		SavingsAccount a2=new SavingsAccount(5000, 222,"AB",true);
		SavingsAccount a3=new SavingsAccount(5000,666,"pQ",true);
		SavingsAccount a4=new SavingsAccount(5000, 444,"kiran",true);
		SavingsAccount a5=new SavingsAccount(5000, 777,"kiran",true);
		
		bl.addAccount(a1);
		bl.addAccount(a2);
		bl.addAccount(a3);
		bl.addAccount(a4);
		bl.addAccount(a5);
		
		TreeSet<SavingsAccount> accounts=bl.getAccounts();
		Iterator itr=accounts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}

	

	}

}
