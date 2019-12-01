package com.example.demo.singletonpattern.type5;
/**
 * 懒汉式--线程安全，同步代码块(线程不安全)
 * @author Administrator
 *
 */
public class Singleton {
  
	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(null == instance) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
