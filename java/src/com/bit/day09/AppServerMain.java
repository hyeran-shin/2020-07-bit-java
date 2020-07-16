package com.bit.day09;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {
	public static void main(String[] args) {
		try {
			// 서버 소켓 생성
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(10000);
			// 192.168.1.3:10000 서버를 열어라 
			System.out.println("Server Listening... 10000");
			
			Socket client = server.accept(); //클라이언트 요청 대기!
			String msg = "Hello Socket !!! " ;// 서버 -> 클라이언트 보낼 메시지 
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
