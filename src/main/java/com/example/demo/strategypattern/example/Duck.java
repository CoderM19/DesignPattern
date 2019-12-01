package com.example.demo.strategypattern.example;

public abstract class Duck {
   
	//属性，策略接口
	FlyBehavior flyBehavior;
	//其他属性<->策略接口
    QuackBehavior quackBehavior;
    
	public Duck() {
	}
	
	public void fly() {
		if(flyBehavior !=null) {
			flyBehavior.fly();
		}
		
	}
	
	public abstract void display();//显示鸭子信息	
	
	public void quack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}
		
	}
	
	public void swim() {
		System.out.println("鸭子会游泳...");
		
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
