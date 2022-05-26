package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		System.out.println("-------main starts--------");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Customer c1 = ctx.getBean("cust", Customer.class);
		System.out.println(c1);
		((ClassPathXmlApplicationContext) ctx).close();
		System.out.println("------main ends----------");
	}
}