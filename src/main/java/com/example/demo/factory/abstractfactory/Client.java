package com.example.demo.factory.abstractfactory;

public class Client {
   
	public static void main(String[] args) {
		new OrderPizza(new BJFactory());
	}
}
