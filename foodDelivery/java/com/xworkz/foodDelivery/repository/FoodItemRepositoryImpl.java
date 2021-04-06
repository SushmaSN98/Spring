package com.xworkz.foodDelivery.repository;

import com.xworkz.foodDelivery.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	
	
	public FoodItemRepositoryImpl() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		// TODO Auto-generated method stub
		
	    System.out.println("invoked save"+ entity);
		System.out.println("save info database using JPA");
		
	}

}
