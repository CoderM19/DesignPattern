package com.example.demo.strategypattern.example;

public class BadFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("飞翔技术一般");
	}

}
