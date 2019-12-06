package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
   
	public static void main(String[] args) {
		Integer[]  it = {1,2,3,4,6,7,8,10};
		int len = it.length;
		//存放分组
		List<List<Integer>> list = new ArrayList<>();
		//记录前一个值，以便和当前值比较
		int previousValue = -1;
		//保存一个分组
		List<Integer> group = null;
	    for(int i=0;i<len;i++) {
	    	if(previousValue != it[i]-1) {//与前一个数字不连续，需要重新分组
	    		if(group != null) {
	    			list.add(group);
	    		}
	    		group = new ArrayList<>();
	    	}
	    	//记录当前值并添加到当前分组中
	    	previousValue = it[i];
	    	group.add(it[i]);
	    	
	    	if(i== len-1) {
	    		list.add(group);
	    	}
	    	
	    }
	    System.out.println(list);
		
	}
}
