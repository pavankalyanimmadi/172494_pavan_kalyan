package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Fruit;

public class Test {

	public static void main(String[] args) {
		Fruit f1=new Fruit("pomogranate",70,100,"red");
		Fruit f2=new Fruit("Apple",150,200,"red");
		Fruit f3=new Fruit("guava",60,50,"green");
		Fruit f4=new Fruit("banana",10,20,"yellow");
		Fruit f5=new Fruit("pine apple",200,400,"yellow");
		ArrayList<Fruit> list=new ArrayList<Fruit>();
		
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(f5);
		
		List<Fruit> sortedList=list.stream().filter(x->x.getColor().equals("red")).sorted((x,y)->x.getPrice().compareTo(y.getPrice())).collect(Collectors.toList());

		sortedList.forEach(System.out::println);
	}

}
