package test02;

abstract class Animal {
	String kind;

	void test() {
		System.out.println("¿îµ¿À» ÇÕ´Ï´Ù");
	}

	abstract void sound();
}

class Pig extends Animal {
	@Override
	void sound() {
		System.out.println("²Ù¿¢²Ù¿¢²Ù¿¢");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("¸Û¸Û¸Û¸Û");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("´µ¾ß¾Æ¾Æ¾Æ¿Ë");
	}
}

public class Exam_11 {
	public static void main(String[] args) {
		Animal p = new Pig();
		p.sound();
		p = new Dog();
		p.sound();
		p = new Cat();
		p.sound();
		System.out.println("--------------------");
		animalSound(new Cat());
		animalSound(new Dog());
		
	}
	
	
	static void animalSound(Animal a) {
		a.sound();
	}
}
