package com.xworkz.foodDelivery.repository;

import com.xworkz.foodDelivery.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	public CustomerRepositoryImpl() {
		System.out.println("created"+ this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("save in database ");
		
	}

}
