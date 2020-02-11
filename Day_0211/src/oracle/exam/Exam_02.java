package oracle.exam;
/* 키보드로 부서코드를 입력 받아서
 *  부서코드에 해당하는 부서 출력
 */

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서코드:");
		int dno = sc.nextInt();
		oracleSQL oracle = new oracleSQL();
		try {
			oracle.makeConn();
			
			oracle.deptSearchdno(dno);
			
			
			oracle.takeDown();
		}catch(Exception e) {}
		
	}
}
