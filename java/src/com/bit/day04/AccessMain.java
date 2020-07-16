package com.bit.day04;

class Access {
	private String name;
	private int age;

	/*
	 * Access Method (접근자 메소드) 
	 *   Getter, Setter 
	 *   외부에서 변수의 이름을 직접 접근하지 않고, 간접적으로 값을
	 *   확인(get)하거나, 변경(set)하기 위해 활용
	 * 
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 잘못된 데이터에 대한 처리
		if(age<0) this.age = -1; // 잘못 입력 및 데이터 없음을 의미하도록 (-1)
		else this.age = age;
	}

}

public class AccessMain {
	public static void main(String[] args) {
		Access ac = new Access();
//		 ac.name = "A"; // private 필드는 외부에서 이름을 사용할 수 없다.
		// 외부에서 변수의 이름을 직접 사용하는 것이 불가능

		ac.setName("카페");
		System.out.println(ac.getName());
		ac.setAge(7);
		System.out.println(ac.getAge());

		// setter를 활용한 예외 처리(핸들링, handling)
		// 변수 이름 접근을 막더라도, setter를 사용 가능하다면?
		// -> 이상한 데이터가 들어갈 수 있다.
		// age 변수는 0이상의 정수만 들어가야 한다.
		// ac.age = -7; // 본 코드처럼 직접 접근이 가능하여 바로 값을 바꾸는 것은 막기 힘들다.
		// setter를 이용해 객체 내부에서 가공하여 값을 넣어주는 방법을 활용
		ac.setAge(-7);
		System.out.println("나이 : " + ac.getAge());
		// 잘못된 데이터 입력시 -1 출력
		//  -> 외부에서 전달(가공)된 데이터로 값이 저장되지 않도록
		
	}
}
