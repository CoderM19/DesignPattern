package com.example.demo.factory.abstractfactory;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public interface AbstratctFactory {
     
	public Pizza createPizza(String orderType);
}
