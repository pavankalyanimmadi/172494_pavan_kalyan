package assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;
import pojo.Transaction;

public class Test8 {

	public static void main(String[] args) {
		Trader t=new Trader("james","new york");
		
		Transaction tr1=new Transaction(t,2011,100000);
		Transaction tr2=new Transaction(t,2002,100000);
		Transaction tr3=new Transaction(t,2011,300000);
		Transaction tr4=new Transaction(t,2009,50000);
		Transaction tr5=new Transaction(t,2009,75000);
		Transaction tr6=new Transaction(t,2011,30000);
		
		ArrayList<Transaction> list=new ArrayList<Transaction>();
		
		list.add(tr1);
		list.add(tr2);
		list.add(tr3);
		list.add(tr4);
		list.add(tr5);
		list.add(tr6);
		
		List<Transaction> filterdList=list.stream().filter(y->y.getYear()==2011).sorted((x,y)->x.getValue().compareTo(y.getValue())).collect(Collectors.toList());
		
		filterdList.stream().forEach(System.out::println);
		

	}

}
