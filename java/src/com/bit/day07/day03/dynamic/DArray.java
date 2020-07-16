package com.bit.day07.day03.dynamic;

public class DArray<datatype> {
	Object [] buffer ; // Object 배열 , 저장 공간
	int capacity ; 
	int usage;
	
	public DArray(int capacity) {
		this.capacity = capacity;
		buffer = new Object[capacity];
		usage = 0;
	}
	public boolean isFull() {
		return usage ==capacity;
	}
	public boolean add(datatype element) {
		if(isFull()) {
			capacity++;
			Object[] temp = buffer ; 
			buffer = new Object[capacity];
			System.arraycopy(temp,0,buffer,0,usage);
		}
		buffer[usage] = element;
		usage++;
		return true;
	}
	
	public void info() {
		String str = String.format("용량 크기 : %d, 보관 개수 : %d ", capacity,usage);
		System.out.println(str);
		for(int i = 0 ; i <usage ; i++) {
			System.out.print(buffer[i]+" ");
		}System.out.println("");
	}
	
	public void remove() {
		
	}
	
}





