package test01;

class CC{
	CC(){}
	CC(int a){
		System.out.println("������ ȣ��");
	}
	
	int x =10;
	void test() {
		System.out.println("x = "+x);
	}
}

class DD extends CC{
	int y=100;
	void test() { // --�������̵�-- '������' �޼ҵ� �̸�,�Ű�(���)������ �Ȱ����� ���빰�� ���� -- �޼ҵ带 �ٽ� �����ϴ°�.
					// ��� ���迡�� ����Ŭ������ �޼ҵ尡 ������ ���ƾ���.
		
		super.test();
		System.out.println("y = "+y);
		System.out.println("x+y = "+(x+y));
		
		//super() ����Ŭ������ ������
		//super. ����Ŭ������ ����
		//this. �ڱ��ڽ��� ����
		//this() �ڱ��ڽ��� ������
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
