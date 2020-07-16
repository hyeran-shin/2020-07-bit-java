package com.bit.day03.dynamic;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntDArray idarr = new IntDArray(3); // 3개를 저장할 수 있는 배열 생성
		idarr.arrInfo();
		idarr.add(3);
		
		idarr.arrInfo();
		idarr.add(5);
		
		idarr.arrInfo();
		idarr.add(7);
		
		idarr.arrInfo();
		
		// 저장소 크기를 넘어서 데이터를 저장
		// -> 3의 크기로 고정되어 있기 때문에 더 이상 저장 불가능한 상태
		// Q. 다음 코드가 정상적으로 수행될 수 있도록 IntDArray.java의 add를 추가?
		idarr.add(9);
		idarr.arrInfo();
		
		idarr.add(11);
		idarr.arrInfo();
		
		idarr.add(13);
		idarr.arrInfo();
		
	}

}
