package com.example.demo.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator{
   
	List<Department> deparementList;
	int index = -1;//索引
	
	
	public InfoColleageIterator(List<Department> deparementList) {
		super();
		this.deparementList = deparementList;
	}

	@Override
	public boolean hasNext() {
		if(index >= deparementList.size()-1) {
			return false;
		}else {
		index +=1;
		return true;
		}
	}

	@Override
	public Object next() {
		return deparementList.get(index);
	}

}
