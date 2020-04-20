package shop.ui;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import shop.dao.ShopDAO;
import shop.vo.ShopVO;

public class UI {
	ShopDAO dao = new ShopDAO();

	public int mainmenu(Scanner sc) {
		System.out.println("[1] 회원정보 등록");
		System.out.println("[2] 회원정보현황 조회");
		System.out.println("[3] 회원정보 수정");
		System.out.println("[4] 회원정보 삭제");
		String a = "";
		while (true) {
			System.out.print("[메뉴 선택(1~4) :");
			a = sc.next();
			if (Pattern.matches("[1-4]{1}", a))
				return Integer.parseInt(a);
		}
	}

	public void Join(Scanner sc) {
		String cno;
		while(true) {
			System.out.print("회원번호 :");
			cno = sc.next();
				if(Pattern.matches("[0-9]{6}", cno)) {
					if(dao.checkCno(cno)) break;
					else System.out.println("회원번호가 중복되었습니다. 다시입력해주세요.");
					}
				else System.out.println("다시 입력해주세요.");
		}
		sc.nextLine();
		System.out.print("회원이름 :");
		String cname = sc.nextLine();
		if(cname.isEmpty()) cname=null;
		
		String phone;
		while(true) {
			System.out.print("연락처 :");
			phone = sc.nextLine();
			if(Pattern.matches("01[0-9]{1}-[0-9]{4}-[0-9]{4}", phone)||phone.isEmpty()) {
				if(phone.isEmpty()) {
					phone=null;
				}
				break;
			}
			else System.out.println("다시 입력해주세요.");
		}
		String gender;
		while(true) {
			System.out.print("성별 :");
			gender = sc.nextLine().toUpperCase();
			if(Pattern.matches("[M]?[F]?{1}", gender) || gender.isEmpty()) {
				if(gender.isEmpty()) gender=null;
				break;
			}
			else System.out.println("다시 입력해주세요.");
		}
		String grade;
		while(true) {
			System.out.println("회원등급 :");
			grade = sc.nextLine().toUpperCase();
			if(Pattern.matches("[A-C]?[a-c]?{1}", grade) || grade.isEmpty()) {
				if(grade.isEmpty()) grade = null;
				break;
			}
			else System.out.println("다시 입력해주세요.");
		}
		String conf;
		while(true) {
			System.out.println("등록합니다(y/n)?");
			conf = sc.next();
			if(Pattern.matches("y?n?{1}", conf))break;
		}
		if(conf.equals("y")) {
			int check = dao.Join(cno, cname, phone, gender, grade);
			if(check>0) System.out.println("회원 정보가 등록되었습니다.");
			else System.out.println("등록 실패");
			
		}
		else Join(sc);
	}

	public void ShopList() {

		List<ShopVO> list = dao.ShopList();
		System.out.println("회원번호\t이름\t연락처\t\t성별\t가입일자\t\t회원등급");
		for (ShopVO a : list) {
			System.out.print(a.getCno() + "\t" + a.getCname() + "\t" + a.getPhone() + "\t");
			if (a.getGender() == null)
				System.out.print("\t");
			else if (a.getGender().equals("M"))
				System.out.print("남자");
			else
				System.out.print("여자");

			if (a.getJoindate() == null)
				System.out.print("\t");
			else
				System.out.print("\t" + a.getJoindate().substring(0, 10) + "\t");

			if (a.getGrade() == null)
				System.out.println("\t");
			else if (a.getGrade().contentEquals("A"))
				System.out.println("VIP\t");
			else if (a.getGrade().contentEquals("B"))
				System.out.println("일반\t");
			else if (a.getGrade().contentEquals("C"))
				System.out.println("직원\t");
		}
	}
	
	public void update(Scanner sc) {
		System.out.print("회원번호 :");
		String cno = sc.next();
		if(dao.checkCno(cno)) {
			System.out.println("회원번호가 존재하지 않습니다.");
		}
		else {
			ShopVO vo = dao.search(cno);
			sc.nextLine();
			System.out.print("고객성명("+vo.getCname()+") :");
			String cname = sc.nextLine();
			if(cname.isEmpty()) {
				if(vo.getCname()==null) cname =null;
				else cname = vo.getCname();
			}
			String phone;
			while(true) {
				System.out.print("연락처("+vo.getPhone()+") :");
				phone = sc.nextLine();
				if(Pattern.matches("01[0-9]{1}-[0-9]{4}-[0-9]{4}", phone) || phone.isEmpty()) {
					if(phone.isEmpty()) {
						if(vo.getPhone()==null) phone=null;
						else phone = vo.getPhone();
					}
					break;
				}
				else System.out.println("다시 입력해주세요.");
			}
			String gender;
			while(true) {
				System.out.print("성별("+vo.getGender()+") :");
				gender = sc.nextLine().toUpperCase();
				if(Pattern.matches("[M]?[F]?{1}", gender)||gender.isEmpty()) {
					if(gender.isEmpty()) gender = vo.getGender();
					break;
				}
				else System.out.println("다시 입력해주세요.");
			}
			
			String grade;
			while(true) {
				System.out.print("회원등급("+vo.getGrade()+") :");
				grade = sc.nextLine().toUpperCase();
				if(Pattern.matches("[A-C]{1}", grade)
						|| grade.isEmpty()) {
					if(grade.isEmpty()) {
						if(vo.getGrade()==null) grade=null;
						else grade = vo.getGrade();
					}
					break;
				}
				else System.out.println("다시 입력해주세요.");
			}
			
			String conf;
			while(true) {
				System.out.print("수정합니다(y/n) ? :");
				conf = sc.next();
				if(Pattern.matches("y?n?{1}", conf))break;
			}
			if(conf.equals("y")) {
				int check = dao.update(cname, phone, gender, grade, cno);
				if(check>0) {
					System.out.println("회원 정보가 수정되었습니다.");
				}
				else System.out.println("수정 실패");
				
			}
			else update(sc);
		}
	}
	
	public void delete(Scanner sc) {
		System.out.print("회원번호 :");
		String cno = sc.next();
		if(dao.checkCno(cno)) {
			System.out.println("회원번호가 존재하지 않습니다.");
		}
		else {
			ShopVO vo = dao.search(cno);
			System.out.println("고객성명("+vo.getCname()+")");
			System.out.println("연락처("+vo.getPhone()+")");
			System.out.println("성별("+vo.getGender()+")");
			System.out.println("회원등급("+vo.getGrade()+")");
		}
		String conf;
		while(true) {
			System.out.print("삭제합니다(y/n) ? :");
			conf = sc.next();
			if(Pattern.matches("y?n?{1}", conf))break;
		}
		if(conf.equals("y")) {
			int check = dao.delete(cno);
			if(check>0) {
				System.out.println("회원 정보가 삭제되었습니다.");
			}
			else System.out.println("삭제 실패");
			
		}
		else delete(sc);
	}
}
