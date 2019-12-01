package com.example.demo.singletonpattern.type3;
/**
 * 懒汉式--线程不安全
 * @author Administrator
 *
 */
public class Singleton {
   
	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(null == instance) {
			instance = new Singleton();
		}
		return instance;
	}
}
