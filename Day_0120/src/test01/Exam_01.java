/* �ڹٴ� ���߻�� �Ұ� - ����� ���� �Ŀ��� �ٽ� ��� ���� �� ����. (������ �Ұ� // ��ȸ�� ����..)
 * 
 */

package test01;

class AA{
	int a=10;
	int b=20;
	private int c=30;
	
	void print() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println();
	}
}

class BB extends AA{
	void test() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println();
		// System.out.println("c="+c); ��ӹ��� ���� c�� ��� �Ұ� (private)
	}
}



public class Exam_01 extends AA {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.print();
		BB bb = new BB();
		bb.print();
		bb.test();
		
	}
}
