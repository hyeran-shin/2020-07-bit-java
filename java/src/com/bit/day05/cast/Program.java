package com.bit.day05.cast;

// Class Cast 
// 	-> 상속 관계에서 부모-자식 간 형 변환


public class Program {
	/* instanceof 연산자
	 * [형태] : A instanceof B
	 * 			A가 B로 형 변환이 가능한지?
	 * 	- 형 변환(인스턴스)이 가능한지를 묻는 연산자
	 *  - 가능하면 true, 불가능하다면 false
	 */
	static void info(Parent p) { // 자식 전달, Parent p=c01, 묵시적 형변환
		// 참조 변수는 주소값을 가진다고 생각.
		// 참조 변수 p는 자식 객체의 주소를 담을 수 있는 특징으로 강제 형변환 가능
		// 오버로딩이 필요없다?
		if (p instanceof Child01) { 
			Child01 c = (Child01) p; // 강제 형변환
			// 객체를 담을 수 있는 참조 변수의 형변환이다.
			c.study();
			c.sleep();
			
			// 자식으로 강제 형변환 하는 경우
			//	 -> 자식의 참조 변수로만 호출 가능한 변수나 메소드가 존재한다.
			//	 -> 자식만이 가지고 있는 필드들 ( study(), sleep())
			c.info();
			p.info(); //형변환 하지 않고 바로 info() 호출 
			// -> 자식의 info() 메소드가 호출된다.
			// 참조 변수 p는 자식을 담고 있기 때문에
			// 부모 참조변수로 info() 이름을 사용하되, (부모에 info()를 만든 이유)
			//	실제 담긴 객체는 자식이기에 부모의 info()는 가려지고 자식 것이 호출된다.
			// 즉, 담고 있는 자식의 재정이된 메소드가 호출되는 
			//p.study(); // 불가! 부모의 필드가 아니다.
//			((Child01) p).study(); // 가능
			
		} else if (p instanceof Child02) {
			Child02 c = (Child02) p;
			c.soccer();
			c.drink();
			c.info();
		} else {
			p.info();
		}
	}
	
	public static void main(String[] args) {
//		Parent p = new Parent();
		
		//부모의 참조변수에 생성된 자식을 담아라.
//		Parent p = new Child01();
		// Child01 타입이 Parent 타입으로 자동 형변환
		
		//자식의 참조변수에 부모를 생성하여 담아라
//		Child01 c = new Parent(); // 컴파일 에러 
//		Child01 c = (Child01) new Parent(); // 런타임 에러 (코드상 문제없다고 나오지만 실행하면 오류) 
		// Parent 타입을 Child01 타입으로 명시적 형변환
		// ClassCaseException 발생 (형변환 불가)
//		Parent pp = new Parent();
//		info(pp);
		
		Child01 c01 = new Child01();
		info(c01);
		Child02 c02 = new Child02();
		info(c02);
		// info(Parent p) 메소드의 매개 변수가 부모 타입이므로,
		// 자식인자가 전달될 수 있다.
		
	}

}
