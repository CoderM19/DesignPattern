package com.example.demo.factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
    
	//定义一个抽象方法，createPizza,让各个子工厂类自己实现
	abstract Pizza createPizza(String orderType);
	
	public OrderPizza() {
			Pizza pizza =null;
			String orderType;
			do {
			orderType = getType();
			pizza = createPizza(orderType);//抽象方法，由子类实现
			
			//输出pizza
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购pizza失败");
				break;
			}
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
