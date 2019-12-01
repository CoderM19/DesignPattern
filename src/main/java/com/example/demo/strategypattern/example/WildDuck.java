package com.example.demo.strategypattern.example;

public class WildDuck extends Duck{

	@Override
	public void display() {
		 System.out.println("这是野鸭");
	}
	
	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GoodQuack();
	}

}
