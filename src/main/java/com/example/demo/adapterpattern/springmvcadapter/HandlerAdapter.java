package com.example.demo.adapterpattern.springmvcadapter;
//定义一个Adapter
public interface HandlerAdapter {
    
	public void handler(Object handler);
	
	public boolean supports(Object handler);
}
//多种适配器
class SimpleHandlerAdapter implements HandlerAdapter{

	@Override
	public void handler(Object handler) {
		 ((SimpleController)handler).doSimpleHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof SimpleController);
	}
	
}

class HttpHandlerAdapter implements HandlerAdapter{

	@Override
	public void handler(Object handler) {
		 ((HttpController)handler).doHttpHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof HttpController);
	}
	
}

class AnnotationHandlerAdapter implements HandlerAdapter{

	@Override
	public void handler(Object handler) {
		 ((AnnotationController)handler).doAnnotationHandler();
	}

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof AnnotationController);
	}
	
}

