package com.bit.day06.except;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100) + 1; // 1~100

		if (num % 2 == 0) {
			System.out.println("생성된 난수는 " + num + "은(는) 짝수입니다.");
		} else {
			try {
				String msg = "생성된 난수 " + num + "은(는) 홀수입니다.";
				throw new OddException(msg);
				//throw : 예외를 던져라, 발생시켜라
				//   -> 해당 예외 클래스를 생성과 동시에 예외로 발생. (catch가 잡도록)
			}catch(OddException oe){ // 사용자 정의 예외 클래스로 catch
				// 1. 로그 남기기(파일)
				
				
				
				// 2. 사과 (정상종료)
				System.out.println("죄송합니다. 예기치 않은 문제로 프로그램을 종료합니다.");
				
				
				
				// 3. 위의 방법도 어렵다면,  ->비추천
				oe.printStackTrace(); //콘솔에라도 찍기
				
//				return; //강제종료시 
				System.exit(0); // 프로그램 종료
			}finally { //무조건 실행되는 영역
				// 1. 자원정리(resource) ex)Scanner사용 시 s.close();
				//	-> Scanner의 열린 통로를 닫아라.

			}
		}
	}
}
