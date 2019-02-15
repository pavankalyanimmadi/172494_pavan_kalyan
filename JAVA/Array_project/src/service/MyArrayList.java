package service;

import pojo_classes.Employee;

public class MyArrayList {
	private  Employee[] employees;
	private int top=-1;
	private int size;
	
	public MyArrayList(int n) {
		size=n;
		employees=new Employee[n];
	}
	
	public boolean addEmployee(Employee e) {
		if(!isFull()) {
			top++;
			employees[top]=e;
			return true;
		}
		else
			return false;
		
	}
	
	public int deleteEmployee(int empId) {
		int index=-1;
		int temp=-1;
		if(!isEmpty()) {
			for(int i=0;i<=top;i++) {
				if(employees[i].getEmpId()==empId)
					index=i;
			}
			if(index!=-1) {
				for(int i=index;i<top;i++) {
					employees[i]=employees[i+1];
					
					
				}
				temp=1;
				top--;
				
			}
			else
			   temp=0;
					
			
		}
		return temp;
		
	}
	
	public boolean isFull() {
		if(top==size-1)
			return true;
		else
			return false;
		
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else 
			return false;
	}
	
	public void showAllEmployee() {
		for(int i=0;i<=top;i++) {
			System.out.println(employees[i].getEmpId()+"  "+employees[i].getName()+"  "+employees[i].getEmpSal());
			
		}
	}
	
	public boolean getEmployee(int empId) {
		for(int i=0;i<=top;i++) {
			if(employees[i].getEmpId()==empId) {
				System.out.println(employees[i].getEmpId()+"  "+employees[i].getName()+"  "+employees[i].getEmpSal());
				return true;
				
			}
			
			
		}
		return false;
	}
	
	public boolean updateSalary(int empId,double salary) {
		for(int i=0;i<=top;i++) {
			if(employees[i].getEmpId()==empId) {
				employees[i].setEmpSal(salary);
				return true;
			}
			
			
		}
		return false;
		
		
	}
	

	

}
