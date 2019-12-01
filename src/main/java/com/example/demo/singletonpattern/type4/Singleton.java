package com.example.demo.singletonpattern.type4;
/**
 * 懒汉式--线程安全
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
	}
	
	//加入同步代码，解决线程不安全问题
	public static synchronized Singleton getInstance() {
		if(null == instance) {
			instance = new Singleton();
			
		}
		return instance;
	}
}
