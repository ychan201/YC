/*������ ����
 * 1. ��������(static) - Ŭ��������
 * 2. ���(�ν��Ͻ�)
 * 3. ��������(�Ű�����)
 */
class BB{
	int a=10; // �ν��Ͻ� ����
	static int b=20; // Ŭ���� ����
	
	void print() {
		System.out.print("a ="+a+"\tb ="+b+"\n");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		b1.print();
		b1.b=55;
		b2.print();
	}
}
