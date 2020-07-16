package com.bit.day09;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 	[Client]
 *  생성자 (Construct)
 *  	: Socket(String hostName, int port)
 *  메소드 (Method)
 *  	: InputStream getInputStream()
 *  		현재 소켓과 관련된 InputStream 객체 반환
 *  	: OutputStream getOutputStream()
 *  		현재 소켓과 관련된 OutputStream 객체 반환
 *  	: void close()
 *  		소켓을 닫는다.
*/

public class EchoClientMain {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.1.6",10000);
			BufferedReader key
				= new BufferedReader(new InputStreamReader(System.in)); //입력받은값?

			// 서버에 메시지를 전송할 객체(Output)
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			
			// 서버에서 재 전송한 메시지를 받는 객체(Input)
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			while(true) {
				System.out.println("메시지 입력(종료 : exit) : ");
				String msg = key.readLine(); //콘솔에서 받아옴
				if(msg.equalsIgnoreCase("exit")) {//무시해라
					System.out.println("서버와 연결을 종료합니다.");
					client.close();
					break;
				}
				
				// 메시지 전송
				pw.println(msg);
				pw.flush();
				
				// 재 전송 받은 메시지 출력
				String resMsg = br.readLine();
				System.out.println("응답 메시지 : " + resMsg);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








