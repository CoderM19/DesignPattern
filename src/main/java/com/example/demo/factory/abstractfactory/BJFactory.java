package com.example.demo.factory.abstractfactory;

import com.example.demo.factory.factorymethod.BJCheesePizza;
import com.example.demo.factory.factorymethod.BJGreekPizza;
import com.example.demo.factory.pizzastore.pizza.Pizza;

public class BJFactory implements AbstratctFactory{

	@Override
	public Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}else if(orderType.equals("greek")) {
			pizza = new BJGreekPizza();
		}
		
		return pizza;
	}

}  
