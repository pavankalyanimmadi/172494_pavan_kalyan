package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Customer;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	Customer c=(Customer)context.getBean("customer");
	System.out.println(c);
	

	}

}
