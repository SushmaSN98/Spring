package com.xworkz.springg;

public class RocketComponent {
	
	private String fuelType;
	private String country;
	public RocketComponent(String fuelType, String country) {
		super();
		this.fuelType = fuelType;
		this.country = country;
	}
	
public void launch() {
	System.out.println("rocket launch of " + fuelType);
	System.out.println("rocket lunched from "+country);
}
public String getCountry() {
	return country;
}

public String getFuelType() {
	return fuelType;
}
}
