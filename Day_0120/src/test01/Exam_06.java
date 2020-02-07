package test01;

class Super{
	int x=100;
	void aa() {
		System.out.println("x="+x);
	}
}

class Child extends Super{
	int y=200;
	void aa() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
}

class ChildA extends Super{
	int y=200;
}

class ChildB extends Super{
	int y=200;
}

public class Exam_06 {
	public static void main(String[] args) {
		Super s = new Super();
		System.out.println("x = "+s.x);
		Child c = new Child();
		System.out.println("x = "+c.x);
		System.out.println("y = "+c.y);
		System.out.println("-----------------------");
		Super ss = new Child();
		System.out.println("x = "+ss.x);
		ss = new ChildA(); // 가능
		ss.aa();
		// Child cc = new Super(); 불가능 
	}
}
