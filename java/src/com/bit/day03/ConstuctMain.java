package com.bit.day03;

/*
 * 생성자의 특징
 * 1. 클래스 이름과 동일
 * 2. 반환형이 존재하지 않음
 * 3. JVM이 디폴트(기본)생성자를 자동 생성(삽입)
 * 		(단, 클래스 내에 생성자가 정의되어 있지 않은 경우)
 * 4. 오버로딩 지원 
 * 5. 객체의 초기화 담당
 * 
 * 자바는 OverLoading(오버로딩) 지원
 *  : 메소드의 이름은 같지만, 매개변수의 개수나 데이터 타입에 따라 차이를 두는 방법
*/
class Member{
	String name;
	
	//생성자(Constructor)
	Member() {
		System.out.println("디폴트 생성자 Member() 호출됨...");
	}
//	Member(String _name){ // '_'를 활용한 구분 방법
	Member(String name){
		// name = _name;
		// 필드 이름과 매개변수의 이름이 똑같기 때문에 경고
		// 스코프 탐색 : 자기 자신이 가지고 있는 것 부터 인식
		this.name = name;
		// this : 나 자신을 의미
		//  -> 현재 영역(class)의 필드를 접근하기 위한 키워드
	}
	
	void info() {
		System.out.println("void info() 메소드 호출됨..." );
	}
	void info(int a) {
		System.out.println("void info(int a) 메소드 호출됨...");
	} 
	//반환형만 다르면 안됨
//	int info() { // 이름은 해당 데이터를 찾기(식별)위해 사용 , 
//				 // 반환형 달라도 이름이 같으면 사용 불가능
//		System.out.println("int info() 메소드 호출됨...");
//		return 1;
//	}
	int info(double a) {
		System.out.println("int info(double a) 메소드 호출됨...");
		return 1;
	}
	
	//생성자 이름과 동일하되 반환형이 존재한다면, 메소드로 취급 -> 권장x
//	void Member(int age) {
//		System.out.println("void Member(int age) 메소드 호출됨...");
//	}
}

class Person{
	String name;
	int age;
	int height;
	
	// 상수 필드, 상수 : 데이터가 바뀌지 않는 것 
	//final String ID= "e-1001"; // 선언과 동시에 초기화
	final String ID; // 선언만
	
	
	Person(){
//		this.name = "이름 없음";
//		this.age = -1;
//		this.height = -1;
		// 모든 경우의 생성자에 코드 작성? 
		this("이름 없음");
		//Person(String name) 호출
	}
	
	Person(String name){
//		this.name = name;
//		this.age=-1;
//		this.height=-1;
		this(name,-1);
	}
	
	Person(String name, int age){
		this(name,age,-1);
	}
	
	Person(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
		
		//ID = "e-1002";
		ID = name;
		// 객체 생성 시 본 영역(생성자)는 무조건 실행되므로,
		// 상수 필드를 선언만 한 후에 생성자에서 초기화 가능
		// 다른 생성자를 선언했어도 본 영역에 도달한다는 보장이 있다면 
		// 컴파일 에러 발생하지 않음.
	}
	
	
	void info() {
		System.out.print("name : " + name );
		System.out.print(", age : " + age );
		System.out.println(", height : " + height);
	}
	
	
}

public class ConstuctMain {
	
	static public void constantTest(final int value) {
		//value =10; //매개변수 value 가 상수화가 됐음 -> 변경이 불가능
		System.out.println(value);
	}
	
	
	public static void main(String[] args) {
		constantTest(20);
		
		// 생성자 : 객체 생성 시 최초(단 한번) 호출
		// 	-> 생성자도 메소드
		Member m = new Member();
		/*
		 * new Member();
		 * new : 메모리를 생성(할당)하기 위한 키워드
		 * Member() : 생성자 호출문
		*/
		
		//오버로딩된 메소드 호출
		m.info();
		m.info(7);
		m.info(3.14);
	
		//생성자 이름과 동일한 메소드 호출
		//m.Member(10);
		
		Person p = new Person("정우성", 40 , 186);
		p.info();
		
		Person p2 = new Person("정우성",40);
		p2.info();
		Person p3 = new Person("정우성");
		//상수필드
		//p3.name = "강동원원원";
		System.out.println("ID : " + p3.ID); //전달된 인자로 상수 필드 초기화
		//p3.ID="펭수" // 역시나 변경 불가ㅡㄴㅇ
		p3.info();
		Person p4 = new Person();
		p4.info();
		
		Member member = new Member(); //Member 객체 생성
		System.out.println(member.name); //String도 객체
		// 배열에서 보았듯이, new 를 이용한 방법은 자동으로 초기화 
		// 객체 또는 Stirng -> null로 초기화, 
		// 기본 데이터 타입 -> 0, 0.0, ...
		
		
	}
}
