package test01;

class CC{
	CC(){}
	CC(int a){
		System.out.println("생성자 호출");
	}
	
	int x =10;
	void test() {
		System.out.println("x = "+x);
	}
}

class DD extends CC{
	int y=100;
	void test() { // --오버라이딩-- '재정의' 메소드 이름,매개(멤버)변수가 똑같은데 내용물만 변경 -- 메소드를 다시 정의하는것.
					// 상속 관계에서 조상클래스와 메소드가 무조건 같아야함.
		
		super.test();
		System.out.println("y = "+y);
		System.out.println("x+y = "+(x+y));
		
		//super() 조상클래스의 생성자
		//super. 조상클래스의 변수
		//this. 자기자신의 변수
		//this() 자기자신의 생성자
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		CC cc = new CC();
		cc.test();
		System.out.println();
		DD dd = new DD();
		dd.test();
		System.out.println();
	}
}
