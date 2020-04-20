package student.ui;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import student.dao.studentDAO;
import student.vo.studentVO;


public class UI {
	studentDAO dao = new studentDAO();
	
	public int main1(Scanner sc) {
		System.out.println("<학생정보관리 프로그램>");
		System.out.println("1.학생정보 관리");
		System.out.println("2.성적정보 관리");
		System.out.println("3.장학금 관리");
		System.out.println("4.프로그램 종료");
		System.out.print("선택 :");
		int a = sc.nextInt();
		return a;
	}
	
	public int main2(Scanner sc) {
		System.out.println("[1] 학생정보관리]");
		System.out.println("<학생정보 관리>");
		System.out.println("1.학생정보 입력");
		System.out.println("2.학생정보 조회[전체]");
		System.out.println("3.학생정보 검색");
		System.out.println("4.학생정보 변경");
		System.out.println("5.학생정보 삭제");
		System.out.println("6.첫 화면으로");
		System.out.print("선택 :");
		int a = sc.nextInt();
		return a;
	}
	
	public void main1select(int select,Scanner sc) {
		switch(select) {
		case 1: {
			int choice = main2(sc);
			switch(choice) {
				case 1:{
					while(true) {
					System.out.println("<학생정보 입력>");
					String bun;
					while(true) {
						System.out.print("학      번:");
					bun = sc.next();
					if(Pattern.matches("[0-9]{4}", bun)) {
						if(dao.checkbun(bun)) break;
						else System.out.println("학번이 중복되었습니다.");
					}
					else System.out.println("학번은 4자리를 입력해주세요.");
					}
					System.out.print("이      름:");
					String name = sc.next();
					System.out.print("주      소:");
					sc.nextLine();
					String addr = sc.nextLine();
					String email;
					while(true){
					System.out.print("전      화:");
					email = sc.nextLine();
					if(Pattern.matches("[0-9]{11}", email) || email.isEmpty()) break;
					else System.out.println("전화번호 11자리를 -를 제외하고 입력해주세요.");
					}
					System.out.print("생년월일:");
					String birth = sc.nextLine();
					System.out.println("등록하시겠습니까?(y/n)");
					String ok = sc.next();
					if(ok.equalsIgnoreCase("y")) {
					int check = dao.newStudent(Integer.parseInt(bun), name, addr, email, birth);
					if(check>0) System.out.println(name+"의 학생정보가 등록 되었습니다.");
					else System.out.println("등록 실패");
					}else System.out.println(name+"의 학생정보가 등록 취소되었습니다.");
					System.out.println("계속 등록할까요?(y/n)");
					ok=sc.next();
					if(ok.equalsIgnoreCase("y")) continue;
					else break;
					}
					main1select(main1(sc),sc); // 메인으로 돌아감
					break;
				}
				case 2: {
					List<studentVO> list = dao.studentList();
					System.out.println("<학생정보 조회>");
					System.out.println("총"+list.size()+"명의 학생을 조회합니다.\n");
					System.out.println("학번\t이름\t전화\t\t나이");
					for(studentVO a : list) {
						System.out.println(a.getBun()+"\t"+a.getName()+"\t"+a.getEmail()+"\t\t"+a.getTemp());
					}
					main1select(main1(sc),sc);
					break;
				}
				case 3:{
					System.out.println("<학생정보 검색>\n");
					System.out.println("1.이름으로 검색");
					System.out.println("2.학번으로 검색");
					System.out.println("3.학년으로 검색");
					System.out.println("4.검색 취소");
					System.out.print("선택 :");
					switch(sc.nextInt()) {
						case 1: {
							System.out.println("학생이름 입력:");
							String name = sc.next();
							List<studentVO> list=dao.searchName(name);
							System.out.println("총 "+list.size()+"명이 검색되었습니다.");
							System.out.println("학번\t이름\t학년\t주소\t\t전화\t\t생년월일");
							for(studentVO a :list) {
								String year = Integer.toString(a.getBun());
								System.out.print(a.getBun()+"\t"+a.getName()+"\t"+year.charAt(1)+"\t");
								System.out.println(a.getAddr()+"\t\t"+a.getEmail()+"\t\t"+a.getBirth().substring(0,10));
							}
							main1select(main1(sc),sc);
							break;
						}
						case 2:{
							System.out.println("학번 입력:");
							int bun = sc.nextInt();
							if(dao.checkbun(Integer.toString(bun))) {
								System.out.println("학번이 존재하지 않습니다.");
							}else {
							List<studentVO> list=dao.searchBun(bun);
							System.out.println("학번\t이름\t주소\t\t전화\t\t생년월일");
							for(studentVO a :list) {
								System.out.print(a.getBun()+"\t"+a.getName()+"\t");
								System.out.println(a.getAddr()+"\t\t"+a.getEmail()+"\t\t"+a.getBirth().substring(0,10));
							}
							}
							main1select(main1(sc),sc);
							break;
						}
						case 3: {
							System.out.println("학년으로 검색");
							System.out.print("학년 :");
							int hak = sc.nextInt();
							List<studentVO> list=dao.searchHak(hak);
							System.out.println("학번\t이름\t주소\t\t전화\t\t생년월일");
							for(studentVO a :list) {
								System.out.print(a.getBun()+"\t"+a.getName()+"\t");
								System.out.println(a.getAddr()+"\t\t"+a.getEmail()+"\t\t"+a.getBirth().substring(0,10));
							}
							break;
						}
						case 4: {
							main1select(main1(sc),sc);
							break;
						}
					}
					break;
				}
				case 4: {
					while(true){
					System.out.println("<학생정보 수정>\n");
					System.out.print("학번입력 :");
					int bun = sc.nextInt();
					if(bun==0000) main1select(1,sc);
					if(dao.checkbun(Integer.toString(bun))) {
						System.out.println("학번이 존재하지 않습니다.");
						continue;
					}else {
					List<studentVO> list=dao.searchBun(bun);
					studentVO a = list.get(0);
					sc.nextLine();
					System.out.print("이름("+a.getName()+"):");
					String name = sc.nextLine();
					if(name.isEmpty()) {
						if(a.getName().isEmpty()) name=null;
						else name = a.getName();
					}
					System.out.print("주소("+a.getAddr()+"):");
					String addr = sc.nextLine();
					if(addr.isEmpty()) {
						if(a.getAddr()==null) addr=null;
						else addr = a.getAddr();
					}
					System.out.print("전화("+a.getEmail()+"):");
					String email = sc.nextLine();
					if(email.isEmpty()) {
						if(a.getEmail()==null) email=null;
						else email = a.getEmail();
					}
					if(a.getBirth()==null) {
						 System.out.print("생년월일("+a.getBirth()+"):");
					}else System.out.print("생년월일("+a.getBirth().substring(0,10)+"):");
					String birth = sc.nextLine();
					if(birth.isEmpty()) {
						if(a.getBirth()==null) birth=null;
						else birth = a.getBirth().substring(0,10);
					}
					int check = dao.update(name, addr, email, birth, bun);
					if(check>0) System.out.println(name+"학생 정보가 수정이 완료되었습니다.");
					else System.out.println("수정에 실패하였습니다.");
					}
					break;
					}
					main1select(1,sc);
					break;
				}
				case 5: {
					while(true) {
					System.out.println("<학생정보 삭제>");
					System.out.print("학번 입력:");
					String bun = sc.next();
					if(bun.equals("0000"))main1select(1, sc);
					if(Pattern.matches("[0-9]{4}", bun)) {
						if(dao.checkbun(bun)) {
							System.out.println("학생 정보가 존재하지 않습니다");
							continue;
						}
						else dao.delete(Integer.parseInt(bun));
					}else System.out.println("학번은 숫자 4자리입니다.");
					
					break;
					}
					break;
				}
				case 6:{
					main1select(main1(sc),sc);
					break;
				}
				
			}
			break;
		}
		case 2:break;
		case 3:break;
		case 4: System.out.println("프로그램 종료"); break;
	}
	}
}