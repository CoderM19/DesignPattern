package com.example.demo.proxy.cglibproxy;

public class Client {
   
	public static void main(String[] args) {
		TeacherDao target = new TeacherDao();
		
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		
		proxyInstance.teach();
	}
}
