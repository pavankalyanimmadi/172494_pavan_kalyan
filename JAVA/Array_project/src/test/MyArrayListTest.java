package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import pojo_classes.Employee;
import service.MyArrayList;

public class MyArrayListTest {
	public MyArrayList myArrayList;
	
	@Test
	public void addEmployeeValid() {
		myArrayList=new MyArrayList(9);
		Employee e1=new Employee(111,"pavan",2000);
		assertTrue(myArrayList.addEmployee(e1));
		
	}
	
	@Test
	public void addEmployeeInValid() {
		myArrayList=new MyArrayList(1);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		assertFalse(myArrayList.addEmployee(e2));
		
	}
	
	
	@Test
	public void deleteEmployee_empNotFound() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertEquals(0,myArrayList.deleteEmployee(333));
		
	}
	
	@Test
	public void deleteEmployee_empFoundDelete() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertEquals(1,myArrayList.deleteEmployee(111));
		
	}
	
	@Test
	public void deleteEmployee_NoEmpInList() {
		myArrayList=new MyArrayList(2);
		assertEquals(-1,myArrayList.deleteEmployee(111));
		
	}
	
	@Test
	public void updateSalaryValid() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertTrue(myArrayList.updateSalary(111, 5000));
		
	}
	
	@Test
	public void updateSalaryInValid() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertFalse(myArrayList.updateSalary(11, 5000));
		
	}
	
	@Test
	public void getEmployeeValid() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertTrue(myArrayList.getEmployee(111));
		
	}
	
	@Test
	public void getEmployeeInValid() {
		myArrayList=new MyArrayList(2);
		Employee e1=new Employee(111,"pavan",2000);
		Employee e2=new Employee(222,"kalyan",20000);
		myArrayList.addEmployee(e1);
		myArrayList.addEmployee(e2);
		assertFalse(myArrayList.getEmployee(333));
		
	}
	
	
	
	

}
