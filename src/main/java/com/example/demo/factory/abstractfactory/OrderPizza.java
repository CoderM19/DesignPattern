package com.example.demo.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.demo.factory.pizzastore.pizza.Pizza;

public class OrderPizza {
   
	AbstratctFactory abstratctFactory;
	
	public OrderPizza(AbstratctFactory abstratctFactory) {
		setAbstratctFactory(abstratctFactory);
	}
	
	private void setAbstratctFactory(AbstratctFactory abstratctFactory) {
		Pizza pizza =null;
		String orderType = "";
		this.abstratctFactory = abstratctFactory;
		
		do {
			orderType = getType();
			pizza = abstratctFactory.createPizza(orderType);
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购失败");
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
