package com.bit.day02.prob;

public class ArmstongNumber {
	public static void main(String[] args) {
		/*		
		 * Q . 암스트롱의 수를 구하는 프로그램 작성.
		 * 	암스트롱의 수란?
		 * 		-> 세자리의 정수 중 각 자릿수를 세제곱하여 합한 수가 원래와 같은 수
		 *  	-> 370 == 3^3 + 7^3 + 0^3 
		 *  
		 * Q. 각 자리수의 팩토리얼이 자기 자신이 되는 수 
		 * 
		 */
		
	
		int x,y,z;
		int num =100; 
		while ( num <1000) {
			x = num / 100 ;
			y = (num % 100)/10;
			z = (num%100) % 10;
			
			double arm = Math.pow(x,3)+Math.pow(y,3)+Math.pow(z, 3);
		
			if(num==(int)arm) {
				System.out.println("암스트롱의 수 : " + num);
			}
			
			num++;
		}
		
		
		
	}

}
