package com.xworkz;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springg.ITCComponent;

public class StTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		 
		
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("springg.xml");
		ITCComponent refOfITCComponent=container.getBean(ITCComponent.class);
		refOfITCComponent.display();

	}

}
