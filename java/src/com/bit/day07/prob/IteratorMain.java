package com.bit.day07.prob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(1);
		
		Iterator<Integer> itr = list1.iterator();
		System.out.println(itr);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		Iterator<String> itr = list.iterator();
//		System.out.println(itr);
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
	}
}
