/* String[] args; - 클래스 배열.(첫자 대문자 -클래스) 문자열을 처리하기 위한 클래스
 * char[] a; - 문자 배열.
 * 클래스 - 사용자의 필요에 의해 만들어진 자료형
 */

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		int[] score; // 배열 선언
		score = new int[10]; // 할당- 메모리공간 확보
		System.out.println(score);
		System.out.println(score[0]); // 배열은 초기화 하지 않아도 기본값으로 초기화(정수의경우 0)
		System.out.println(score.length);
		
	}
}
