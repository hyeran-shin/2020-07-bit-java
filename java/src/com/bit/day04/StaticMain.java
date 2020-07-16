package com.bit.day04;

class StaticSub{
	String name; 
	static int sCnt;
	int iCnt;
	
	StaticSub(){
		sCnt++;
		iCnt++;
	}
	
	StaticSub(String name){
		this.name = name;
		sCnt++;
		iCnt++;
	}
	
	void prnCnt() { //일반 메소드
		System.out.println("static int sCnt : " + sCnt);
		// 일반 메소드 내부에서 static 멤버 변수 사용 가능
		prnInfo(); // static메소드 사용 가능
		System.out.println("int iCnt : " + iCnt);
	}
	static void prnInfo() {// 스태틱 메소드 
		System.out.println("static prnInfo() Method Called...");
		
//		System.out.println("int iCnt : " + iCnt);;
		// 스태틱 멤버 내부에서 일반 멤버 사용 불가능
		// -> prnInfo() 메소드의 메모리 할당 시(프로그램 시작 시)
		//    일반 멤버 iCnt가 메모리에 존재하지 않는다.
		// 	  iCnt는 프로그램 수행 중 동적 할당되어 사용되는 멤버
	}
	
}

public class StaticMain {
	public static void print() { // 스태틱 메소드
		System.out.println("print() Method Called...");
	}
	public void print(int a) { // 일반 메소드
		System.out.println("print(int a) Method Calles...") ;
	}
	public static void main(String[] args) {
		print(); // 동일한 클래스 영역 내에 있기 때문에 바로 호출 가능
		// 스태틱 멤버의 접근 방법
		// [클래스 이름].[필드] 로 접근
		StaticMain.print();
		// 객체를 생성하지 않고 메소드를 호출하여 사용
		// -> static으로 메소드는 이미 존재하기 떄문에  
//		print(10); // StaticMain의 멤버 메소드 -> 객체 생성 후에야 활용 가능
		StaticMain sm = new StaticMain();
		sm.print(10);
		// prnInfo(); // 다른 영역에 정의되어 있다.
		StaticSub.prnInfo();
		
		StaticSub ss = new StaticSub();
		ss.prnCnt();
		
		StaticSub ss2 = new StaticSub("정우성");
		ss2.prnCnt();
		
		StaticSub ss3 = new StaticSub("강동원");
		ss3.prnCnt();
		/*
		 * static 필드는 클래스 로딩 시점에 메모리를 할당	
		 * 
		 * JVM은 class 단위로 읽어들여 프로그램 수행 준비를 함
		 * 클래스를 읽어들였을 때 필요한 메모리 공간을 만든다.(존재한다.)
		 * 
		 * new : 동적 메모리 할당
		 * 		-> 해당 구문을 수행할 시 그 시점에 메모리를 할당
		 * static : 정적 메모리 할당
		 * 		-> 프로그램 시작 시 메모리를 할당
		 * 
		 * static 변수(class 변수)
		 *  	StaticSub의 static 변수는,
		 *  	StaticSub Class 수준의 변수로,
		 *  	해당 클래스로 생성된 객체는 모두 동일하게 사용한다.
		 *  
		 *  전역변수(Global) -> 모든 영역에서 접근가능
		 *  지역변수(Local)  -> 특정 영역 내에서만 접근 가능
		 *  	static 변수도 모든 객체(동일한 클래스)가 접근하여 사용하는 것이니, 
		 *  	전역변수다? 아니다!
		 *  	단지, 전역변수의 성격처럼 보일 뿐, 클래스변수(Class)
		 *  
		 *  정리하자면, 
		 *  	static은 클래스 로딩 시 메모리를 할당
		 *  	new 키워드를 활용한 동적 할당과 관련이 없다.
		 *  	그래서 생성 없이 바로 접근(활용) 가능하다.
		 *  
		*/	
	}

}









