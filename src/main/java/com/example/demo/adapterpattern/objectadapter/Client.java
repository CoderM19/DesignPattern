package com.example.demo.adapterpattern.objectadapter;

import com.example.demo.adapterpattern.classadapter.Phone;
import com.example.demo.adapterpattern.classadapter.Voltage220V;

public class Client {
   
	public static void main(String[] args) {
		System.out.println(" ===对象适配器模式====");
		Phone phone = new Phone();
		phone.chargin(new VoltageAdapter2(new Voltage220V()));
	}
}
