/* �޼ҵ� ȣ�� ���
 * 1. ���� ���� ȣ��
 * 2. ������ ���� ȣ��
 */
public class Exam_06 {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("��ȯ ��");
/*		int c=a;
		a=b;
		b=c;
*/		swap(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static void swap(int a,int b) {  // ���� ���� ȣ�� (main���� ��ȭ�� ����.)
		int c=a;
		a=b;
		b=c;
	}
}
