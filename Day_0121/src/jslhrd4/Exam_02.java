package jslhrd4;

/* 정적 중첩(static class)
 * static 멤버만 포함
 */
class Outer1{
	int x=100;
	static int y=200;
	
	static class Inner1{ // 일반적인 멤버는 사용할 수 없음. 정적 멤버변수만 포함
		static int a=100;
		void disp_in(){
			// System.out.println("x = "+x); - 불가능
			System.out.println("y = "+y);
			System.out.println("a = "+a);
		}
	}
}



public class Exam_02 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 o1 = new Outer1.Inner1();
		o1.disp_in();
		System.out.println("x=" + o1.a);
		System.out.println("y="+o.y);
		System.out.println(Outer1.y);
		System.out.println(Outer1.Inner1.a);
	}
}
