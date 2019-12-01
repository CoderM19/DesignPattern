package com.example.demo.observer;
/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface Observer {
   
	public void update(float temperature,float pressure,float humidity);
}
