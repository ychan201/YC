package student;

import java.util.Scanner;

public class StudenExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Student[] st = new Student[10];
		while (cnt < 10) {
			System.out.print("입력 :");
			String[] s = sc.nextLine().split(",");
			if (s[0].equalsIgnoreCase("end"))
				break;
			if (isNumber(s[0]) && isNumber(s[2]) && isNumber(s[3]) && isNumber(s[4])) {
				int bun = Integer.parseInt(s[0]);
				int kor = Integer.parseInt(s[2]);
				int eng = Integer.parseInt(s[3]);
				int mat = Integer.parseInt(s[4]);

				if (1 <= bun && bun <= 10) {
					if (1 <= s[1].length() && s[1].length() <= 10) {
						if (1 <= kor && kor <= 100) {
							if (1 <= eng && eng <= 100) {
								if (1 <= mat && mat <= 100) {
									st[cnt] = new Student(s[0], s[1], s[2], s[3], s[4]);
									cnt++;
								} else
									System.out.println("다시입력하세요.");
							} else
								System.out.println("다시입력하세요.");
						} else
							System.out.println("다시입력하세요.");
					} else
						System.out.println("다시입력하세요.");
				} else
					System.out.println("다시입력하세요.");
			} else
				System.out.println("다시입력하세요.");
		}

		School scl = new School(st, cnt);
		scl.print();

	}

	static boolean isNumber(String str_num) {
		try {
			int str = Integer.parseInt(str_num);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
