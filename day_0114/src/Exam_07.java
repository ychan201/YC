/* �޼ҵ� �����ε�
 * �޼ҵ� �̸� ����(������ ����, ���� Ÿ��)
 */

class GG {
	int add1(int a, int b) {
		int s = a + b;
		return s;
	}

	int add1(int a, int b, int c) {
		int s = a + b + c;
		return s;
	}

	int add1(int a, int b, int c, int d) {
		int s = a + b + c + d;
		return s;
	}

	int add1(int... a) { // ��������
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	int add2(int[] a) { // �迭
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		return s;
	}

}

public class Exam_07 extends GG {
	public static void main(String[] args) {
		GG gg = new GG();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int s1 = gg.add1(1, 2, 3, 4, 5, 6, 7, 8, 9, 100);
		System.out.println(s1);
		int s2=gg.add2(arr);
		System.out.println(s2);
		
	}
}

