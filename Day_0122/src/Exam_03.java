/* 1���� �Է�
 * System.in.read() --> 1���ڸ� �޾Ƽ� int Ÿ������ ��ȯ�Ͽ� ����
 */

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�:");
		int cnt = (char)System.in.read(bytes); // �Է¹��� ������ ���� cnt�� ��.
		System.out.println("���ڼ� : " + cnt);
		String s = new String(bytes,0,cnt-2);
		System.out.println("�Է��ڷ� : "+s);
		System.out.println("���ڼ� : " + s.length());
		
		String str ="";
		if(str.isEmpty()) System.out.println("��");
		else System.out.println("���������");

	}
}
