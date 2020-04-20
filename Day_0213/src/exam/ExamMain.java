package exam;

import java.util.Scanner;

import view.UI;

public class ExamMain {
	public static void main(String[] args) {
		UI ui = new UI();
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		while(true) {
			System.out.println("1: 목록(List)");
			System.out.println("2: 등록(Insert)");
			System.out.println("3: 검색(serch)");
			System.out.println("4: 수정(update)");
			System.out.println("5: 삭제(delete");
			System.out.println("6: 종료(exit)");
			System.out.print("메뉴 선택:");
			int menu = sc.nextInt();
			switch(menu) {
				case 1:
					// 전체목록 화면 메소드 호출
					ui.deptView();
					break;
				case 2:
					ui.deptInsert(sc);
					break;
				case 3:
					// 부서번호를 입력시 해당 부서 정보만 출력;
					ui.deptSerch(sc);
					break;
				case 4:
					// 부서번호, 부서명, 지역명 수정;
					ui.deptUpdate(sc);
					break;
				case 5:
					// 부서 번호를 이용한 삭제;
					ui.deptDelete(sc);
					break;
				case 6:
					// 종료;
				System.out.print("종료합니다.");
				flag =true;
				break;
			}
			if(flag) break;
		}
	}
}
