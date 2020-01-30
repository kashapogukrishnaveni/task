package com.xworkz.rocket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.rocket.bean.Rocket;

public class Tester {

	public static void main(String[] args) {
		
		try {
			String xmlConfigPath = "spring.xml";
			
			ApplicationContext container = new ClassPathXmlApplicationContext(xmlConfigPath);
			
			Rocket ref = container.getBean(Rocket.class);
			ref.launch();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
