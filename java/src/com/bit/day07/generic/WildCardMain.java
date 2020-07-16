package com.bit.day07.generic;

class Animal{
	public void eat() {
		// TODO
	}
}

class Cat extends Animal{
	@Override
	public void eat() { System.out.println("고양이 냥냥냥");}
}
class Dog extends Animal{
	@Override
	public void eat() {System.out.println("강아지 와구와구");}
}

class House<datatype> {
	datatype animal;
	public void store(datatype animal) {
		this.animal = animal;
	}
	public datatype pullOut() {
		return animal;
	}
}

public class WildCardMain {
	// Animal을 상속받는 모든 자식을 스티커로 붙이겠다.
	public static void open(House<? extends Animal> house) {  // animal을 상속하고 있는 클래스들은 접근 가능, Animal도 접근 가능
		Animal animal = house.pullOut();
		animal.eat();
	}
	
//	제네릭은 ㅏㅇ속관계시 제한을 두고싶을떄 사용해라

	
	//	}
	
//	public static void open(House<? super Cat> house) {   //Cat, Cat이 상속하는 부모만 가능
//		Animal animal = (Animal)house.pullOut();
//		animal.eat();
//	}
	
	
	public static void main(String[] args) {
		House<Animal> h = new House<Animal>();
		House<Cat> c = new House<Cat>();
		House<Dog> d = new House<Dog>();
		
		h.store(new Cat());
		c.store(new Cat());
		d.store(new Dog());
		
		
		open(h);
		open(c);
		open(d); 
		
	}
}








