package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer customer=context.getBean("customer",Customer.class);
		customer.displayCustomerInfo();
	
	}

}
