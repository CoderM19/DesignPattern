package com.example.demo.observer;

public class BaiduSite implements Observer{

	//温度、气压、湿度
		private float temperature;
		private float pressure;
		private float humidity;
		
		//更新天气情况
		@Override
		public void update(float temperature, float pressure, float humidity) {
			this.temperature = temperature;
			this.pressure = pressure;
			this.humidity = humidity;
			display();
		}
		
		public void display() {
			System.out.println("百度提示-->今天的温度是: "+temperature);
			System.out.println("百度提示-->今天的气压是: "+pressure);
			System.out.println("百度提示-->今天的湿度是: "+humidity);
		}

}
