package com.bit.day07.vector;

public class Member {
	private int num;
	String name;
	
	public Member(int num , String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return String.format("번호 : %d, 이름 : %s", num, name);
	}
}
