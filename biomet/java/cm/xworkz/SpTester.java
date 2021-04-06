package cm.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.xworkz.biomet.spring.BiometComponent;

public class SpTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlFileName="spr.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		BiometComponent refOfBiometComponent=spring .getBean(BiometComponent.class);
		refOfBiometComponent.Find("Finger print");

	}

}
