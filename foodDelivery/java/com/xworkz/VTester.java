package com.xworkz;

import com.xworkz.foodDelivery.constants.FoodType;
import com.xworkz.foodDelivery.entity.FoodItemEntity;
import com.xworkz.foodDelivery.repository.FoodItemRepository;
import com.xworkz.foodDelivery.repository.FoodItemRepositoryImpl;
import com.xworkz.foodDelivery.service.FoodItemService;
import com.xworkz.foodDelivery.service.FoodItemServiceImpl;

public class VTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodItemEntity entity=new FoodItemEntity("Sprite" ,30,FoodType.DRINKS,1,0);
		
		
	FoodItemRepository rep=new FoodItemRepositoryImpl();
	FoodItemService service=new FoodItemServiceImpl(rep);
	service.saveAndValidity(entity);

	}

}
