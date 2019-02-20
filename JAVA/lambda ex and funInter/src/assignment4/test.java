package assignment4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class test {
	public static void main(String[] args) {
		Predicate<String> p=(s)->{
			if(s.length()%2==0)
				return false;
			else
				return true;
		};
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("oddi");
		list.add("even");
		list.add("odd");
		list.add("even");
		
		list.removeIf(e->e.length()%2!=0);
		
		System.out.println(list);
		
	}
	

}
