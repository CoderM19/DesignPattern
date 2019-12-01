package com.example.demo.strategypattern.example;

public class TonyDuck extends Duck{

	@Override
	public void display() {
		 System.out.println("这是玩具鸭");
	}
  
	public TonyDuck() {
		flyBehavior = new NoFlyBehavior();
		quackBehavior = new BadQuack();
	}
}
