package com.xworkz.machine.component;

public class WashingMachine {
	 String companyName;
	 float capacity;
	 Motor motor;
	 Power pow;
	
	public WashingMachine(){
	System.out.println("created" +this.getClass().getSimpleName());	
	}
	
	
	public void wash()
	{
	  if(this.pow.isOn()){
	   this.motor.rotate();
	   }
	}
	
	public void setCompanyName(String companyName) {
		System.out.println("created setCompanyName"+ companyName);
		this.companyName = companyName;
	}
	
	public void setCapacity(float capacity) {
		System.out.println("created setCapacity"+capacity);
		this.capacity = capacity;
	}
	
	public void setMotor(Motor motor) {
		System.out.println("created setMotor"+motor);
		this.motor = motor;
	}
	
	public void setPow(Power pow) {
		this.pow = pow;
	}
	
	
	
	
	
	
	
}
