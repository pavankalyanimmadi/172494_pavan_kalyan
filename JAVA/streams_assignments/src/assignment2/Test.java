package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Fruit;

public class Test {

	public static void main(String[] args) {
		Fruit f1=new Fruit("orange",70,100,"orange");
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
		
	List<Fruit> sortedList=	list.stream().sorted((x,y)->x.getColor().compareTo(y.getColor())).collect(Collectors.toList());
   
	sortedList.stream().forEach(System.out::println);
	
	}

}
