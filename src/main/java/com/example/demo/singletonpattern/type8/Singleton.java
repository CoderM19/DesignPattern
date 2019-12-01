package com.example.demo.singletonpattern.type8;
/**
 * 静态内部类,推荐使用
 * @author Administrator
 * 采用类装载的机制来保证初始化实例时只有一个线程
 * 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 */
public class Singleton {
   
	private Singleton() {
	}
	
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
