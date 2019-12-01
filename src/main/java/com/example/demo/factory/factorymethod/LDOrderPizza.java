package com.example.demo.factory.factorymethod;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("greek")) {
			pizza = new LDGreekPizza();
		}
		
		return pizza;
	}

}
