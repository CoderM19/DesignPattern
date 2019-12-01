package com.example.demo.strategypattern.example;

public class Client {
   
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();
		wildDuck.quack();
	}
}
