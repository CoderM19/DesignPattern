package com.example.demo.factory.abstractfactory;

import com.example.demo.factory.factorymethod.LDCheesePizza;
import com.example.demo.factory.factorymethod.LDGreekPizza;
import com.example.demo.factory.pizzastore.pizza.Pizza;

public class LDFactory implements AbstratctFactory{

	@Override
	public Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}else if(orderType.equals("greek")) {
			pizza = new LDGreekPizza();
		}
		
		return pizza;
	}

}  
