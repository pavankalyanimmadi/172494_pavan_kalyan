package test;

import pojo_classes.Employee;
import service.MyArrayList;

public class Test {

	public static void main(String[] args) {
		MyArrayList l=new MyArrayList(9);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",10000);
		Employee e3=new Employee(333,"immadi",20000);
		l.addEmployee(e2);
		l.addEmployee(e3);
		boolean conf=l.addEmployee(e1);
		if(conf)
			System.out.println("employee addedd successfully");
		else
			System.out.println("failed to add employess");
		
		l.showAllEmployee();
		l.getEmployee(222);
		
		
		
		
		
		int x=l.deleteEmployee(1111);
		if(x==-1)
			System.out.println("there are no employees to delete");
		else if(x==0)
			System.out.println("employee not found with given id");
		else
			System.out.println("employee deleted successfully");
		
		
		
		l.updateSalary(111,18000);
		l.showAllEmployee();
		

	}

}
