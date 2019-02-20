package assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;

public class Test11 {

	public static void main(String[] args) {
		Trader t1=new Trader("james","pune");
        Trader t2=new Trader("kiran","banglore");
        Trader t3=new Trader("revanth","guntur");
        Trader t4=new Trader("venu","new york");
        Trader t5=new Trader("ajay","pune");
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
		
		String names=list.stream().map(Trader::getName).sorted().collect(Collectors.joining(","));
        System.out.println("String of names soretd order");
        System.out.println("--------------------------------------");
        System.out.println(names);
		
	}

}
