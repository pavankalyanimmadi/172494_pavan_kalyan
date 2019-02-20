package assignment6;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("pavan");
		list.add("kalyan");
		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
		

	}

}
