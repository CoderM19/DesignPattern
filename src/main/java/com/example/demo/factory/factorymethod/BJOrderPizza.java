package com.example.demo.factory.factorymethod;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("greek")) {
			pizza = new BJGreekPizza();
		}
		
		return pizza;
	}

}
