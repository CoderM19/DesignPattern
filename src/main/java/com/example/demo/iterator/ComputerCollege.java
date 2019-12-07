package com.example.demo.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
  
	Department[] departments;
	int numofDepartment=0;//保存当前数组的对象个数
	
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Java专业", "Java专业");
		addDepartment("PHP专业", "PHP专业");
		addDepartment("C++专业", "c++专业");
	}
	
	@Override
	public String getName() {
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departments[numofDepartment] = department;
		numofDepartment +=1;
	}

	@Override
	public Iterator createIterator() {
		return new ComputerCollegeIterator(departments);
	}

}
