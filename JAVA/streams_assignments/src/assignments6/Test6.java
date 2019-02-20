package assignments6;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import pojo.News;

public class Test6 {

	public static void main(String[] args) {
		News n1=new News(12,"kiran","revanth","Excellent good");
		News n2=new News(12,"akshay","pavan","Excellent but budget is budget too high");
		News n3=new News(12,"pavan","veeru","awesome article budget");
		
		News n4=new News(11,"kiran","pavan","abcd");
		News n5=new News(11,"kiran","venky","xyz");
		News n6=new News(13,"pavan","pavan","pqr");
		
		
		
		
		
		ArrayList<News> list=new ArrayList<News>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		list.add(n6);
		
		 Map<String, Long> counting = list.stream().collect(
	                Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		 
		long max=0;
		String commentedUser=null;
		 for(Map.Entry<String, Long>  x:counting.entrySet()) {
			 if(max<x.getValue()) {
				 max=x.getValue();
				 commentedUser=x.getKey();
				 
			 }
			 
			
		}
		System.out.println("user has posted maximum comments");
		System.out.println("-----------------------------------------------------");
		 System.out.println(commentedUser);
		 

	}

}
