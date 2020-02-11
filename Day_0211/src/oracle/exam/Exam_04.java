package oracle.exam;

import java.util.Scanner;

/* 키보드로 날짜 입력( 예 1901-01-02 )
 * 사원 정보 테이블에서 입력된 날짜 이후 입사한 사원 정봅 출력
 */

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		oracleSQL ora = new oracleSQL();
		
		try {
			ora.makeConn();
			ora.emplHireDateSearch(date);
			ora.takeDown();
		}catch(Exception e) {}
		
	}
}
