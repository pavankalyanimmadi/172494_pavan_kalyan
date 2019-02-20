package assignment10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Trader;

public class Test10 {

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
		
		
		List<Trader> newList=list.stream().filter(e->e.getCity().equals("pune")).sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println("persons from pune soretd based on names");
        System.out.println("----------------------------------------------------");
		newList.stream().forEach(System.out::println);
		LocalDate.of(1996, 04, 01);
	}

}
