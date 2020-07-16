package com.bit.day09;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  [Server]
 *  생성자(Construct)
 *  	: ServerSocket(int port)
 *  메소드(Method)
 *  	: Socket accept()
 *  		클라이언트의 요청을 받아들인 다음,
 *  		클라이언트와 연결된 소켓 객체를 반환
 *  	: void close()
 *  		서버 소켓을 닫는다.  
*/

public class EchoServerMain {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(10000);
			System.out.println("Server Listening... on 10000");
			
			Socket client = server.accept();
			System.out.println("접속 클라이언트의 정보 : [" 
								+ client.getInetAddress().getHostAddress() 
								+"]");
			// 양쪽에서 보내고 받아서 input, output 둘 다 필요
			// 클라이언트에서 전송한 메시지를 받는 객체(Input)
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
					
			// 받은 메시지를 클라이언트에 재 전송할 객체(Output)
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			// 모든 입력을 다 받을 수 있는 출력 클래스, 동기식에서 모든 예외 처리
			
			/* 상대의 상태에 따라서 어떻게 동작할거냐에따라 동기 비동기라고 나눔
			 *  동기    : 일정 신호를 받았을 때 다음 동작하는 것.
			 *  비동기 : 타겟의 상태와 관계없이 일방적으로 동작하는 것.
			*/
			
			while(true) {
				String msg = br.readLine();
				System.out.println("받은 메시지 : " + msg);
				if(msg==null) {
					System.out.println(client.getInetAddress() + " 연결을 종료합니다.");
					client.close();
					break;
				}
				// 재 전송
				pw.println(msg);
				pw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





