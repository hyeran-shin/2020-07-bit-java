package com.bit.day09;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;


public class AppClientMain {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Socket client = new Socket("192.168.1.6",10000);
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			String msg = dis.readUTF();
			System.out.println("서버 응답 메시지 : " + msg);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
