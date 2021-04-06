package com.xworkz;

import com.xworkz.foodDelivery.constants.FoodType;
import com.xworkz.foodDelivery.entity.FoodItemEntity;
import com.xworkz.foodDelivery.repository.FoodItemRepository;
import com.xworkz.foodDelivery.repository.FoodItemRepositoryImpl;

public class MTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodItemEntity entity=new FoodItemEntity("Pani Puri" ,40,FoodType.CHARTS, 2,10);
		
		FoodItemRepository rep=new FoodItemRepositoryImpl();
		rep.save(entity);
		

	}

}
