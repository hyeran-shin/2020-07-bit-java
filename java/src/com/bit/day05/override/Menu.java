package com.bit.day05.override;

// handler class 
// 동작에 따라 다르게 동작하는

public class Menu {
	public void process(int num) {
		switch (num) {
		case 1:
			Cat cat = new Cat();
			cat.eat();
			break;
		case 2:
			Dog dog = new Dog();
			dog.eat();
			break;
		}

	}
}
