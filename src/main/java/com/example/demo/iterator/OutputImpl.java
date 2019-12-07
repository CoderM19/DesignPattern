package com.example.demo.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
   
	//学院集合
	List<College> collegeList;

	public OutputImpl(List<College> collegeList) {
		super();
		this.collegeList = collegeList;
	}
	//遍历所有学院，然后调用printDepartment输出各个学院的系
	public void printCollege() {
		
		//从collegeList取出所有学院，
		Iterator<College> iterator = collegeList.iterator();
		while(iterator.hasNext()) {
			College college = iterator.next();
			System.out.println(college.getName());
			printDepartment(college.createIterator());//得到对应的迭代器
		}
	}
	
	//输出学院输出系
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department) iterator.next();
			System.out.println(d.getName());
		}
	}
}
