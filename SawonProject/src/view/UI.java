package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.EmployeeVO;
import model.SawonDAO;

public class UI {
	static SawonDAO dao = new SawonDAO();
	static SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일");
	static SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd");
	static Date date = new Date();

	public void EmpList() {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		list = dao.SawonList();
		System.out.println("사원번호\t이름\t업무명\t\t상사번호\t입사일자\t\t급여\t커미션\t부서명");
		for (EmployeeVO a : list) {
			System.out.print(a.getEno() + "\t" + a.getEname() + "\t");
			if (a.getJob() == null) {
				System.out.print("\t\t");
			} else if (a.getJob().length() < 8) {
				System.out.print(a.getJob() + "\t\t");
			} else
				System.out.print(a.getJob() + "\t");

			if (a.getManager() == 0)
				System.out.print("\t");
			else
				System.out.print(a.getManager() + "\t");

			System.out.print(a.getHiredate().substring(0, 10) + "\t");

			if (a.getSalary() == 0)
				System.out.print("\t");
			else
				System.out.print(a.getSalary() + "\t");

			if (a.getCommission() == 0)
				System.out.println("\t" + a.getDname());
			else
				System.out.println(a.getCommission() + "\t" + a.getDname());
		}
	}

	public void NewEmp(Scanner sc) {
		int manager = 0, salary = 0, commission = 0;
		String time = format.format(date);
		String time2 = format2.format(date);
		System.out.print("사원이름 :");
		String name = sc.next();
		sc.nextLine();
		System.out.print("업무명 :");
		String job = sc.nextLine();
		System.out.print("상사번호 :");
		String sangbun = sc.nextLine();
		if (!sangbun.isEmpty()) {
			manager = Integer.parseInt(sangbun);
		}
		System.out.print("입사일자(" + time + ") :");
		String hiredate = sc.nextLine();
		if (hiredate.isEmpty())
			hiredate = time2;
		System.out.print("급 여 :");
		String pay = sc.nextLine();
		if (!pay.isEmpty()) {
			salary = Integer.parseInt(pay);
		}
		System.out.print("커 미 션 :");
		String comit = sc.nextLine();
		if (!comit.isEmpty()) {
			commission = Integer.parseInt(pay);
		}
		dao.DList();
		System.out.print("부서번호 :");
		int dno = sc.nextInt();
		System.out.println("등록하시겠습니까?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			int check = dao.NewSawon(name, job, manager, hiredate, salary, commission, dno);
			if (check > 0)
				System.out.println("등록 성공");
			else
				System.out.println("등록 실패");
		} else
			System.out.println("등록 취소");
	}

	public void searchName(Scanner sc) {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		list = dao.SawonList();
		int row = 0;
		System.out.print("검색할 사원이름을 입력하세요");
		String name=sc.next().toUpperCase();
		
		for (EmployeeVO a : list) {
			System.out.println(a.getEname());
		}

	}

	public boolean exit(Scanner sc) {
		System.out.println("프로그램을 종료하시겠습니까?(y/n)");
		String yesno = sc.next();
		if (yesno.equalsIgnoreCase("y")) {
			return true;
		} else
			return false;

	}
}
