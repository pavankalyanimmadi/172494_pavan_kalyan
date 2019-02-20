package assignment5;

import java.util.ArrayList;

import pojo.News;

public class Test5 {

	public static void main(String[] args) {
			News n1=new News(11,"kiran","revanth","Excellent good");
			News n2=new News(11,"akshay","venkatesh","Excellent but budget is budget too high");
			News n3=new News(11,"pavan","veeru","awesome article budget");
			
			ArrayList<News> list=new ArrayList<News>();
			list.add(n1);
			list.add(n2);
			list.add(n3);
			
			long x=list.stream().filter(n->n.getComment().contains("budget")).count();
			System.out.println("count of word budget in all news");
			System.out.println("------------------------------------");
			System.out.println(x);
			
			
			
			

	}

}
