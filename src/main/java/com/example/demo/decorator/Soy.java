package com.example.demo.decorator;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		setDes(" 豆浆 ");
		setPrice(2.0f);
	}

}
