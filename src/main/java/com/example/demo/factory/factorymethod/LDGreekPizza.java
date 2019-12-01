package com.example.demo.factory.factorymethod;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class LDGreekPizza extends Pizza{

	@Override
	public void prepare() {
		 setName("伦敦greek pizza");
		 System.out.println("伦敦greek pizza 准备原材料");
		 
	}

}
