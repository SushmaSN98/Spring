package com.xworkz.foodDelivery.service;

import com.xworkz.foodDelivery.entity.FoodItemEntity;
import com.xworkz.foodDelivery.repository.FoodItemRepository;
import com.xworkz.foodDelivery.repository.FoodItemRepositoryImpl;

public class FoodItemServiceImpl implements FoodItemService {
	
	private FoodItemRepository repository=new FoodItemRepositoryImpl();
	
	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("created"+ this.getClass().getSimpleName());
		this.repository=repository;
	}

	@Override
	public boolean saveAndValidity(FoodItemEntity entity) {
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
