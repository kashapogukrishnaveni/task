package com.xworkz.labour;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.labour.bean.Labour;



public class Tester {

	public static void main(String[] args) {
		
		try {
			String xmlConfigPath = "spring.xml";
			
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			
			Labour refLabour = container.getBean(Labour.class);
			refLabour.work();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
