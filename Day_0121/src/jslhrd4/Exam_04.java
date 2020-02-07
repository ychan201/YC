package jslhrd4;

/* 익명 중첩
 * - 기존 클래스의 특정 메소드를 오버라이딩하여 사용하는 방식
 */

class Inner4{
	void aaa() {
		System.out.println("aaaaaaaa");
	}
	void bbb(){
		System.out.println("bbbbbbbb");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Inner4 in4 = new Inner4();
		in4.aaa();
		in4.bbb();
		System.out.println("---------------익명중첩----------------");
		Inner4 in = new Inner4() {
			void bbb() {
				System.out.println("cccccccccccc");
			}
		};
		in.aaa();
		in.bbb();
	}
}
