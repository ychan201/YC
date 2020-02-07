/* 자바는 다중상속 불가 - 상속을 받은 후에는 다시 상속 받을 수 없다. (정석은 불가 // 우회시 가능..)
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
		// System.out.println("c="+c); 상속받지 못한 c는 사용 불가 (private)
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
