package com.xbank.client;

import java.util.Scanner;

import com.xbank.services.XbankService;
import com.xbank.services.XbankServiceImpl;

public class Test {

	public static void main(String[] args) {
		System.out.println("                               welcome to HDFC bank                                 ");
		System.out.println("------------------------------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		XbankService service = new XbankServiceImpl();
		int i;
		do {
			System.out.println("select options");
			System.out.println("    1.New user");
			System.out.println("    2.Existed user");
			System.out.println("    3.Exit");
		    i=sc.nextInt();	
			
			switch(i) {
			case 1:System.out.println("enter your name");
			       String name=sc.next();
			       System.out.println("enter mobile number");
			       String mobileNumber=sc.next();
			       System.out.println("enter email id");
			       String emailId=sc.next();
			       System.out.println("enter address");
			       String address=sc.next();
			       System.out.println("give a user name");
			       String userName=sc.next();
			       System.out.println("give a password");
			       String password=sc.next();
			       System.out.println("opening Account choose account type");
			       System.out.println("    1.Savings Account");
			       System.out.println("    2.Current Account");
			       int j=sc.nextInt();
			       String accountType;
			       if(j==1)
			    	    accountType="Savings Account";
			       else
			    	   accountType="Current Account";
			       
			       System.out.println("opening Balance");
			       double openingBalance=sc.nextDouble();
			       
			       
			       
			       
			      String accountNumber= service.createNewAccount(name, address, mobileNumber, emailId, accountType, openingBalance, userName, password);
			      System.out.println("your Account number is :"+accountNumber);
			case 2:break;
			
			}
			
		}while(i!=3);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Thank you for using our services");
		System.out.println("------------------------------------------------------------------------------------");

	}

}
