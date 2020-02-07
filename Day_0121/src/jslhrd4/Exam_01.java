package jslhrd4;
/* ��ø Ŭ���� (4�� ��ø Ŭ����) - Ŭ���� ���ο� �Ǵٸ� Ŭ������ �����ϴ°� ����(Inner)Ŭ������� ��
 * 1. ��ø(����) Ŭ����
 * 2. ���� ��ø
 * 3. ���� ��ø
 * 4. �͸� ��ø
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
