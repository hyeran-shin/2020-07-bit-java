package com.bit.day09;

// 공유시킬 지원 (Resource)
class Sync {
	synchronized void a() {
		for (int i = 0; i < 20; i++) {
			System.out.println('a');
		}
	}

	synchronized void b() {
		for (int i = 0; i < 20; i++) {
			System.out.println('b');
		}

	}

	synchronized void c() {
		for (int i = 0; i < 20; i++) {
			System.out.println('c');
		}
	}
}

class SyncThread extends Thread {
	private Sync s;
	private int type;

	public SyncThread(Sync s, int type) {
		this.s = s;
		this.type = type;
	}

	@Override
	public void run() {
		switch(type) {
		case 1: s.a(); break;
		case 2: s.b(); break;
		case 3: s.c(); break;
			
		}
	}

	

}

public class SyncMain {
	public static void main(String[] args) {
		Sync s = new Sync(); // 공유할 객체
		
		SyncThread st1 = new SyncThread(s, 1);
		SyncThread st2 = new SyncThread(s, 2);
		SyncThread st3 = new SyncThread(s, 3);
		
		st1.start();
		st2.start();
		st3.start();
	}
}
