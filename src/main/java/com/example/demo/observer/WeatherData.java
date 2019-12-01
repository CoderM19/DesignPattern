package com.example.demo.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    
	private float temperature;
	private float pressure;
	private float humidity;
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void dataChange() {
		notifyObserver();
	}
	
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
	//观察者集合
	private ArrayList<Observer> observers;
	
	
	public WeatherData() {
		observers =new ArrayList<Observer>();
	}
    
	//注册一个观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}
    
	//移除一个观察者
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
		observers.remove(o);
		}
	}
  
	//遍历所有的观察者，并通知
	@Override
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++) {
			observers.get(i).update(temperature, pressure, humidity);
		}
	}
   
	
}
