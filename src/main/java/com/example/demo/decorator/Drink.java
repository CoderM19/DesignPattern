package com.example.demo.decorator;

public abstract class Drink {
   
	public String des;//描述
	
	private float price=0.00f;

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	//计算费用的抽象方法
	public abstract float cost();
	
	
}