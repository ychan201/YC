package reserv.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import reserv.dao.reservDAO;
import reserv.vo.reservVO;

public class UI {
	reservDAO dao = new reservDAO();
	public int mainmenu(Scanner sc) {
		System.out.println("[1] 도서 대출 예약 등록");
		System.out.println("[2] 도서 대출 현황 조회");
		System.out.println("[3] 도서 대출 예약 수정");
		System.out.println("[4] 도서 대출 반납 등록");
		String a="";
		while(true) {
			System.out.print("[메뉴 선택(1~4) :");
			a = sc.next();
			if(Pattern.matches("[1-4]{1}", a)) return Integer.parseInt(a);
		}
	}
	
	public void reserv(Scanner sc) {
		String lentno;
		while(true) {
			System.out.print("대출번호 :");
			lentno = sc.next();
			if(Pattern.matches("[0-9]{4}", lentno)) break;
			else System.out.println("다시 입력해주세요.");
		}
		System.out.print("고객성명 :");
		String custname = sc.next();
		sc.nextLine();
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
		String bookno;
		while(true) {
			System.out.print("도서코드 :");
			bookno = sc.next();
			if(Pattern.matches("[0-9]{3}", bookno)) break;
			else System.out.println("다시 입력해주세요.");
		}
		sc.nextLine();
		String outdate;
		while(true) {
			System.out.println("대출일자 :");
			outdate = sc.nextLine();
			if(Pattern.matches("[0-9]{4}-?[0-1]{1}[0-9]{1}-?[0-3]{1}[0-9]{1}", outdate)
					|| outdate.isEmpty()) {
				if(outdate.isEmpty()) outdate = null;
				break;
			}
			else System.out.println("다시 입력해주세요.");
		}
		System.out.println("반납일자 :");
		String conf;
		while(true) {
			System.out.println("등록합니다(y/n)?");
			conf = sc.next();
			if(Pattern.matches("y?n?{1}", conf))break;
		}
		if(conf.equals("y")) {
			int check = dao.newReserv(lentno, custname, phone, bookno, outdate);
			if(check>0) System.out.println("도서 대출 정보가 등록되었습니다.");
			else System.out.println("등록 실패");
			
		}
		else reserv(sc);
	}
	
	public void reservList() {
		
		List<reservVO> list = dao.reservList();
		System.out.println("대출번호\t고객성명\t전화번호\t\t도서코드\t대출일자\t\t반납일자\t\t대출상태");
		for(reservVO a :list) {
			System.out.print(a.getLentno()+"\t"+a.getCustname()+"\t"+a.getPhone()+"\t");
			System.out.print(a.getBookno()+"\t"+a.getOutdate()+"\t");
			if(a.getIndate()==null)System.out.print("\t\t");
			else System.out.print(indateForm((a.getIndate()))+"\t");
			if(a.getStatus()==null) System.out.println();
			else if(a.getStatus().equals("1")) System.out.println("대출중");
			else System.out.println("반납완료");
		}
	}
	
	public void update(Scanner sc) {
		System.out.println("대출번호 :");
		String lentno = sc.next();
		if(dao.checkLentNo(lentno)) {
			System.out.println("대출번호가 존재하지 않습니다.");
		}
		else {
			reservVO vo = dao.search(lentno);
			sc.nextLine();
			System.out.print("고객성명("+vo.getCustname()+") :");
			String custname = sc.nextLine();
			if(custname.isEmpty()) custname = vo.getCustname();
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
			String bookno;
			while(true) {
				System.out.print("도서코드("+vo.getBookno()+") :");
				bookno = sc.nextLine();
				if(Pattern.matches("[0-9]{3}", bookno)||bookno.isEmpty()) {
					if(bookno.isEmpty()) bookno = Integer.toString(vo.getBookno());
					break;
				}
				else System.out.println("다시 입력해주세요.");
			}
			
			String outdate;
			while(true) {
				System.out.print("대출일자("+vo.getOutdate()+") :");
				outdate = sc.nextLine();
				if(Pattern.matches("[0-9]{4}-?[0-1]{1}[0-9]{1}-?[0-3]{1}[0-9]{1}", outdate)
						|| outdate.isEmpty()) {
					if(outdate.isEmpty()) {
						if(vo.getOutdate()==null) outdate=null;
						else outdate = vo.getOutdate();
					}
					break;
				}
				else System.out.println("다시 입력해주세요.");
			}
			String indate;
			while(true) {
				System.out.print("반납일자("+vo.getOutdate()+") :");
				indate = sc.nextLine();
				if(Pattern.matches("[0-9]{4}[0-1]{1}[0-9]{1}[0-3]{1}[0-9]{1}", indate)
						|| indate.isEmpty()) {
					if(indate.isEmpty()) {
						if(vo.getIndate()==null) indate=null;
						else indate = vo.getIndate();
					}
					indate = indate.substring(2,8);
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
				int check = dao.update(custname, phone, bookno, outdate, indate, lentno);
				if(check>0) {
					System.out.println("도서 대출 정보가 수정되었습니다.");
					reservList();
				}
				else System.out.println("수정 실패");
				
			}
			else update(sc);
		}
	}
	
	public void inbook(Scanner sc) {
		SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		Date date = new Date();
		String time = format.format(date);
		System.out.println("대출번호 :");
		String lentno = sc.next();
		if(dao.checkLentNo(lentno)) {
			System.out.println("대출번호가 존재하지 않습니다.");
		}else {
			reservVO vo = dao.search(lentno);
			sc.nextLine();
			System.out.println("고객성명("+vo.getCustname()+") :");
			System.out.println("연락처("+vo.getPhone()+") :");
			System.out.println("도서코드("+vo.getBookno()+") :");
			System.out.println("대출일자("+vo.getOutdate()+") :");
			System.out.println("반납일자("+vo.getIndate()+") :");
			String conf;
			while(true) {
				System.out.println("도서반납을 처리합니다(y/n) ?");
				conf = sc.next();
				if(Pattern.matches("y?n?{1}", conf))break;
			}
			if(conf.equals("y")) {
				int check = dao.inbook(lentno,time);
				if(check>0) {
					System.out.println("도서 반납 완료");
					reservList();
				}
				else System.out.println("반납 실패");
				
			}
			else inbook(sc);
		}
	}
	
	
	String indateForm(String indate) {
		if(indate==null) return "";
		String form="";
		form += indate.substring(0,4)+"년";
		form += indate.substring(5,7)+"월";
		form += indate.substring(8,10)+"일";
		return form;
	}
}
