package com.bit.day09;

import java.net.InetAddress;

/*
 *  Host 
 *  	- 호스트 주소
 *  	- 하나의 컴퓨터에 할당된 고유 이름
 *  	- 인터넷 상에서 IP주소나 도메인 이름으로 나타냄
 *  
 *  Port	
 *  	- 포트 번호
 *  	- 한 컴퓨터에서 여러 서비스의 제공을 가능하게함
 *  	- 한 호스트에 여러 개의 서비스를 구분하기 위해 사용
 *  	
 *  	* 하나의 호스트는 여러 개의 포트를 가질 수 있다.
 *  	* 서버 응용 프로그램(어플리케이션)은 클라이언트의 요청을 위해
 *  	    대기 상태 시 정해진 포트를 감시한다.
 *  	* 호스트 = 회사 대표 번호 / 포트 = 회사 내선 번호 
 *  
 *   Socket
 *   	- 컴퓨터가 연결된 통신의 끝점.
 *   	- 소켓에 쓰는 일은 상대에게 데이터 송신 (Output)
 *   	- 소켓에 읽는 일은 상대가 전송한 데이터를 수신 (Input)
 *   
 *    	TCP (Transmission Control Protocol)
 *    		- 연결형 서비스 제공
 *    		- 양방향 가상 회선 제공 (데이터가 들어가는 통로, stream이라고 생각)
 *    		- 신뢰성 있는 데이터 전송 보장
 *    		- ex) 전화라고 생각, 통화하며 말하면 대답을 함, 둘 다 데이터 전송을 잘 했는지 확인 가능
 *    		
 *      UDP (User Datagram Protocol)
 *      	- 비연결형 서비스 제공
 *     		- 단방향 송신
 *     		- 비교적 낮은 신뢰성
 *     		- ex) 쪽지라고 생각, 데이터 전송이 잘 끝났는지 모름ㄹ?
 */

/*
 * 
 * 
 *  IP 관련 클래스, InetAdress
 *  
 *  주요 메소드
 *  String getHostName() 	: 컴퓨터 사용자 이름 반환
 *  String getHostAddress() : 주소 정보 반환
 *  InetAddress getLocalHost()
 *  	: 현재 컴퓨터 InetAddress 객체 반환
 *  InetAddredd getByName(String host Name)
 *  	: hostName으로 지정된 컴퓨터의 InetAddress 객체 반환
 *  InetAddress getAllByName(String hostName){
 *  	: hostName으로 지정된 모든 컴퓨터의 InetAddress 객체 반환
 *  (하나의 도메인이름으로 여러대의 컴퓨터 사용하는 경우)
*/
public class InetAddresMain {
	public static void main(String[] args) {
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 이름 : "+ localHost.getHostName());
			System.out.println("내 컴퓨터 IP 주소 : " + localHost.getHostAddress());
			
			
			
			// http://www.inzent.com/
			System.out.println("인젠트의 주소 얻어오기");
			InetAddress addr;
			addr = InetAddress.getByName("www.inzent.com");
			System.out.println(addr);
			
			System.out.println("네이버의 주소 업어오기");
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
			for(InetAddress address: addrs)
				System.out.println(address);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}













