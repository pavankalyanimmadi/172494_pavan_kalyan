package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import pojo.Movie_Details;

public class Movie_DetailsList {
	ArrayList<Movie_Details> movie_list;
	
	
	public Movie_DetailsList() {
		movie_list=new ArrayList<>();
		
		
	}
	
	public void add_Movie(Movie_Details m) {
		
		movie_list.add(m);
	}
	
	public void remove_Movie(String movie_name) {
		for(Movie_Details m:movie_list) {
			if(m.getMov_Name().equals(movie_name)) {
				movie_list.remove(m);
			    break;
			}
				
		}
	}
	
	public void remove_All() {
		movie_list.clear();
	}
	
	public Movie_Details find_movie_By_mov_Name(String movie_name){
		Movie_Details m=null;
		for(Movie_Details movie:movie_list) {
			if(movie.getMov_Name().equals(movie_name)) {
				m=movie;
			}
				
		}
		
		return m;
		
	}
	
	
	public ArrayList<Movie_Details> find_movie_By_Genre(String genre){
		ArrayList<Movie_Details> movies=new ArrayList<>();
		for(Movie_Details movie:movie_list) {
			if(movie.getGenre().equals(genre))
				movies.add(movie);
		}
		
		return movies;
		
	}
	
	public ArrayList<Movie_Details> sort_movies(String type){
		if(type.equals("movie_name")) {
			Collections.sort(movie_list,new Comparator<Movie_Details>() {
				@Override
				public int compare(Movie_Details m1, Movie_Details m2) 
				{
					return m1.getMov_Name().compareTo(m2.getMov_Name());
				}
			});
		}
		
		else if(type.equals("lead_actor")) {
			Collections.sort(movie_list,new Comparator<Movie_Details>() {
				@Override
				public int compare(Movie_Details m1, Movie_Details m2) 
				{
					return m1.getLead_actor().compareTo(m2.getLead_actor());
				}
			});
			
		}
		
		else if(type.equals("lead_actories")) {
			Collections.sort(movie_list,new Comparator<Movie_Details>() {
				@Override
				public int compare(Movie_Details m1, Movie_Details m2) 
				{
					return m1.getLead_actories().compareTo(m2.getLead_actories());
				}
			});
			
		}
		
		else if(type.equals("genre")) {
			Collections.sort(movie_list,new Comparator<Movie_Details>() {
				@Override
				public int compare(Movie_Details m1, Movie_Details m2) 
				{
					return m1.getGenre().compareTo(m2.getGenre());
				}
			});
			
		}
		
		
		
		return movie_list;
		
		
		
	}
	
	public ArrayList<Movie_Details> get_moviesList(){
		return movie_list;
	}
	
	
	

}
