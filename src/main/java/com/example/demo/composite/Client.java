package com.example.demo.composite;

public class Client {

	public static void main(String[] args) {
		OrganizationComponent uni = new University("清华大学", "最高学府");

		OrganizationComponent college = new College("计算机学院", "计算机学院");
		OrganizationComponent college1 = new College("电气学院", "电气学院");

		college.add(new Department("软件工程", "软件工程"));
		college1.add(new Department("自动化", "自动化"));

		uni.add(college);
		uni.add(college1);

		// uni.print();
		college.print();
	}
}
