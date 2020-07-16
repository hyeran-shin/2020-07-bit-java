package com.bit.day05;


/* 
 * IS-A 관계 (상속 관계)
 *  학생은 사람이다. (o)
 *  사람은 학생이다. (x)
*/
class One{
	int value;
//	One(int value){
//		this.value = value;
//	}   // 했을 시 tow(){ super}오류남, 자식은 부모의 생성자를 따라간다. Two(value) { super(value)} 해야함
	//
}

class Two extends One {

	Two() {
		super(); // 디폴트생성자 내부에 부모 생성자를 호출하는 코드 삽입
				 // 생략이 되었을 뿐, 기본 생성자에는 super()가 생략되어있음.
	}

}

class Person{
	private String name; 
	// 상속받는 자식 클래스들이 공통적으로 가지고 있는 특징
	// 회사원, 학생은 모두 이름을 가진다.
	
	public Person(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
	}
}

class Student extends Person{
	private String university;
	private String major;
	
	/*
	 * 부모의 생성자를 호출하지 않았을 시 컴파일 에러 발생
	 * 부모는 디폴트생성자가 아닌 매개 변수 생성자 단 하자만 가지고 있다.
	 * (디폴트 생성자가 자동 삽입되지 않는다.)
	 * 즉, 자식의 생성자에서 부모가 생성되도록 부모의 생성자를 호출시켜야 한다.
	*/
	
	Student(String name, String university,String major){
		super(name);   
		this.university = university;
		this.major = major;
	}
	public void info() {
		super.info(); // 부모의 메소드 호출
		System.out.println("학교 : " + university);
		System.out.println("학과 : " + major);
	}
}

class BusinessMan extends Person{
	private String company;
	private String position;
	
	BusinessMan(String name, String company, String position){
		super(name);
		this.company = company;
		this.position = position;
	}
	
	public void info() {
		super.info();
		System.out.println("회사 : " + company);
		System.out.println("직위 : " + position);
	}
}

public class IsMain {
	public static void main(String[] args) {
		Student s = new Student("정우성","자바대","연극영화과");
		s.info();
		
		BusinessMan b = new BusinessMan("강동원", "인젠트","과장");
		b.info();
	}

}










