package com.xworkz;

import com.xworkz.foodDelivery.constants.Gender;
import com.xworkz.foodDelivery.entity.CustomerEntity;
import com.xworkz.foodDelivery.repository.CustomerRepository;
import com.xworkz.foodDelivery.repository.CustomerRepositoryImpl;
import com.xworkz.foodDelivery.service.CustomerService;
import com.xworkz.foodDelivery.service.CustomerServiceImpl;

public class StarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerEntity entity=new CustomerEntity("Mandara","Bangalore",4.0,8765898863l,"mandaray@gmail.com",Gender.WOMEN);
		
		CustomerRepository rep=new CustomerRepositoryImpl();
		CustomerService service=new CustomerServiceImpl(rep);
		service.saveAndValidity(entity);

	}

}
