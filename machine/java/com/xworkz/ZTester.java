package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.machine.component.WashingMachine;

public class ZTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext container=new ClassPathXmlApplicationContext("wm.xml");
		WashingMachine refOfWashingMachine=container.getBean(WashingMachine.class);
		refOfWashingMachine.wash();
		

	}

}
