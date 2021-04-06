package com.xworkz.machine.component;

public class Motor {
	 int warrantyPeriod;
	
	
	public Motor(){
	System.out.println("Created"+ this.getClass().getSimpleName());	
	}
	
	public void rotate(){
		System.out.println("motor rotating" );
		
		}
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked waarantyPeriod");
		this.warrantyPeriod = warrantyPeriod;
	}

}
