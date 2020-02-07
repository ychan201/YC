package school;

import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School sch[] = new School[10];
		int cnt=0;
		while (cnt < 10) {
			System.out.print("입력:");
			String[] str = sc.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) break;
			if (str.length != 5) {
				System.out.println("입력오류");
				continue;
			}
			//sch[cnt]=new School();
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
			if(!bun.equals("")) {
				System.out.println("입력오류");
				continue;
			}
			int b = Integer.parseInt(str[0]);
			System.out.println(bun);
			cnt++;
		}
		System.out.println("입력종료");
	}
}
