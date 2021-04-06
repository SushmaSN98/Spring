package com.xworkz.springg;

public class ITCComponent {
	private String name;
	private String type;
	private String expiryDate;
	
	
	public ITCComponent(String name) {
		super();
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void display() {
		System.out.println("invoked display");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.expiryDate);
	
		
	}
	
	

}
