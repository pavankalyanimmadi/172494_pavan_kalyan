package assignment9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import pojo.Trader;
import pojo.Transaction;

public class Test9 {

	public static void main(String[] args) {
        Trader t1=new Trader("james","new york");
        Trader t2=new Trader("kiran","banglore");
        Trader t3=new Trader("revanth","guntur");
        Trader t4=new Trader("james","new york");
		
		
		ArrayList<Trader> list=new ArrayList<Trader>();
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		List<String> cities=list.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
	    System.out.println("unique cities are");
	    System.out.println("--------------------------------");
		cities.forEach(System.out::println);
	}

}
