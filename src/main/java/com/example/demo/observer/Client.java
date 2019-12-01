package com.example.demo.observer;

public class Client {
  
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditions conditions = new CurrentConditions();
		BaiduSite baidu = new BaiduSite();
		
		weatherData.registerObserver(conditions);
		weatherData.registerObserver(baidu);
		
		weatherData.setData(11f, 22f, 33f);
		
		
	}
}
