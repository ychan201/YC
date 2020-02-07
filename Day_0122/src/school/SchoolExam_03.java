package school;

import java.util.Scanner;

public class SchoolExam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student sch[] = new Student[10];
		int cnt=0;
		while (cnt < 10) {
			System.out.print("입력:");
			String[] str = sc.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) break;
			if (str.length != 5) {
				System.out.println("?");
				System.out.println("입력오류");
				continue;
			}
						
			// 번호 오류체크 - str[0]
			String bun="";
			for(int x=0; x<str[0].length();x++) {
				char ch = str[0].trim().charAt(x); // trim() 문자열의 공백을 제거함. charAt 1문자씩 추출
				if(ch>='0' && ch<='9') { // 숫자를 판별함.
					bun+=ch; // String 변수인 bun에 ch를 이어서 더해줌( 문자 1개이기 때문에 )
				}else {
					bun="";
					break;
				}
			}
			if(bun.equals("")) {
				System.out.println("입력오류1");
				continue;
			}
			int b = Integer.parseInt(str[0]);
			if(b>10) {
				System.out.println("입력오류2");
				continue;
			}
			//각 점수 유효성 검사 -- 쿠타바레
			if(!scoreCheck(str[2])) {
				System.out.println("입력오류3");
				continue;
			}
			int kor = Integer.parseUnsignedInt(str[2]);
			if(!scoreCheck(str[3])) {
				System.out.println("입력오류4");
				continue;
			}
			int eng = Integer.parseUnsignedInt(str[3]);
			if(!scoreCheck(str[4])) {
				System.out.println("입력오류5");
				continue;
			}
			int mat = Integer.parseUnsignedInt(str[4]);
			sch[cnt]=new Student(b,str[2],kor,eng,mat);
			cnt++;
		}
		System.out.println("입력종료");
		
		School scl = new School(sch,cnt);
		scl.print();
		
	}
	
	
	static boolean scoreCheck(String str) {
		String temp="";
		for(int x=0; x<str.length();x++) {
			char ch = str.trim().charAt(x); // trim() 문자열의 공백을 제거함. charAt 1문자씩 추출
			if(ch>='0' && ch<='9') { // 숫자를 판별함.
				temp+=ch; // String 변수인 bun에 ch를 이어서 더해줌( 문자 1개이기 때문에 )
			}else {
				temp="";
				break;
			}
		}
		if(temp.equals("")) {
			return false;
		}
		
		int var = Integer.parseInt(temp);
		if(var>100) {
			return false;
		}
		
		return true;
	}
}
