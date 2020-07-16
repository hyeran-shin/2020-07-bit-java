package com.bit.day07.generic;


class AAA{
	@Override 
	public String toString() { return "Class AAA"; }
}

class BBB{
	@Override
	public String toString() { return "Class BBB"; }
}
//instance info , 인스턴스화 : class -> instance 
class InstInfo{
	public <T> void info(T inst) {
		System.out.println("<T> info(T inst) : " + inst);
		//inst -> inst.toString() 출력으로 이어진다.
	}
	
	// 2개 이상의 인자를 제네릭 타입으로 정의
	public<T, U> void info(T inst1, U inst2) {
		System.out.println("<T , U> : " + inst1);
		System.out.println("<T , U> : " +inst2);
	}
	
	
}

public class MethodMain {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = new BBB();
		
		InstInfo info = new InstInfo();
		info.info(a);
		info.info(b); // 제네릭 안붙였을 때 public <Object> void info(<Object> inst){ ~ 라고 생각
		// info() 메소드의 인자로 어떤 객체가 전달될지 모른다. 
		// a주소를 넣었는데 b의주소가 나오는 실수가 일어날 수 있따.
		
		// 제네릭 메소드를 활용해, 전달되는 인자를 제한(설정, 스티커)
		info.<AAA>info(a);
		info.<BBB>info(b);
//		info.<BBB>info(a); // 컴파일 에러
		// AAA 스티커를 붙이고 BBB 타입의 인자를 전달했을 경우
		
		info.<AAA,BBB>info(a,b);
//		info.<AAA,BBB>info(b,a); // 인자의 위치, 컴파일 에러
		
	}
}





