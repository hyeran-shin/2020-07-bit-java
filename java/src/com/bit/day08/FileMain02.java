package com.bit.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain02 {
	public static void main(String[] args) {
		//file copy(파일 복사)
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			/*
			 *  file path (파일 경로)
			 *  	-> 기본 경로는 프로젝트 경로 기준
			 *   	절대 경로 : 해당 파일이 가지는 고유한 경로
			 *   		(C:/Users/qweqwe/Desktop/java-workspace/java/sample/cat.jpg)
			 *   	상대 경로 : 기준으로부터 시작하는 파일 경로
			 *   		(sample/cat.jap)
			*/
			
			fis = new FileInputStream("sample/cat2.jpg"); // 경로로 통로 열어줌
			fos = new FileOutputStream("sample/cat_copy.jpg"); // 내보내쥼
			
			int data = -1; //EOF
			while((data = fis.read()) != -1 ) { //읽어들이고,
				fos.write(data); // 써라
			}
			System.out.println("복사 완료");
			
			
		} catch(FileNotFoundException fnfe) { // 스트림을 열 때
//			fnfe.printStackTrace();
			System.out.println("error : " + fnfe);
		} catch(IOException ex) {
//			ex.printStackTrace(); // 작업을 수행할 때, io 라는 부모의 예외도 
			System.out.println("error : " + ex);
		} finally {
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
