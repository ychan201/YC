package oracle.exam3;

import java.util.Scanner;

import oracle.dao.EmpDAO;
import oracle.dao.SawonDAO;
import oracle.dto.EmpDTO;

/* 키보드로 부서번호, 직급을 입력
 * 해당 사원 정보를 출력.
 */

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SawonDAO sa = new SawonDAO();
		System.out.print("부서번호 :");
		int dno = sc.nextInt();
		System.out.print("직급 :");
		String job = sc.next();
		EmpDAO edo = new EmpDAO();
		EmpDTO et = edo.selectEmp(dno, job);
		if(et !=null) {
			System.out.println("사원번호:"+et.getEno());
			System.out.println("사원번호:"+et.getEname());
		}else {
			System.out.println("등록된 자료가 없습니다.");
		}
	}
}
