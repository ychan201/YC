package thread;

import java.awt.Toolkit;

class Beep2 implements Runnable{
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

public class Exam_11_Thread_implements {
	public static void main(String[] args) {
		Runnable beep = new Beep2();
		Thread thread = new Thread(beep);
		thread.start();
		
		for (int i=0; i<10;i++) {
			System.out.println("��"); // �̹� Ŭ���������� ��Ƽ������ �۵� X ���������� ����
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
