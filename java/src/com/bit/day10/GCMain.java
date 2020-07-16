package com.bit.day10;

/*
 * 가비지컬렉션(GC)
 * System 클래스의 쓰레기 수집 정적 메소드
 * static 정적 메소드
 * 
 * 1. public static void gc()
 * 		: 쓰레기 수집기 가동
 * 2. public static void runFinalization()
 * 		: 쓰레기 수거
 * 3. public static void runFinalizersOnExit(boolean value)
 * 		: 프로그램(프로세스) 종료 시 모든 객체를 수거
*/

class Coffee {
	private int no;

	public Coffee(int no) {
		this.no = no;
		System.out.println("커피 생성 : " + no);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}


	@Override
	protected void finalize() { // Object 클래스에 있음, 소멸(해제) 시 호출되는 메소드 , 소멸자라고 생ㅇ각
		System.out.println(no + "번 객체 정리");
	}

}

public class GCMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Coffee c1 = new Coffee(1);
		Coffee c2 = new Coffee(2);
		Coffee c3 = new Coffee(3);

//		System.runFinalizersOnExit(true);
		c2 = null; //c2는 남아있음, 힙과 연결된 체인이 없어지는 것이고 c2의 메모리는 아직 남아있음, 힙영역에대한 메모리만 삭제됨, *헷갈리지 않게 중요
		System.gc(); // 호출하는 시점에 쓰레기에 해당되는 것들을 확인 //runFinalization이거 호출하면 여기서 정리될 수도 있음.
		// 쓰레기 수거에 해당되는 finalize() 호출

//		System.out.println(c2.getNo()); // c2가문제, getNo()메소드는 문제가 아님
		// N*ullPointException
		// -> null 을 참조하려 할 때 발생!

		// Q. 힙터트리기

		
		
	}
}
