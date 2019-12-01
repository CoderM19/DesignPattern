package com.example.demo.strategypattern.example;

public class GoodFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("飞翔技术高超");
	}

}
