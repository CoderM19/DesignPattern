package com.example.demo.singletonpattern.type2;
/**
 * 饿汉式--静态代码块
 * @author Administrator
 *
 */
public class Singleton {
  
	private static Singleton instance;
	
	//在静态代码块执行时，创建单例对象
   static {
		instance = new Singleton();
	}
   
   private Singleton() {
}
   
   public static Singleton getInstance() {
	   return instance;
   }
}
