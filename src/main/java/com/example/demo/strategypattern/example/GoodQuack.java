package com.example.demo.strategypattern.example;

public class GoodQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("叫声很好听...");
	}

}
