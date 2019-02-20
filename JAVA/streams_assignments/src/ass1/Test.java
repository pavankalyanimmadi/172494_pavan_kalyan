package ass1;

import java.util.ArrayList;
import java.util.Comparator;
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
		
		Comparator<Fruit> c=(x,y)->{
			if(x.getCalories()>y.getCalories())
				return 1;
			else if(x.getCalories()>y.getCalories())
				return -1;
			else
				return 0;
			
		};
		
		List<Fruit> sortedList=list.stream().filter(e->e.getCalories()<100).sorted(c).collect(Collectors.toList());
		
		sortedList.stream().forEach(System.out::println);
		

	}

}
