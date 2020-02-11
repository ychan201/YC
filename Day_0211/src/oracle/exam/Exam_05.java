package oracle.exam;

import java.util.Scanner;

/* 포함 연산자
 * 성씨가 '김'
 * like '%김%' - 중간에 김이 포함. 김% 김으로 시작, %김 김으로 끝남.
 * like '김__' 김00 3자만 검색.
 *         
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		oracleSQL ora = new oracleSQL();
		try {
			ora.makeConn();
			ora.nameSearch(name);
			ora.takeDown();
		}catch(Exception e) {}
	}
}
