package com.bit.day09;

class GirlFriendThread extends Thread {
	@Override
	public void run() {
		System.out.println("(여자친구) : 저는 여자친구 쓰레드입니다.");
		System.out.println("(여자친구) : 오늘은 남자친구를 시험해보겠습니다.");
		System.out.println("(여자친구) : 남자친구가 10초도 못 기다리면 안되겠죠?");

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("(여자친구) : " + i + "초가 지났네요. 기다리고 있을까요?");
		}
//		System.out.println("(여자친구) : 남자친구가 기다려줬어요. 영화보러 갈게요");
		System.out.println("(여자친구) : 남자친구가 사라졌어요. 싸울까요?");
	}
}

class BoyFriendThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("(남자친구) : 저는 남자친구 쓰레드입니다.");
			System.out.println("(남자친구) : 오늘은 여자친구와 기생충을 보기로 했어요.");
			System.out.println("(남자친구) : 영화 시작 시간이 얼마 남지 않았네요.");
			System.out.println("(남자친구) : 여자친구를 기다립니다.");

			GirlFriendThread gf = new GirlFriendThread();
			gf.start();
//			gf.join();// gf의 일이 전부 끝날때까지 대기, 블록 상태(Blocked)
			gf.join(5000); // 5초만 대기(Blocked) 후 수행 시작

//			System.out.println("(남자친구) : 여자친구가 드디어 왔네요.");
			System.out.println("(남자친구) : 하.. 5초나 기다렸어.. 집에 갈래");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class JoinMain {
	public static void main(String[] args) {
		BoyFriendThread bf = new BoyFriendThread();
		bf.start();
	}
}
