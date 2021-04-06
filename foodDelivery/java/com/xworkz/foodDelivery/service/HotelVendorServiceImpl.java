package com.xworkz.foodDelivery.service;

import com.xworkz.foodDelivery.entity.HotelVendorEntity;
import com.xworkz.foodDelivery.repository.HotelVedorRepository;
import com.xworkz.foodDelivery.repository.HotelVendorRepositoryImple;

public class HotelVendorServiceImpl implements HotelVendorService{
	
	private HotelVedorRepository repository=new HotelVendorRepositoryImple();
	
	
   public HotelVendorServiceImpl(HotelVedorRepository repository) {
	System.out.println("created "+ this.getClass().getSimpleName()); 
	this.repository=repository;
   }
	@Override
	public boolean saveAndValidity(HotelVendorEntity entity) {
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
