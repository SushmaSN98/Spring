package com.xworkz;

import com.xworkz.foodDelivery.constants.VendorType;
import com.xworkz.foodDelivery.entity.HotelVendorEntity;
import com.xworkz.foodDelivery.repository.HotelVedorRepository;
import com.xworkz.foodDelivery.repository.HotelVendorRepositoryImple;
import com.xworkz.foodDelivery.service.HotelVendorService;
import com.xworkz.foodDelivery.service.HotelVendorServiceImpl;

public class HTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelVendorEntity entity =new HotelVendorEntity("Tanu","Bangalore",4.0,VendorType.WHOLESALERS);
		
		HotelVedorRepository rep=new HotelVendorRepositoryImple();
		HotelVendorService service=new HotelVendorServiceImpl(rep);
        service.saveAndValidity(entity);
	}

}
