package com.bit.day09;


class TimerThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			try {
				// 현재 실행중인 쓰레드를 1초간 쟁라
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
			
//			System.out.println("현재 시간 " + new Date().toLocaleString());
			System.out.println("현재 시간 " + System.currentTimeMillis());
		}
	}
}

public class SleepMain {
	public static void main(String[] args) {

		System.out.println("main()아 3초만 자...");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main()아 이제 일어났니");
		
		TimerThread tt = new TimerThread();
		tt.start();
		// 연산을 수행하는 시간도 존재하기에,
		// 정확한 1초 카운트는 되지 않는다.
		
	}
}
