import java.util.Scanner;

import view.UI;

public class SawonMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UI ui = new UI();
		boolean flag = false;
		while (true) {
			System.out.println("====================================");
			System.out.println("=     사원 &부서관리 프로그램  Ver 1.0      =");
			System.out.println("====================================");
			System.out.println("        [1] 사원 전체 목록");
			System.out.println("        [2] 신규 사원 등록");
			System.out.println("        [3] 사원 검색");
			System.out.println("        [4] 사원 정보 수정");
			System.out.println("        [5] 사원 정보 삭제");
			System.out.println("        [6] 프로그램 종료");
			System.out.println("-----------------------------------");
			System.out.println("해당항목을 선택하세요 ? _");
			System.out.println("====================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ui.EmpList();
				if (mainmenu())
					flag = true;
				break;
			}
			case 2: {
				ui.NewEmp(sc);
				if (mainmenu())
					flag = true;
				break;
			}
			case 3: {
				ui.searchName(sc);
				if (mainmenu())
					flag = true;
				break;
			}

			case 4: {
				if (mainmenu())
					flag = true;
				break;
			}
			case 5: {
				if (mainmenu())
					flag = true;
				break;
			}
			case 6: {
				if(ui.exit(sc))
					flag = true;
				break;
			}
			
			
			}
			if (flag)
				break;
		}
		System.out.println("프로그램 종료");
	}

	static boolean mainmenu() {
		System.out.print("메인메뉴로 이동합니다(Enter) ?");
		sc.nextLine();
		String temp = sc.nextLine();
		if (temp.isEmpty())
			return false;
		else
			return true;
	}

}
