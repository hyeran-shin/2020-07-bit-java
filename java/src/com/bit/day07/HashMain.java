package com.bit.day07;
// 해시 제22장pdf 참고

import java.util.HashSet;
class HashItem{
	private int id;
	private String name;
	
	public HashItem(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		HashItem temp = (HashItem)obj;
		return id == temp.id;
	}
	
	@Override
	public int hashCode() {
		return id % 3 ;
	}
	@Override
	public String toString() {
		return "HashItem [id=" + id
				 + ", name =" + name
				 + ", hashCode=" + (id % 3) + "]";
	}
}

public class HashMain {
	public static void main(String[] args) {
		HashSet<HashItem> hSet = new HashSet<>();
		
		for(int i = 0 ; i <=1000 ; i++) {
			hSet.add(new HashItem(i*100,"name"));
		}
		
		
		for(HashItem item : hSet) {
			System.out.println(item); //item 만 써도 toString()호출됨
		}
	}
}
