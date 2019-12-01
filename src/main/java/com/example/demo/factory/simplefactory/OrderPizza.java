package com.example.demo.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class OrderPizza {
    
	//定义一个简单工厂对象
	SimpleFactory simpleFactory;
	
	Pizza pizza = null;
	
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public  void setFactory(SimpleFactory simpleFactory) {
		
		String orderType ="";
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			
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
