package joinexam.ui;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import joinexam.dao.JoinDAO;
import joinexam.vo.JoinVO;

public class UI {
	JoinDAO dao = new JoinDAO();
	public void main() {
		System.out.println("[1] 회원 목록 보기");
		System.out.println("[2] 회원 정보 등록");
		System.out.println("[3] 로그인");
		System.out.println("[4] 회원 정보 검색");
		System.out.println("[5] 회원 정보 수정");
		System.out.println("[6] 회원 정보 삭제");
		System.out.println("[7] 프로그램 종료\n");
		System.out.print("[메뉴 선택 :");
	}

	public void joinList() {
		List<JoinVO> list = dao.joinList();
		System.out.println("[1.회원 목록 보기]");
		System.out.println("    === 전체 회원 목록 ===");
		System.out.println("전체 회원 수 :" + list.size() + " 명");
		System.out.println("아이디\t이름\t이메일\t\t등록일자");
		for (JoinVO a : list) {
			System.out.print(a.getUserid() + "\t" + a.getName() + "\t");
			System.out.println(a.getEmail() + "\t" + a.getRegdate().substring(0, 10));
		}

	}

	public void newJoin(Scanner sc) {
		System.out.println("[2.회원 정보 등록]");
		System.out.println("===회원정보 등록 ====");

		while (true) {
			dao = null;
			dao = new JoinDAO();
			String email,age;
			System.out.print("I  D :");
			String userid = sc.next();
			if (dao.checkid(userid)) {
				System.out.println(userid + "는 등록 가능합니다.");
				System.out.print("이름:");
				String name = sc.next();
				System.out.print("비밀번호:");
				String passwd = sc.next();
				sc.nextLine();
				while(true) {
				System.out.print("이메일:");
				email = sc.nextLine();
				if(email.isEmpty()) {
					email=null;
					break;
				}
				if(Pattern.matches("\\w+@\\w+.\\w+(\\.\\w+)?",email)) break;
				else continue;
				}
				while(true) {
				System.out.print("나이:");
				age = sc.nextLine();
				if(age.isEmpty()) {
					age="0";
					break;
				}
				if(Pattern.matches("[0-9]{1,3}", age)) break;
				else  continue;
				}
				int ck = dao.newJoin(userid, name, passwd, email, Integer.parseInt(age));
				
				if (ck > 0)
					System.out.println("등록성공");
				else
					System.out.println("등록 실패");
				break;
			} else
				System.out.println("이미 사용중인 아이디입니다. 다시입력하세요.");
		}
	}

	public void search(Scanner sc) {
		System.out.println("[4.회원 정보 검색]");
		System.out.println("===회원정보 검색 ====");
		while (true) {
			String con = null;
			System.out.println("ID(1) or 이름(2) 검색 :");
			String[] input = sc.next().split(",");
			if (input[0].equals("1")) {
				if (dao.checkid(input[1])) {
					System.out.println("등록된 자료가 없습니다.");
					System.out.println("다시검색할까요?(y/n)");
					con = sc.next();
				} else {
					searchID(input[1]);
					System.out.println("계속검색할까요?(y/n)");
					con = sc.next();
				}
				if (con.equals("y"))
					continue;
				else
					break;
			} else if (input[0].equals("2")) {
				if (dao.checkname(input[1])) {
					System.out.println("등록된 자료가 없습니다.");
					System.out.println("다시검색할까요?(y/n)");
					con = sc.next();
				} else {
					searchName(input[1]);
					System.out.println("계속검색할까요?(y/n)");
					con = sc.next();
				}
				if (con.equals("y"))
					continue;
				else
					break;
			}
		}
	}

	void searchID(String id) {
		JoinVO a = dao.searchID(id);
		System.out.println("I  D  :" + a.getUserid());
		System.out.println("이름        :" + a.getName());
		System.out.println("이메일     :" + a.getEmail());
		System.out.println("나이        :" + a.getAge());
		System.out.println("등록일     :" + a.getRegdate().substring(0, 10));
	}

	void searchName(String name) {
		JoinVO a = dao.searchName(name);
		System.out.println("I  D  :" + a.getUserid());
		System.out.println("이름        :" + a.getName());
		System.out.println("이메일     :" + a.getEmail());
		System.out.println("나이        :" + a.getAge());
		System.out.println("등록일     :" + a.getRegdate().substring(0, 10));
	}

	public void update(Scanner sc) {
		System.out.println("[5.회원 정보 수정]");
		System.out.println("===회원정보 수정 ====");
		while (true) {
			String con = null;
			System.out.print("ID 검색 :");
			String userid = sc.next();
			if (dao.checkid(userid)) {
				System.out.println("등록된 자료가 없습니다.");
				System.out.println("다시검색할까요?(y/n)");
				con = sc.next();
			} else {
				JoinVO a = dao.searchID(userid);
				System.out.println("I  D  :" + userid + "(변경불가)");
				System.out.print("이름(" + a.getName() + "):");
				sc.nextLine();
				String name = sc.nextLine();
				if (name.isEmpty())
					name = a.getName();
				System.out.print("비번(");
				for (int i = 0; i < a.getPasswd().length(); i++)
					System.out.print("*");
				System.out.print("):");
				String passwd = sc.nextLine();
				if (passwd.isEmpty())
					passwd = a.getPasswd();
				System.out.print("이메일(" + a.getEmail() + "):");
				String email = sc.nextLine();
				if (email.isEmpty())
					email = a.getEmail();
				System.out.print("나이(" + a.getAge() + "):");
				String age = sc.nextLine();
				if (age.isEmpty())
					age = Integer.toString(a.getAge());
				int ck = dao.update(name, passwd, email, age, userid);
				if (ck > 0)
					System.out.println(userid + "님의 정보가 수정되었습니다.");
				else
					System.out.println("변경 실패");
				System.out.println("다시검색할까요?(y/n)");
				con = sc.next();
			}
			if (con.equals("y"))
				continue;
			else
				break;
		}

	}

	public void delete(Scanner sc) {
		System.out.println("[6.회원 정보 삭제]");
		System.out.println("===회원정보 삭제 ====");
		System.out.print("ID 검색 :");
		String userid = sc.next();
		if (dao.checkid(userid)) {
			System.out.println("등록된 자료가 없습니다.");
		} else {
			JoinVO a = dao.searchID(userid);
			System.out.println("이름(ID)   :" + a.getName() + "(" + a.getUserid() + ")");
			System.out.println("이메일             :" + a.getEmail());
			System.out.print(a.getUserid() + "님의 정보를 삭제할까요?(y/n)");
			String con = sc.next();
			if (con.equals("y")) {
				int check = dao.delete(userid);
				if (check > 0)
					System.out.println(a.getUserid() + "님의 정보가 삭제되었습니다.");
				else
					System.out.println("삭제 실패");
			}
		}
	}

	public void login(Scanner sc) {
		int cnt = 0;
		System.out.println("=== 회원 로그인 ====");
		while (cnt < 3) {
			System.out.println("I  D  :");
			String userid = sc.next();
			if (dao.checkid(userid)) {
				System.out.println("등록된 아이디가 없습니다.");
				cnt++;
			} else {
				JoinVO a = dao.searchID(userid);
				System.out.println("PASS  :");
				String passwd = sc.next();
				if (passwd.equals(a.getPasswd())) {
					System.out.println(a.getName() + "님이 로그인하셨습니다.");
					break;
				} else {
					System.out.println("비밀번호가 맞지 않습니다.");
					cnt++;
				}
			}
		}
	}

}
