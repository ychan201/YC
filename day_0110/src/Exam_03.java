/* 1 ~ 10 �հ� ���
 * ��� : 1 ~ 10 = 55
 * ����Ÿ��x, �Ű�����o
 */
public class Exam_03 {
	public static void main(String[] args) {
		adder(10,100);
	}
	
	
	
	
	
	
	
	
	
	static void adder(int a, int b) {
		int c = 0;
		for(int i=a;i<=b;i++) {
			c+=i;
		}
		System.out.println(a+" ~ "+b+" = "+c);
	}
	
}
