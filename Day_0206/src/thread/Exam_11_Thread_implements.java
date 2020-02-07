package thread;

import java.awt.Toolkit;

class Beep2 implements Runnable{
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i=0; i<10;i++) {
			tool.beep(); // beep음 발생
			System.out.println("♪");
			try {
				Thread.sleep(500); // 500/1000초 . 즉, 0.5초마다 cpu 정지
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
			System.out.println("♬"); // 이번 클래스에서는 멀티쓰레드 작동 X 순차적으로 실행
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
