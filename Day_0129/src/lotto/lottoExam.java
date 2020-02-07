package lotto;

import java.util.Random;
import java.util.Scanner;

public class lottoExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gcnt = 0;
		String str[];
		while (true) {
			System.out.print("게임 수 입력:");
			String gcn = sc.nextLine();
			if (numCheck(gcn)) {
				System.out.println("숫자를 입력해주세요");
				continue;
			}
			gcnt = Integer.parseInt(gcn);
			break;
		}

		while (true) {
			System.out.print("당첨번호 입력:");
			str = sc.nextLine().split(",");
			if (lengthCheck(str))
				continue;
			if (numArrayCheck(str))
				continue;
			break;
		}
		gamesu(gcnt, str);

	}
	
	
	
	
	
	
	
	

	static void gamesu(int cnt, String[] str) {
		lotto lt[] = new lotto[cnt];
		Random r = new Random();
		for (int j = 0; j < cnt; j++) {
			int game[] = new int[6];
			for (int i = 0; i < game.length; i++) {
				game[i] = r.nextInt(45) + 1;
				for (int k = 0; k < i; k++) {
					if (game[i] == game[k]) {
						i--;
						break;
					}
				}
			}

			lotto l = new lotto(game);
			lt[j] = l;
		}
		lottoData ld = new lottoData(lt, cnt, str);
		ld.dprint();
	}

	
	
	static boolean lengthCheck(String str[]) {
		if (!(str.length == 7)) {
			System.out.println("번호를 7개 입력해주세요.");
			return true;
		} else
			return false;
	}

	
	
	static boolean numCheck(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return true;
			}
		}
		return false;
	}

	static boolean numArrayCheck(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].charAt(j) < '0' || a[i].charAt(j) > '9') {
					System.out.println("숫자만 입력해주세요.");
					return true;
				}
			}
			if (Integer.parseInt(a[i]) > 45 || Integer.parseInt(a[i]) < 1) {
				System.out.println("1~45이내의 범위만 가능합니다.");
				return true;
			}
		}
		return false;
	}

}
