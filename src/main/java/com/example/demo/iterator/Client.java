package com.example.demo.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
   
	public static void main(String[] args) {
		
		List<College> collegeList = new ArrayList<>();
		
		//创建学院
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(computerCollege);
		collegeList.add(infoCollege);
		
		OutputImpl outputImpl = new OutputImpl(collegeList);
		outputImpl.printCollege();
	}
}
