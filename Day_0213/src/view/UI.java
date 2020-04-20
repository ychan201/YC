package view;

import java.util.List;
import java.util.Scanner;

import model.DeptDAO;
import model.DeptVO;

// UI - DAO생성

public class UI {
	//목록 리스트
	public void deptView() {
		System.out.println("DNO\tDNAME\t\tLOC");
		// 메소드호출 및 출력
		DeptDAO a = new DeptDAO();
		List<DeptVO> list = a.viewList();
		for(DeptVO d :list) {
			System.out.println(d.getDno()+"\t"+d.getDname()+"\t\t"+d.getLoc());
		}
	}
	//등록
	public void deptInsert(Scanner sc) {
		System.out.println("부서정보 등록");
		System.out.print("부서 번호:");
		int dno = sc.nextInt();
		System.out.print("부서명:");
		String dname = sc.next();
		System.out.print("지역명:");
		String loc = sc.next();
		DeptDAO a = new DeptDAO();
		int flag = a.insertTable(dno,dname,loc);
		if(flag==1) System.out.println("등록성공");
		else System.out.println("등록 실패");
	}
	//수정
	public void deptUpdate(Scanner sc) {
		System.out.println("부서정보  수정");
		System.out.print("기존 부서 번호:");
		int bdno = sc.nextInt();
		System.out.print("변경 후 부서 번호:");
		int adno = sc.nextInt();
		System.out.print("변경 후 부서명:");
		String adname = sc.next();
		System.out.print("변경 후 지역명:");
		String aloc = sc.next();
		DeptDAO a = new DeptDAO();
		int flag = a.updateTable(bdno,adno,adname,aloc);
		if(flag>=1) System.out.println("등록성공");
		else System.out.println("변경 실패");
	}
	//검색
	public void deptSerch(Scanner sc) {
		System.out.print("검색 부서 번호:");
		int dno = sc.nextInt();
		DeptDAO a = new DeptDAO();
		List<DeptVO> list = a.SerchList(dno);
		System.out.println("DNO\tDNAME\t\tLOC");
		for(DeptVO d :list) {
			System.out.println(d.getDno()+"\t"+d.getDname()+"\t\t"+d.getLoc());
		}
	}
	//삭제
		public void deptDelete(Scanner sc) {
			System.out.print("삭제 부서 번호:");
			int dno = sc.nextInt();
			DeptDAO a = new DeptDAO();
			int flag = a.deleteTable(dno);
			if(flag==1) System.out.println("삭제성공");
			else System.out.println("삭제실패");
		}
}
