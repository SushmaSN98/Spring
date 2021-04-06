package com.xworkz;

import com.xworkz.foodDelivery.constants.Gender;
import com.xworkz.foodDelivery.entity.CustomerEntity;
import com.xworkz.foodDelivery.repository.CustomerRepository;
import com.xworkz.foodDelivery.repository.CustomerRepositoryImpl;

public class MoonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerEntity entity=new CustomerEntity("Varna","Kormangala",4.5,9876255425l,"varna@gmail.com",Gender.WOMEN);
		
		CustomerRepository rep=new CustomerRepositoryImpl();
		rep.save(entity);

	}

}
