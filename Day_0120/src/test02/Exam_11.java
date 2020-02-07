package test02;

abstract class Animal {
	String kind;

	void test() {
		System.out.println("��� �մϴ�");
	}

	abstract void sound();
}

class Pig extends Animal {
	@Override
	void sound() {
		System.out.println("�ٿ��ٿ��ٿ�");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("�۸۸۸�");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("���߾ƾƾƿ�");
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
