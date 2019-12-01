package com.example.demo.factory.factorymethod;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class BJCheesePizza extends Pizza{

	@Override
	public void prepare() {
		setName("北京的奶酪pizza");
	  System.out.println("北京的奶酪pizza  准备原材料");	
	}

}
