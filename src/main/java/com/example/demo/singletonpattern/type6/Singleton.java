package com.example.demo.singletonpattern.type6;
/**
 * 双重检查
 * @author Administrator
 *加入双重检查代码 ，解决线程安全问题，同时解决懒加载问题，同时保证了效率，推荐使用
 */
public class Singleton {
  
	private static volatile Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(null == instance) {
			synchronized (Singleton.class) {
				if(null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
