package com.example.demo.adapterpattern.springmvcadapter;

//多种controller实现
public interface Controller {

}

class HttpController implements Controller{
	public void doHttpHandler() {
		System.out.println("http...");
	}
}

class SimpleController implements Controller{
	public void doSimpleHandler() {
		System.out.println("Simple...");
	}
}

class AnnotationController implements Controller{
	public void doAnnotationHandler() {
		System.out.println("Annotation...");
	}
}