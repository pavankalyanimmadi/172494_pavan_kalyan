package assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;

public class Test {

	public static void main(String[] args) {
		Trader t1=new Trader("james","pune");
        Trader t2=new Trader("kiran","Indore");
        Trader t3=new Trader("revanth","guntur");
        Trader t4=new Trader("venu","new york");
        Trader t5=new Trader("ajay","Indore");
        Trader t6=new Trader("varma","chennai");
        Trader t7=new Trader("srikanth","pune");
		
		
		ArrayList<Trader> list=new ArrayList<Trader>();
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		List<String> indoreTraders=list.stream().filter(e->e.getCity().equals("Indore")).map(Trader::getName).collect(Collectors.toList());
        System.out.println("Traders from indore");
        System.out.println("---------------------------------------");
		if(indoreTraders.isEmpty())
        	System.out.println("there are no traders based in indore");
        else
        	indoreTraders.stream().forEach(System.out::println);
	}

}
