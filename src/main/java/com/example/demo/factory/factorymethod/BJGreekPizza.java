package com.example.demo.factory.factorymethod;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class BJGreekPizza extends Pizza{

	@Override
	public void prepare() {
		 setName("北京greek pizza");
		 System.out.println("北京greek pizza 准备原材料");
		 
	}

}
