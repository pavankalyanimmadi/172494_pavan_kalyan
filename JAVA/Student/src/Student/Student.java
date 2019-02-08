package Student;

import java.util.Arrays;

public class Student {
	
	private String name;
	private String address;
	private int numcourses;
	private String[] courses;
	private Integer[] grades;
   
	
	public Student(String name,String address) {
		this.name=name;
		this.address=address;
		this.grades=new Integer[30];
		this.courses=new String[30];
		numcourses=0;
		
	}
   
	

   @Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}



public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}
	
	public void addCourseGrade(String course,int grade) {
		
		this.courses[numcourses]=course;
		this.grades[numcourses]=grade;
		numcourses++;
		
	}
	
	public void printGrades() {
		System.out.println(name);
		for(int i=0;i<numcourses;i++) {
			System.out.println(courses[i]+":"+grades[i]);
			
		}
		
	}
	
	public double getaAvarageGrade() {
		int sum=0;
		for(int i=0;i<numcourses;i++) {
			sum+=grades[i];
		}
		return sum/numcourses;

		
	}
	
	

}
