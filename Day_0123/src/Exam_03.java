/* Wrapper
 * - ����ڽ� ��ڽ�
 */

public class Exam_03 {
	public static void main(String[] args) {
		int n=10;
		Integer nI=n; // ����ڽ�
		Integer nn = new Integer(n); // ����ڽ� �������� ��ü�� ���� �����������
		System.out.println(nI);
		
		Integer n2 = new Integer(100);
		System.out.println(n2); 
		int n3 = n2; // ���� ��ڽ�
		System.out.println(n3);
	}
}
