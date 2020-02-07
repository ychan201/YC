package student;
/*	1.키보드 입력
 * 	  입력 : 번호, 이름, 점수, 점수, 점수, 점수, 점수
 *  2. 처리조건
 *    - 입력 시 번호가 '0' 이면 입력 종료
 *    - 번호 중복시 입력 불가 하도록 처리
 *    - 총점을 기준으로 석차 부여
 *    - 1차 출력은 입력 자료 순으로 출력 후 
 *    - 2차 출력은 석차를 기준으로 출력 (set) 이용
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		while(true) {
			System.out.print("번호,이름,점수 5과목 입력 :");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("0")) break;
			if(numCheck(str) || lengthCheck(str)) continue;
			Student std = new Student(str);
			if (list.contains(std)) System.out.println("번호 중복입니다.");
			else list.add(std);
		}
		StudentData sd = new StudentData(list);
		sd.print();
		sd.sort();
		sd.print();
	}
	
	
	
	static boolean numCheck(String[] str) {
		for(int i=0;i<str.length;i++) {
			if (i==1);
			else for(int j=0;j<str[i].length();j++) {
					if(str[i].charAt(j)>'9' || str[i].charAt(j)<'0' ) {
					System.out.println("번호와 점수는 숫자만 입력해주세요.");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	static boolean lengthCheck(String[] str) {
		if (str.length==7) return false;
		else {
			System.out.println("번호,이름,점수,점수,점수,점수,점수 형식으로 입력해주세요.");
			return true;
		}
	}
}
