package thread;

import java.awt.Toolkit;

/* 멀티 쓰레드
 * 쓰레드 -> 실행 코드 
 * 하나의 작업이 완전히 끝나야 다음 작업을 실행하는 방식을 단일 쓰레드라고 함.
 * 멀티 쓰레드 - 동시에 작업하는 건 아님. 어느쪽이 실행중이면 다른작업은 중단.
 * TSS - Time Sharing System 시분할 시스템 
 * 1. Thread 클래스를 상속 받아서 사용하는 방법.
 * 2. Runnable 인터페이스를 구현하는 방법.
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
		Toolkit tool = Toolkit.getDefaultToolkit(); // 툴킷 - 스피커 음을 나게 해줌

		for (int i=0; i<10;i++) {
			tool.beep(); // beep음 발생
			try {
				Thread.sleep(500); // 500/1000초 . 즉, 0.5초마다 cpu 정지
			}catch(Exception e) {}
		}
		
		for (int i=0; i<10;i++) {
			System.out.println("♬"); // 이번 클래스에서는 멀티쓰레드 작동 X 순차적으로 실행
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
}
