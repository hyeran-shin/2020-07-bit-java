package com.bit.day09;

// 1. Thread 클래스를 상속하는 방법 
class ThreadA extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("A Thread...");
		}
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("B Thread...");
		}
	}
}

// 2. Runnable 인터페이스 상속
class ThreadC implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("C Thread...");
		}
	}
}

public class ThreadMain {
	// main 쓰레드
	public static void main(String[] args) {
		// 1. 클래스를 상속
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();

		ta.start();
		tb.start();
		// 쓰레드 - 자바프로그램에서 여러개의 실행을 하는것 - main,ThreadA,ThreadB 3개의 쓰레드

		// 2. 인터페이스 상속
		ThreadC tc = new ThreadC();
//		tc.start(); // 실제 부모 Thread에서 상속받는 기능이 없다.
		// 인터페이스 상속 이기 때문에, 그래서 따로 만들어줘야한다.
		Thread c = new Thread(tc); // 실제 쓰레드 생성
		c.start(); // 4개가 싸움

//		ta.run(); // 밑에 main thread 출력 x , 쓰레드함수가 아닌 그냥 함수로 취급
		// main 쓰레드 내에서의 run()호출
		// 따로 동작하기 위한 작업을 수행하지 않는다. -> 쓰레드 생성으로 이어지지 않는다.

		while (true) {
			System.out.println("main Thread...");
		}

	}
}
