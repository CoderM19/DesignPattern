package com.example.demo.adapterpattern.interfaceadapter;

/**
 * 接口适配器
 * @author Administrator
 *
 */
public class Client {
   
	public static void main(String[] args) {
		AbstractAdapter abstractAdapter = new AbstractAdapter() {
			@Override
			public void method1() {
				System.out.println("使用了mthod1方法");
			}
		};
		
		abstractAdapter.method1();
	}
}
