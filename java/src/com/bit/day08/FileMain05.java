package com.bit.day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileMain05 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			// 기반 스트림
			fr = new FileReader("./src/com/bit/day08/FileMain01.java");
			fw = new FileWriter("sample/FileMain01.java.txt");
			
			// 보조 스트림 (필터)
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			
			long sTime = System.nanoTime(); // 시작시간
			while(true) {
				//필터 클래스를 장착하지 않은 경우
//				int data = fr.read();
//				if(data == -1) break;
//				fw.write(data);
//				fw.flush();
				
				
				// 필터 클래스를 장착한 경우 (Buffer)
				String line = br.readLine();
				// readLine() : 개행 문자를 만날 때까지 1라인을 읽어들인다.
				// 단, 개행문자까지 읽는건 아니기 때문에 개행에 대한 처리 필요하다.
				if(line==null)break;
//				bw.write(line + "\n"); //개행처리방법1
				bw.write(line);
				bw.newLine(); // 개행문자 (줄바꿈) , 개행처리방법2
						
			}
			bw.flush();
			long eTime = System.nanoTime(); // 끝난시간
			System.out.println("복사 완료");
			System.out.println("소요 시간 : " + (eTime-sTime + "ns"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}




