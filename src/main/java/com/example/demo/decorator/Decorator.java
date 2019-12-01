package com.example.demo.decorator;

public class Decorator extends Drink{
   
	private Drink obj;
	
	@Override
	public float cost() {
		//getPrice自己价格
		return super.getPrice()+obj.cost();
	}
	
	public Decorator(Drink obj) {
		this.obj = obj;
	}
	
	@Override
	public String getDes() {
		//obj.getDes()输出被装饰者的信息
		return super.des + " " + super.getPrice() + " && " + obj.getDes();
	}

}
