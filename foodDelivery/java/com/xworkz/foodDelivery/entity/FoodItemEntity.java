package com.xworkz.foodDelivery.entity;

import com.xworkz.foodDelivery.constants.FoodType;

public class FoodItemEntity {
	String name;
	double price;
	FoodType foodType;
	int quantity;
	double discount;
	
	
  public FoodItemEntity() {
	System.out.println("created " +this.getClass().getSimpleName());  
  }


public FoodItemEntity(String name, double price, FoodType foodType, int quantity, double discount) {
	super();
	this.name = name;
	this.price = price;
	this.foodType = foodType;
	this.quantity = quantity;
	this.discount = discount;
}


@Override
public String toString() {
	return "FoodItemEntity [name=" + name + ", price=" + price + ",foodType=" +foodType+", quantity=" + quantity + ", discount=" + discount
			+ "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(discount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + quantity;
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FoodItemEntity other = (FoodItemEntity) obj;
	if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (quantity != other.quantity)
		return false;
	return true;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public FoodType getFoodType() {
	return foodType;
}


public void setFoodType(FoodType foodType) {
	this.foodType = foodType;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public double getDiscount() {
	return discount;
}


public void setDiscount(double discount) {
	this.discount = discount;
}
  
  
  
  
}
