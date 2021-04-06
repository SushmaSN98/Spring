package com.xworkz.foodDelivery.repository;

import com.xworkz.foodDelivery.entity.HotelVendorEntity;

public class HotelVendorRepositoryImple implements HotelVedorRepository{
	
	public HotelVendorRepositoryImple(){
		System.out.println("created "+ this.getClass().getSimpleName());
		
	}

	@Override
	public void save(HotelVendorEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save"+entity);
		System.out.println("saved in database");
		
	}

}
