package thread;

import java.awt.Toolkit;

/* ��Ƽ ������
 * ������ -> ���� �ڵ� 
 * �ϳ��� �۾��� ������ ������ ���� �۾��� �����ϴ� ����� ���� �������� ��.
 * ��Ƽ ������ - ���ÿ� �۾��ϴ� �� �ƴ�. ������� �������̸� �ٸ��۾��� �ߴ�.
 * TSS - Time Sharing System �ú��� �ý��� 
 * 1. Thread Ŭ������ ��� �޾Ƽ� ����ϴ� ���.
 * 2. Runnable �������̽��� �����ϴ� ���.
 */

//class AA extends Thread{
//	
//}
//
//class BB implements Runnable{
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//}

public class Exam_09_Thread_before {
	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit(); // ��Ŷ - ����Ŀ ���� ���� ����

		for (int i=0; i<10;i++) {
			tool.beep(); // beep�� �߻�
			try {
				Thread.sleep(500); // 500/1000�� . ��, 0.5�ʸ��� cpu ����
			}catch(Exception e) {}
		}
		
		for (int i=0; i<10;i++) {
			System.out.println("��"); // �̹� Ŭ���������� ��Ƽ������ �۵� X ���������� ����
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
}
