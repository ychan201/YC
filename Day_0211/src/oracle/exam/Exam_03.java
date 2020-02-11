package oracle.exam;
/* 키보드로 부서번호를 입력 받아서
 * 부서번호에 해당하는 사원정보 출력(employee)
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 입력:");
		int dno = sc.nextInt();
		oracleSQL oracle = new oracleSQL();
		try {
			oracle.makeConn();
			oracle.employeeInfo(dno);			
			oracle.takeDown();
		}catch(Exception e) {}
		
	}
}