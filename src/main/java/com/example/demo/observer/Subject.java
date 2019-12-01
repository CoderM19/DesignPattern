package com.example.demo.observer;
/**
 * 观察者模式
 * @author Administrator
 *
 */
public interface Subject {
   
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();
}
