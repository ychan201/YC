package jslhrd4;

/* �͸� ��ø
 * - ���� Ŭ������ Ư�� �޼ҵ带 �������̵��Ͽ� ����ϴ� ���
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
		System.out.println("---------------�͸���ø----------------");
		Inner4 in = new Inner4() {
			void bbb() {
				System.out.println("cccccccccccc");
			}
		};
		in.aaa();
		in.bbb();
	}
}
