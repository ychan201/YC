package test02;

/* �������̽�(interface) - ����
 * ���, �߻�޼ҵ常 ����. (�Ϲ����� �޼ҵ尡 �������� ����.)
 * �����ڵ�� ��ü ���̿� ����
 * ���� �ڵ� (�������̽�) ��ü
 */

interface Car{
	static final int MAX=100;
	void test(); // ��ü�� ���� �߻�޼ҵ�			- �������̽��� ��ü�� �߻�Ŭ�����̱� ������
	int sum(int x,int b); // ��ü�� ���� �߻�޼ҵ�- abstract�� �������� �ʾƵ� �ȴ�.
}
// �������̽� ����
// �������̽��� ���߻���� �����ϴ�.

class Truck implements Car{
	@Override
	public int sum(int x, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_12 {
	public static void main(String[] args) {
		
	}
}
