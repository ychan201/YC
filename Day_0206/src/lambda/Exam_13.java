package lambda;
/* �ڹ� 1.8���� ����
 * lambda - �޼ҵ带 �ϳ��� ����ó�� ǥ���� ��
 * 			'�͸� �Լ�'��� ��.
 */

class AA{
	int test(int a,int b) {
		System.out.print("AAA");
		return 1;
	}
}

public class Exam_13 {
	public static void main(String[] args) {
		AA a = new AA();
		a.test(1,2);
		
//		()->{System.out.print("AAA")};
//		(int a, int b) ->{return 11;};
	}
}
