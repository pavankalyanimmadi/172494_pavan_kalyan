package Test;

import java.util.Scanner;

import pojo.Movie_Details;
import service.Movie_DetailsList;

public class Movie_Details_list_Test {

	public static void main(String[] args) {
		
		Movie_DetailsList ml=new Movie_DetailsList();
		
		Movie_Details m1=new Movie_Details("Badri","power star","renu desai","romantic comedy");
		Movie_Details m2=new Movie_Details("indra","mega star","sonali","factionism");
		Movie_Details m3=new Movie_Details("magadheera"," mega power star","kajal","love historical");
		Movie_Details m4=new Movie_Details("pokiri","super star","ileyana","mass");
		Movie_Details m5=new Movie_Details("Bahubali","prabhas","anushka","periodic war");
		
		ml.add_Movie(m1);
		ml.add_Movie(m2);
		ml.add_Movie(m3);
		ml.add_Movie(m4);
		ml.add_Movie(m5);
		
		
		ml.remove_Movie("Bahubali");
		
		System.out.println(ml.get_moviesList());
	
		
		
		
		System.out.println(ml.sort_movies("lead_actor"));
		
		
		
		
	}

}
