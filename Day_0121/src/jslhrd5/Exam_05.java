package jslhrd5;
/* 예외처리
 * 최상위 클래스 Exception
 * try - catch 
 */

import java.io.IOException;

public class Exam_05 {
	public static void main(String[] args) {
		try { // 예외 발생지점을 예상하여 묶어주고
			int a = System.in.read();
			System.out.println(a);
		} catch (IOException e) { // 예외가 발생했다면, 그 예외를 e로 받는다 - 입출력예외를 캐치
								  // IOException - 입출력 예외만 처리 , Exception - 모든 예외 처리
			System.out.println("예외가 발생"); // - 예외를 몰라도 될 경우
		}catch (Exception ee){    // 입출력 예외가 앙닐 경우, Exception 으로 캐치
			ee.printStackTrace(); // catch문은 수행 후 프로그램 종료.
		}finally {
			//예외 발생과 관게없이 수행
		}
	}
}
