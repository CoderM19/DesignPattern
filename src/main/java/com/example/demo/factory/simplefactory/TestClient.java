package com.example.demo.factory.simplefactory;

public class TestClient {
  
	public static void main(String[] args) {
		new OrderPizza(new SimpleFactory());
	}
}
