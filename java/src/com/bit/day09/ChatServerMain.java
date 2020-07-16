package com.bit.day09;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

class Echo extends Thread { // 클라이언트 소켓을 담아서 쓰레드 만들겠다?
	private Socket socket;

	public Echo(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			InetAddress client = socket.getInetAddress(); // 여러명이 접솔할거니까 누가누군지 알아야해서
			System.out.println("[System] : [" + client + "]님이 참여했습니다.");

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);

			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String msg = null;
			while (true) {
				Set<String> msgSet = new HashSet<String>();
				msg = br.readLine();
				msgSet.add(msg);

				if (msg == null) {
					System.out.println("[" + client.getHostAddress() + "]님이 접속을 종료했습니다.");
					socket.close();
					break;
				}

				for (String s : msgSet) {
					System.out.println("[" + client.getHostAddress() + "] : " + s); // 접속한 아이디가 무슨메시지 보냈는지
				}
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ChatServerMain {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(10000);
			System.out.println("대화방이 개설되었습니다.");
			
			while(true) {
				Socket client = server.accept();
				Echo echoTread = new Echo(client);
				echoTread.start();
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
