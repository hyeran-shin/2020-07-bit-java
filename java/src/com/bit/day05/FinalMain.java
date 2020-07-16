package com.bit.day05;

import java.util.Random;

/*
 *  final 키워드
 *  	- 확정시키겠다. 변경이 불가능하도록 막겠다.
 *  	- 상수화 키워드
*/
// final class : 상속하는 것을 허용하지 않겠다.
/*final */class FinalSuper{
	// final method
	//  	: Override(재정의)를 허용하지 않겠다.
	//		단, final class가 아니라면 상속은 허용된다.
	// 		상속이 안되는 final class라면 당연히 오버라이딩도 안됨
	final void foo() {
		System.out.println("foo() Method Called...");
	}
}

class FinalSub /* extends FinalSuper */ {
//	@Override
//	void foo() {} // 오버라이드 불가능
}
@SuppressWarnings("serial")
class MyRandom extends Random{
	// 부모 클래스 Random의 nextInt() 메소드 재정의
	@Override
	public int nextInt(int max) {
		return super.nextInt(max) + 1;
		// 난수 생성 기능까지 구현하지는 싫으니,
		// 부모의 기능을 가져와 결과마 바꿔(가공하여) 반환
	}
}

//String class 는 final class 이기에 상속 불가
//class MyString extends String{}

public class FinalMain {
	public static void main(String[] args) {
		Random r = new Random(); // 난수 생성 기능 제공
		int rNum = r.nextInt(2); //0~1
		//nextInt(int bound)
		//	: 들어간 인자의 범위만큼 난수를 생성, 기준은 0부터
		System.out.println(rNum);
		
		rNum = r.nextInt(45) + 1; //0~44 , 1~45
		System.out.println(rNum);
		
		MyRandom mr = new MyRandom();
		rNum = mr.nextInt(2);
		System.out.println(rNum);
	}

}
