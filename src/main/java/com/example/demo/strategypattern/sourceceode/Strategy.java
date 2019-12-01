package com.example.demo.strategypattern.sourceceode;

import java.util.Arrays;
import java.util.Comparator;

public class Strategy {
   
	public static void main(String[] args) {
		
		Integer[] data = {1,3,5,2,7,4,6};
		
		//实现升序排序，返回-1放左边，1放右边，0保持不变
		
		//说明
		//1.实现了Comparator接口<策略接口> ,匿名类对象new Comparator<Integer>(){}
		//2.对象new Comparator<Integer>(){...}就是实现了策略接口的对象
		//3.public int compare(Integer o1,Integer o2){}指定具体的处理方式
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				if(o1>o2) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		//说明
		/**
		 *  public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a);
        } else {
            if (LegacyMergeSort.userRequested)
                legacyMergeSort(a, c);//使用策略对象C
            else
            //使用策略对象C
                TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }
		 */
		//方式一
		Arrays.sort(data,comparator);
		System.out.println(Arrays.toString(data));//升序排序
		
		//方式二,使用lambda表达式
		Arrays.sort(data, (var1,var2) -> {
			if(var1.compareTo(var2)>0) {
				return 1;
			}else {
				return -1;
			}
		});
	}
}
