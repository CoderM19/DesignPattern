package com.example.demo.factory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.demo.factory.pizzastore.pizza.CheesePizza;
import com.example.demo.factory.pizzastore.pizza.GreekPizza;
import com.example.demo.factory.pizzastore.pizza.Pizza;

public class OrderPizza {
   
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("greek");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("cheese");
			}else {
				break;
			}
			//输出pizza，制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			
		} while (true);
		
	}
	
	//获取客户希望订购的披萨种类
	private String getType() {
		try {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input pizza type:");
		String str;
			str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
