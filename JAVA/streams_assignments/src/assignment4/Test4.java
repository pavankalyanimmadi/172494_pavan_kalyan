package assignment4;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import pojo.News;

public class Test4 {

	public static void main(String[] args) {
		News n1=new News(12,"kiran","revanth","Excellent good");
		News n2=new News(12,"akshay","venkatesh","Excellent but budget is budget too high");
		News n3=new News(12,"pavan","veeru","awesome article budget");
		
		News n4=new News(11,"kiran","pavan","abcd");
		News n5=new News(11,"kiran","venky","xyz");
		News n6=new News(13,"pavan","veeru","pqr");
		
		
		
		
		
		ArrayList<News> list=new ArrayList<News>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		
		 Map<Integer, Long> counting = list.stream().collect(
	                Collectors.groupingBy(News::getNewsId, Collectors.counting()));
		 
		long max=0;
		Integer newsId=0;
		 for(Map.Entry<Integer, Long>  x:counting.entrySet()) {
			 if(max<x.getValue()) {
				 max=x.getValue();
				 newsId=x.getKey();
				 
			 }
			 
			
		}
		System.out.println("newsId which has received maximum comments");
		System.out.println("-----------------------------------------------------");
		 System.out.println(newsId);
		 

	}

}
