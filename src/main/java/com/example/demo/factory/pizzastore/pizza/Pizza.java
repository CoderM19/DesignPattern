package com.example.demo.factory.pizzastore.pizza;

public abstract class Pizza {
   
	protected String name;
	
	//准备原材料，不同的披萨，材料不一样
	public abstract void prepare();
	
	public void bake() {
		System.out.println(name+"baking...");
	}
	
	public void cut() {
		System.out.println(name+"cutting...");
	}
	
	public void box() {
		System.out.println(name+"boxing...");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
