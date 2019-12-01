package com.example.demo.factory.simplefactory;

import com.example.demo.factory.pizzastore.pizza.CheesePizza;
import com.example.demo.factory.pizzastore.pizza.GreekPizza;
import com.example.demo.factory.pizzastore.pizza.Pizza;

/**
 * 简单工厂类
 * @author Administrator
 *
 */
public class SimpleFactory {
   
	public Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greek");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheese");
		}
		
		return pizza;
	}
	
	//简单工厂模式也叫静态工厂模式
public static Pizza createPizza2(String orderType) {
		
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("greek");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("cheese");
		}
		
		return pizza;
	}
	
	
}
