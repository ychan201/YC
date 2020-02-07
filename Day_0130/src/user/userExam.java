package user;
/* 클래스 배열을 이용한 검색 기능 구현
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class userExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		user us[] = new user[10];
		// 입력 
		while(cnt<10) {
			user u = new user();
			System.out.println("회원정보 입력");

			// 회원이름 입력
			System.out.print("회원 이름 :");
			String str = sc.nextLine();
			if(str.equals("end")||str==null) break;
			u.name = str;
			
		
			
			// ID입력받는 반복문, 아이디 중복 검사
			while(true) {
			System.out.print("회원 ID :");
			str = sc.nextLine();
			if(idCheck(str,us,cnt)) {
				System.out.println("회원 아이디 중복, 다시입력해주세요.");
				continue;
			}
			if(idCheck(str)) {
				System.out.println("아이디는 숫자,영문자만 입력 가능합니다. 다시입력해주세요.");
				continue;
			}
			u.userid = str;
			break;
			}
			
			// e-mail 주소 입력받는 반복문
			while(true) {
			System.out.print("e-mail :");
			str = sc.nextLine();
			if(emailCheck(str)) {
			u.email = str;
			u.bun = cnt+1;
			us[cnt]=u;
			cnt++;
			break;
			}
			else {
				System.out.println("이메일 형식에 맞게 입력해주세요.");
				continue;
			}
			}
		}
		System.out.println("고유번호\t이름\tID\t이메일");
		for(int i=0;i<cnt;i++) {
			System.out.println(us[i]);
		}
		
		// 검색
		
		System.out.println("----------------------검색-----------------------");
		while(true) {
		System.out.print("검색(ID):");
		String serch = sc.nextLine();
		if(serch.equalsIgnoreCase("end")) {
			System.out.println("프로그램 종료");
			break;
		}
		idSearch(serch,us,cnt);
		}
	}
	
	
	
	
	
	
	static boolean idCheck(String a,user[] u,int cnt) {
		for(int i=0;i<cnt;i++) {
			if(u[i].userid.equals(a)) {
				return true;
			}
		}
		return false;
	}
	
	static void idSearch(String id,user[] u,int cnt) {
		boolean flag=true;
		for(int i=0;i<cnt;i++) {
			if(u[i].userid.equals(id)) {
				System.out.println("고유번호\t이름\tID\t이메일");
				System.out.println(u[i]);
				flag=false;
				break;
			}
		}
		if(flag) System.out.println("해당정보 없음");
	}
	
	static boolean emailCheck(String str) {
		boolean bool = Pattern.matches("\\w+@\\w+.\\w+(.\\w+)?", str);
		return bool;
	}
	
	static boolean idCheck(String str) {
		boolean bool = Pattern.matches("\\w+", str);
		return !(bool);
	}
}
