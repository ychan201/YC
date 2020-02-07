package test01;
class A{
	
}

class B extends A{
	
}
public class Exam_07 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		//B b1 = new A();
		//B b2 = (B)a1;
		
		B b3 = new B();
		A a3 = b3;
		B b4 = (B)a3; // 형변환 - b3(a3)는 원래 B클래스였던 놈이므로, 강제 캐스팅 가능.
	}
}

