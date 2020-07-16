package com.bit.day06.prob;

// 팰린드롬 - 숫자
// 숫자가 음수 x, 0으로 끝나면 x, 
public class Palindrome2 {
	public static void main(String[] args) {
//		System.out.println("숫자 입력");
//		Scanner s = new Scanner(System.in);
//		if (num < 0 || (num % 10 == 0) && num != 0) { // 0 , 0끝나는 경우(x)
//		}

		int num = 1221;
		int isPal = 0;
		while (num > isPal) {
			isPal = (num % 10) + isPal * 10;
			num = num / 10;
			System.out.println(num + " , " + isPal);
		}

//		num == isPal || num == isPal/10

		if (num == isPal || num == isPal / 10)
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");
	}
}
