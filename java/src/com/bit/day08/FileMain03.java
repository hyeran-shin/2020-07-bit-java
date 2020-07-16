package com.bit.day08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain03 {
	public static void write() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("sample/write.txt");
			dos = new DataOutputStream(fos);

			int num = 97;
			fos.write(num);
			// byte 타입으로 1byte 출력, 97 -> a

			dos.writeInt(num);
			// 정수타입으로 4byte 출력
			// 숫자 97이 아니라, 4byte 정수형태, 97->a
//			dos.writeDouble(3.14);   // 주석처리하면 오류남, double이 eof=-1을 출력하는데 
			dos.writeChar('A');
			// 파일 데이터를 작성한 사람만 알고 있다.
			// 작성 방식을 알고 있어야 문제없이 

			System.out.println("쓰기 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dos != null)
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (fos != null)
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}

	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("sample/write.txt");
			dis = new DataInputStream(fis);
			System.out.println("file read...");

			int c = fis.read();
			System.out.println(c);

			int i = dis.readInt();
			double d = dis.readDouble();
			char ch = dis.readChar();
			
			// 모두 읽고난 뒤에 다시 읽으려고 할 때
			// 또는, 타입이 일치하지 않을때  
			//  -> 해당 타입을 읽어들일 수 없다. ( 데이터가 없다고 판단 )
//			char ch2 = dis.readChar(); 
			// EOFException 발생한다.

			System.out.println("정수 : " + i);
			System.out.println("실수 : " + d);
			System.out.println("문자 : " + ch);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		write();
		read();
	}
}
