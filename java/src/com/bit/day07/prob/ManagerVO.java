package com.bit.day07.prob;

public class ManagerVO {
	private int id;
	private String name;

	public ManagerVO(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ManagerDAO [id=" + id + ", name=" + name + "]";
	}

}
