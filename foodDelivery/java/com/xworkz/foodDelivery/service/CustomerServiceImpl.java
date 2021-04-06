package com.xworkz.foodDelivery.service;

import com.xworkz.foodDelivery.entity.CustomerEntity;
import com.xworkz.foodDelivery.repository.CustomerRepository;
import com.xworkz.foodDelivery.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository repository=new CustomerRepositoryImpl();
	
	public CustomerServiceImpl(CustomerRepository repository){
		
	}

	@Override
	public boolean saveAndValidity(CustomerEntity entity) {
		// TODO Auto-generated method stub
		
		if(entity !=null) {
			System.out.println("entity is valid");
			repository.save(entity);
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
