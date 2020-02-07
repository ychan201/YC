package jslhrd4;
/* 중첩 클래스 (4대 중첩 클래스) - 클래스 내부에 또다른 클래스가 존재하는것 내부(Inner)클래스라고도 함
 * 1. 중첩(내부) 클래스
 * 2. 정적 중첩
 * 3. 지역 중첩
 * 4. 익명 중첩
 */

class Outer{
	private int x=10;
	int y=20;
	void disp() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	class Inner{
		int a =100;
		void disp_in() {
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.disp();
		Outer.Inner i = o.new Inner();
		Outer.Inner i2 = new Outer().new Inner();
		i.disp_in();
		i2.disp_in();
	}
}
