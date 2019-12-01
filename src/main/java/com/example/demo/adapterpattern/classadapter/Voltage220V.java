package com.example.demo.adapterpattern.classadapter;

/**
 * 被适配类
 * @author Administrator
 *
 */
public class Voltage220V {
     
	public int output220V() {
		int src =220;
		System.out.println("电压="+src+"V");
		return src;
	}
}
