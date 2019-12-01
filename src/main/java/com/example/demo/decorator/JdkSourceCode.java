package com.example.demo.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class JdkSourceCode {
  
	public static void main(String[] args) throws Exception {
		/**
		 * 说明:
		 *    InputStream 是抽象类，类似我们前面讲的Drink
		 *    FileInputStream是InputStream的子类，类似DeCaf,LongBlack
		 *    FilterInputStream是InputStream的子类：类似Decorator 修饰者
		 *    DataInputStream是FilterInputStream的子类，具体的修饰者，类似Milk,Soy等
		 *    FilterInputStream类有protected volatile InputStream in;即含被装饰者
		 *    jdk 的IO体系中，就是使用装饰者模式
		 */
		DataInputStream dis = new DataInputStream(new FileInputStream(""));
		System.out.println(dis.read());
		dis.close();
	}
}
