package com.example.demo.decorator;

public class Client {
   
	public static void main(String[] args) {
		//装饰者模式下订单
		
		//1.点一份LongBlack
		Drink order  = new LongBlack();
		System.out.println("费用1=" +order.cost());
		System.out.println("描述="+ order.getDes());
		
		//2.order加一份牛奶
		order = new Milk(order);
		
		System.out.println("order 加入一份牛奶 费用=" + order.cost());
		System.out.println(" order 加入一份牛奶描述=" + order.getDes());
		
		//3.order加入一份巧克力
        order = new Chocolate(order);
		
		System.out.println("order 加入一份巧克力 费用=" + order.cost());
		System.out.println(" order 加入一份巧克力描述=" + order.getDes());
		
		//4.order加入一份巧克力
        order = new Chocolate(order);
		
		System.out.println("order 加入一份巧克力 费用=" + order.cost());
		System.out.println(" order 加入一份巧克力描述=" + order.getDes());
		
	}
}
