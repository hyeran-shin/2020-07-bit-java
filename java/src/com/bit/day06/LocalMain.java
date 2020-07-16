package com.bit.day06;

interface Printable{
	 void print();
}

class OuterClass{
	private String name;
	
	OuterClass(String name){
		this.name = name;
	}
	
	// Local Class : 메소드 내부에 존재하는 형태의 클래스
	public Printable createLocalClassInst() { //반환형은 interface형태인 Printable
		// 메소드 내에서 사용되는 로컬 클래스를 사용하지 않으면,
		// 경고 출력! -> 어차피 메소드 내에서만 사용 가능!
		class Local implements Printable{ //메소드 내부에서의 class
			@Override
			public void print() {
				System.out.println("name : " + name);
			}
		}
		return new Local(); //자식이 부모타입으로 나갈 수 있다.
		// Local은 Printable의 구현클래스(자식)이기에 반환이 가능하다.
	}
		/*
		 * 지역 변수 : 메소드나 제어문처럼 { } 내에서만 존재하는 변수
		 * 		- Local Variable
		 * 		- 해당 영역을 빠져나오면 소멸!
		 * 		- 매개변수도 해당 메소드 내의 지역 변수
		*/
		
		// 익명의 Local Class인 Anonymous Class
		
		
	
	public Printable createLocalClassInst2(/* final */ int id) { //final이 생략되어 있는 상태이다.
//		id  = 30; -> 하면 밑에 id 오류남
		// [final 생략 시 주의할 점 ]
		// 메소드 내부에서 매개 변수 id를 접근하여 활용, 변경(변수처럼) 사용할 시,
		// id라는 매개 변수의 형식이 바뀐다.
		//	-> 상수 취급이 아닌 일반 지역 변수로 취급
		return new Printable() {
			// print() 필드(멤버) 메소드를 가진 익명 클래스가 존재!
			// 	-> Printalbe을 상속받는 형태 
			
			@Override
			public void print() {
				System.out.println("name : " + name + ",  id : " + id);
				
				// 접근 가능한 경우 메소드의 매개변수를 상수로 취급!
				// return 수행(종료) 시 메소드(매개 변수)의 메모리는 해제되지만,
				// id가 살아있는 이유  -> 상수 풀! 자바의 jvm 에서 (Constant Pool) 에 넣어서 관리를한다. , Pool: 여러사람이 사용할 수 있는 개념 ex) 풀빌라, 풀장
				
			}
		};
	}
	
}
public class LocalMain {
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass("정우성");
		Printable p = oc.createLocalClassInst();
		p.print();
		
		
		OuterClass oc2 = new OuterClass("강동원");
		Printable p2 = oc2.createLocalClassInst();
		p2.print();
		
		OuterClass oc3 = new OuterClass("현빈");
		Printable p3 = oc3.createLocalClassInst2(10);
		//createLocalClassInst2(...) 메소드가 반환된 후 시점
		//  -> 매개변수인 id는 소멸해야 맞다.
		p3.print(); // 메소드 종류 후 출력문을 통해 매개변수인 id를 출력?
		
		OuterClass oc4 = new OuterClass("손예진");
		Printable p4 = oc4.createLocalClassInst2(20);
		p4.print();
		
	}
	
}
