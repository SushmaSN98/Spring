package com.xworkz;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springg.RocketComponent;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlFileName="springg.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		
		RocketComponent refOfRocket=spring.getBean(RocketComponent.class);
		refOfRocket.launch();
		
	    

	}

}
