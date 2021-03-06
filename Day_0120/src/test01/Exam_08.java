package test01;

class Parent{
	void method1() {
		System.out.println("Parent_method1()");
	}
	void method2() {
		System.out.println("Parent_method2()");
	}
}

class Child2 extends Parent{
	void method2() { // 오버라이딩
		System.out.println("Child_method2()");
	}
	void method3() { 
		System.out.println("Child_method3()");
	}
}

public class Exam_08 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1();
		p.method2();
		System.out.println("-------------------------");
		Parent pp = new Child2();
		pp.method2(); // 오버라이딩 된 메소드가 호출
		pp.method1();
		// pp.method3(); 자식이 만든것은 접근 불 가 능. 
		System.out.println("-------------------------");
		Child2 c = new Child2();
		c.method1();
		c.method2();
		c.method3();
	}
}
