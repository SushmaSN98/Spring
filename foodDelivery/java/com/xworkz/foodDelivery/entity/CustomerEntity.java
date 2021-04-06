package com.xworkz.foodDelivery.entity;

import com.xworkz.foodDelivery.constants.Gender;

public class CustomerEntity {
	String name;
	String location;
	double rating;
	long phoneNo;
	String email;
	Gender gender;
	
	public CustomerEntity(){
		System.out.println("created "+this.getClass().getSimpleName());
		}

	public CustomerEntity(String name, String location, double rating, long phoneNo, String email, Gender gender) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", gender=" + gender + "]";
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
