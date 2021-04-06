package cm.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.xworkz.biomet.spring.BiometComponent;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  spring=new ClassPathXmlApplicationContext("");
		BiometComponent biom=new BiometComponent();
		biom.Find("Log in");

	}

}
