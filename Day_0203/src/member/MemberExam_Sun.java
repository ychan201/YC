package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 키보드 입력
 * 아이디, 이름, 나이입력 Member 객체를 생성
 * 입력시 아이디가 'end' 이면 전체 출력
 *  - ArrayList 이용
 *  - 아이디가 같은 경우 "중복된 아이디입니다." 문장 출력 후 재입력
 * 다음과 같이 출력
 *  아이디  이름   나이
 * user01 홍길동   29
 *    .     .     .
 *    
 */

public class MemberExam_Sun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		while(true) {
			System.out.print("아이디,이름,나이 입력:");
			String s[] = sc.nextLine().split(",");
			if(s[0].equals("end")) break;
			else if(strCheck(s)) continue;
			else if(ageCheck(s)) continue;	
			
			Member m = new Member(s[0],s[1],s[2]);
			boolean bool = list.contains(m);
			if(bool) {
				System.out.println("중복");
			}
			else {
				list.add(m);
			}
		}
		
		
		for(Member m : list) {
			System.out.println(m);
		}
		
		
	}
		
	static boolean strCheck(String[] str) {
		
			if(str.length==3) {
				return false;
		}
			System.out.println("아이디,이름,나이 형식으로 입력해주세요");
		return true;
	}
	
	static boolean ageCheck(String[] str) {
		for(int i=0;i<str[2].length();i++) {
			if(str[2].charAt(i)>'9' || str[2].charAt(i)<'0') {
				System.out.println("나이는 숫자만 입력해주세요");
				return true; 
			}
		}
		
	return false;
}
	
}
