package com.bit.day08;
// 스트림 : 데이터가 전달되는 통로
// 외부의 키보드로 입력받기위해서는 데이터가 전달할수있는 전달받는 통로가 필요 ?

import java.io.InputStream;
import java.io.InputStreamReader;
// 콘솔 입출력
public class FileMain01 {
	public static void main(String[] args) {
		/* 외부에서 파일을 읽어 들이기 위해서 통로를 열어야한다.
		 * 
		 *  1. 스트림 연다.
		 *  2. 작업을 수행한다.
		 *  3. 스트림을 닫는다.
		*/
		
		// 1. 스트림을 연다.
//		InputStream is = System.in;
//		try {
//			// 2. 작업을 수행한다.
//			System.out.println("입력 : " );
//			byte[] bytes = new byte[20]; // 문자 하나하나를 저장할 배열
//			
//			while (true) {
//				// EOF(End Of File) : -1
//				if (is.read(bytes) == -1) { // 더이상 데이터가 없음을 의미하는 -1
//					// read(bytes) : InputStream을 읽어들여 bytes에 저장.
//					break;
//				}
//				for (byte b : bytes) {
//					System.out.print((char) b);
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { // 메모리 관련 예외는 finally에 대부분 함
//			try { // 닫는데에도 문제가 있을 수 있어서 예외처리
//				if (is != null)
//					is.close();
//			} catch (Exception e) {
//
//			}
//		}

		
		// 한글을 입력받기 위해,
		// 문자 스트림을 바꾸기 위한 필터 클래스
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			System.out.print("입력 : ");
			while(true) {
				int c = isr.read();
				if( c == -1) break;
				System.out.print((char) c );
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) isr.close(); // 먼저 열린걸 닫아주는걸 선호
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(is != null) is.close();
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
	}
}











