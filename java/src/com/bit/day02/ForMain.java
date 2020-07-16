package com.bit.day02;

public class ForMain {
	public static void main(String[] args) {
		
		//1~100 합계
		int sum = 0;
		for(int i =1; i<=100 ;i++) {
			sum += i;
		}
		System.out.println("합 : "+ sum);
		
		//1~100까지 짝수의 합계
		int sum1 =0;
		for(int i = 1 ; i<=100 ; i++) {
			if(i%2 ==0) {
				sum1 += i;
			}
		}
		System.out.println("짝수 합 : "+sum1);
		
		sum= 0;
		for(int x = 0 ,y=100;x<=100;y--,x++) {
			sum +=y;
		}
		//x: 루프 카운트, y: 계산에 사용된 데이터
		System.out.println(sum);
		
		
		//ex03. 1~100까지의 3과 5의 공배수를 출력
		for(int i=1;i<=100;i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		
		//infinity loop(무한루프)
//		for( ; ;) {
//			System.out.println("stop");
//		}
		
		//label
		//break 는 현재 루프 하나만 탈출
		// 중첩된 반복문을 한번에 탈출하고 싶을 때 사용
		 java : for(int i=0;i<10;i++) {
			System.out.println("i");
			for(int j=0;j<10;j++) {
				System.out.print('*');
				if(j==4) {
					//break label;
					break java;
				}
			} // 루프 카운트만큼 별을 출력하는 반복문 입니다.
			System.out.println("");
		}//내부 반복문의 5번째 루프에서 모두 종료되는 반복문입니다.
		
		
	}
}
