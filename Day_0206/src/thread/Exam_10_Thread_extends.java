package thread;

import java.awt.Toolkit;

class Beep extends Thread{
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i=0; i<10;i++) {
			tool.beep(); // beep�� �߻�
			System.out.println("��");
			try {
				Thread.sleep(500); // 500/1000�� . ��, 0.5�ʸ��� cpu ����
			}catch(Exception e) {}
		}
	}
}

public class Exam_10_Thread_extends {
	public static void main(String[] args) {
		Beep beep = new Beep();
		beep.start(); // ��Ƽ������
		for (int i=0; i<10;i++) {
			System.out.println("��"); // �̹� Ŭ���������� ��Ƽ������ �۵� X ���������� ����
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
}
