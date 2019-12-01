package com.example.demo.singletonpattern.type10;
/**
 * Effective java 作者推荐使用
 * @author Administrator
 *
 */
public enum Singleton {
     INSTANCE;
   
	public void method() {
		
	}
}

class test{
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance1 = Singleton.INSTANCE;
		System.out.println(instance.equals(instance1));
		System.out.println("hashcode:"+instance.hashCode());
		System.out.println("hashcode1:"+instance1.hashCode());
	}
}