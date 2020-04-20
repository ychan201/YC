package oracle.exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.dao.EmpDAO;
import oracle.dao.SawonDAO;
import oracle.dto.EmpDTO;

/* 키보드 입력
 * 부서번호 또는 직급(업부명)이 같은 사원 정보 출력
 * where not dno=10;
 * where dno !=10; // dno<>10;
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SawonDAO sa = new SawonDAO();
		System.out.print("부서번호 :");
		int dno = sc.nextInt();
		System.out.print("직급 :");
		String job = sc.next().toUpperCase();
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		EmpDAO edo = new EmpDAO();
		list = edo.empSerchList(dno, job);
		if(list.isEmpty()) {
			System.out.println("정보가 없습니다.");
		}else {
			for(EmpDTO a: list) {
				System.out.print(a.getEno()+"\t");
				System.out.print(a.getEname()+"\t");
				System.out.print(a.getJob()+"\t");
				System.out.print(a.getManager()+"\t");
				System.out.print(a.getHiredate()+"\t");
				System.out.print(a.getSalary()+"\t");
				System.out.print(a.getCommission()+"\t");
				System.out.println(a.getDno());
			}
		}
	}
}
