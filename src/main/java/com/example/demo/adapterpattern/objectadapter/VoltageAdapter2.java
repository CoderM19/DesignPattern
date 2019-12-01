package com.example.demo.adapterpattern.objectadapter;

import com.example.demo.adapterpattern.classadapter.IVoltage5V;
import com.example.demo.adapterpattern.classadapter.Voltage220V;

public class VoltageAdapter2 implements IVoltage5V{
    
	private Voltage220V voltage220V;
	
	//通过构造器，传入一个Voltage220V实例
    public VoltageAdapter2(Voltage220V voltage220v) {
    	this.voltage220V = voltage220v;
    	
	}
	
	@Override
	public int output5V() {
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();//获取220V电压
			System.out.println("使用对象适配器，进行适配");
			dst = src/44;
			System.out.println("适配完成，输出的电压为="+dst);
		}
		
		return dst;
	}

}
