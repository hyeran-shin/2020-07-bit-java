package com.bit.day05;

// HAS-A 관계 (복합 관계)
//  모든 경찰은 총을 가집니까?
//		->경찰은 총을 가질 수도, 없을 수도 있다.
//	직접적인 상속 관계가 아닌,
//	한 클래스에서 다른 클래스를 참조하는 형태
//

class Gun{
	int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void fire() {
		System.out.println("빵");
		this.bullet--;
	}
	
	public void status() {
		System.out.println("남은 총알 : " + this.bullet);
	}
}
class Police{
	Gun gun; // 다른 클래스의 참조 변수 선언 / 참조 -> HAS-A관계(복합 관계)
	// Police에서 Gun을 사용하겠다.
	// 상황에 따라 생성할 수도 생성하지 않을 수도 있다. 
	
	public Police(int bullet) {
		if(bullet > 0 ) { // 총알을 1개 이상 가지고 생성된다면,
			gun = new Gun(bullet); //Gun객체 생성
			//Police는 gun을 가진다
		} else {
			gun = null;
		}
	}
	
	public void targetShoot() {
		if(gun == null) {
			System.out.println("총을 가지고 있지 않음");
		} else {
			System.out.println("사격 개시");
			gun.fire();
			gun.status();
		}
	}
	
	
}
public class HasMain {

	public static void main(String[] args) {
		Police p1 = new Police(3);
		Police p2 = new Police(0);
		p1.targetShoot();
		p2.targetShoot();
	}

}





