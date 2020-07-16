package com.bit.day06.prob;

// 팰린드롬 - 문자열
// 공백 포함해서도 되게뀸ㅁㅁ 
public class Palindrome {
	public static void main(String[] args) {
//		System.out.println("문자열 입력");
//		Scanner s = new Scanner(System.in);
//		String str = s. nextLine();
		String str = "abc ddc ba";

		boolean isPal = true;
		str = str.replaceAll(" ", ""); // 공백제거
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == str.charAt(str.length()-i-1)) {
				isPal = true;
			}else {
				isPal = false;
				break;
			}
		}
		if(isPal)System.out.println("회문입니다.");
		else System.out.println("회문이 아닙니다.");
	}
}
