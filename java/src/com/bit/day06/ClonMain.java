package com.bit.day06;


/*
 *  clone() : 객체(인스턴스)를 복제하기 위한 메소드
 *  
 *  class MyClass implements Cloneable{
 *  	// Cloneable 인터페이스는 아무런 추상 메소드가 존재하지 않는다.
 *  	// 단지 복제 가능하다라는 표시의 용도!
 *  
 *  	// Cloneable를 상속하지 않고 Object의 clone() 메소드 활용 시,
 *  	// 예외가 발생한다. (CloneNotSupportedException)
 *  	//	 -> Object 클래스의 clone() 동작 여부를 결정
 *  	// 	 -> 복제 시 해당 객체의 생성자를 호출하지 않고, 생성과 복제
 *  
 *  }
 *  
*/

// 좌표
class Point  implements Cloneable {
	private int xPos;
	private int yPos;
	
	// 생성자(필드 초기화)
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	// 정보 출력
	//   -> 어떠한 객체든 동일한 로직으로 수행될 메소드!
	//   -> Point1과 Point2가 수행할 로직은 같다. (따로 존재할 필요가 없다.) 
	// 동일한 서랍장만 늘어날뿐   
	// 이것이 프로토타입 패턴, 원형패턴 
	// 자바스크립트에도 나옴
//
//	 *  -> posInfo()를 사용하기 위해 얕은 복사를 함.
//	 *  org나 cpy 나 동일한 로직으로 돌아감. 같은 point를 생성할 필요없음. 메모리낭비.
	public void posInfo() {
		System.out.print(xPos + ", " + yPos);
	}
	
	// Setter (값 변경)
	public void setPosition(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

// 두 좌표를 통해 표현한 사각형
class Rectangle implements Cloneable{
	Point p1 , p2; //Point p1 : x1,y1 / Point p2 : x2,y2
	public Rectangle(int xPos1, int yPos1, int xPos2, int yPos2) {
		p1 = new Point(xPos1, yPos1);
		p2 = new Point(xPos2, yPos2);
	}
	
	public void rectInfo() {
		System.out.println("[사각형의 위치 정보]");
		
		System.out.print("Point 1 : " );
		p1.posInfo();
		System.out.println("");
		
		System.out.print
		("Point 2 : ");
		p2.posInfo();
		System.out.println("");
	}
	
	public void setPosition(int xPos1, int yPos1, int xPos2, int yPos2) {
		p1.setPosition(xPos1, yPos1);
		p2.setPosition(xPos2, yPos2);
	}
	
	/*
	 * Rectangle과 Point 객체에서
	 * Rectangle 객체 내부에 Point 객체가 포함되는 형태
	 * 
	 * Shallow Copy (얕은 복사)
	 * 		- 껍데기인 Rectangle만 복제!
	 * 		- 알맹이인 Point1, Point2는 그대로
	 * 			-> org와 cpy가 가지는 Point는 동일한 객체다.
	 * 		- 복제된 객체는 원본 객체와 동일한 필드와 값을 가진다. (Point)
	 * 		    -> 원형 패턴(Prototype Pattern) 구현 시 활용!
	 * 
	 * 		[Prototype Pattern]
	 * 			- 이미 존재하는 객체를 복제(복사)하여 객체를 생성하는 방법(패턴)
	 * 			- 기능의 비즈니스 로직(알고리즘)의 차이가 없으면서,
	 *  		    객체의 속성 값만 다를 경우 활용하는 패턴
	 *  
	 * Deep Copy (깊은 복사)
	 * 		- 껍데기인 Rectangle 복제 시,
	 * 			알맹이인  Point1, Point2도 복제
	 * 
	*/
	@Override
	public Object clone() throws CloneNotSupportedException{
		// 얕은 복사
//		return super.clone();
		
		// 깊은 복사
		Rectangle cpy = (Rectangle) super.clone();
		cpy.p1 = (Point)p1.clone(); // Point1 복제
		cpy.p2 = (Point)p2.clone(); // Point2 복제
		return cpy;
	}
}
public class ClonMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle org = new Rectangle(3,3,7,7); //원본
		Rectangle cpy; //복제본
		
		cpy = (Rectangle)org.clone(); // 원본을 cpy에 복제
		org.setPosition(1, 2, 4, 7);  // 원본 데이터 변경
		org.rectInfo(); // 원본 데이터 정보
		cpy.rectInfo(); // 복제 데이터 정보
		
		 // 얕은 복사 시 return super.clone();
		// org가 바뀌면 cpy도 바뀜, -> 같은 객체를 바꿈
		
	}
}









