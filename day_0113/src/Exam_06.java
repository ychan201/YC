class Point{
	int x=10; // ����� �ʱ�ȭ
	int y=20;
	
	// ������ �����ε� - �޼ҵ� �̸��� ������ ���ƾ���. �Ű�����(���� or ����)�� �޶����.
	Point(){ // ������
		System.out.println("AAAA");
	}
	Point(int a){ // ������
		x=a;
		System.out.println("AAAA");
	}
	Point(int a,int b){ // ������
		x=a;
		y=b;
		System.out.println("AAAA");
	}
	
	// void print() {}
}
public class Exam_06 {
	public static void main(String[] args) {
		Point pt1 = new Point(10,20); // default ������
		Point pt2 = new Point(100,200);
		pt1.x=10;
		pt2.y=4;
		System.out.println("pt1.x="+pt1.x);
		System.out.println("pt2.x="+pt2.x);
		}
}
