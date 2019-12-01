package com.example.demo.strategypattern.example;

public class BadQuack implements QuackBehavior{

	@Override
	public void quack() {
		 System.out.println("叫声很难听...");
	}

}
