package com.example.demo.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
   
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProcyInstance() {
		
		//1. Class
		return Proxy.newProxyInstance(target.getClass().getClassLoader()
				,target.getClass().getInterfaces() 
				, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("JDK代理开始...");
						//反射机制调用目标对象的方法
						Object returnVal = method.invoke(target, args);
						return returnVal;
					}
				});
	}
}
