package com.example.demo.proxy.jdkproxy;

public class Client {
   
	public static void main(String[] args) {
		
		ITeacherDao target = new TeacherDao();
		
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProcyInstance();
		
		proxyInstance.sayHello("tom");
	}
}
