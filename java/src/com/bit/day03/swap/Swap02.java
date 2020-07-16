package com.bit.day03.swap;

class Value {
	private int value;
	public int getVaule() {return value;}
	public void setValue(int value) { this.value=value;}
}
class Value2{
	int[] value;
}


public class Swap02 {
	/*
	 * Call By Reference : 참조에 의한 호출
	 *  - 단순히 값이 아닌, 해당 값이 존재하는 참조 정보(주소 정보)를 전달받겠다
	 *  - 객체를 담는 참조변수는 주소정보를 가진다.
	 * 주소를 활용할 수 있는 객체를 사용하겠다.
	*/

	public static void swap(Value a, Value b) {
//		int temp = a.value;
//		a.value = b.value;
//		b.value = temp;
		
		int temp = a.getVaule();
		a.setValue(b.getVaule());
		b.setValue(temp);
	}

	public static void arrSwap(Value2 v1, Value2 v2) {
		int[] temp = v1.value;
		v1.value = v2.value;
		v2.value = temp;
	}
	
	public static void main(String[] args) {
		Value a = new Value();
		//a.value = 7;
		a.setValue(7);
		Value b = new Value();
		//b.value = 3;
		b.setValue(3);

		System.out.println("a : " + a.getVaule() + ", b : " + b.getVaule());
		swap(a,b);
		System.out.println("a : " + a.getVaule() + ", b : " + b.getVaule());
		
//Q. 배열 swap
		Value2 v = new Value2();
		v.value = new int[] {1,2,3};
		Value2 v2 = new Value2();
		v2.value = new int[] {4,5,6};
		
		for(int n : v.value) {
			System.out.println("v1[] : " + n);
		}
		arrSwap(v,v2);
		for(int n : v.value) {
			System.out.println("v1[] : " + n);
		}
				
	}

}
