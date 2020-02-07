import java.util.Scanner;

 

/* 키보드로 게임수 입력

 * 게임수 : 5

 * 1: 19 20 34 35 43

 * 처리조건

 * 1게임당 가상으로 100게임 후 발생 빈도가 높은

 * 6개의 숫자를 추출 해서 출력

 * 

 */

public class test{

 

	public static void main(String[] args) {

 

		Scanner scn = new Scanner(System.in);

		int m[][] = new int[2][45];

		int lotto[] = new int[6];

		int cnt1 = 0;

		int cnt2 = 0;

		int cnt = scn.nextInt();
		
		int sum=0;

 

		for (int x = 0; x < m[0].length; x++) { // 1~45까지 쓰기
			sum+=1;
			m[0][x] += sum;

		}

		while (cnt2 < cnt) {

			while (cnt1 < 100) { // 100번 게임

				for (int x = 0; x < 6; x++) {

					lotto[x] = (int) (Math.random() * 45) + 1;

					for (int y = 0; y < x; y++) {

						if (lotto[x] == lotto[y]) {

							x--;

							break;

						}

					}

				}

				// 빈도수가 많으면 +1

				for (int x = 0; x < 6; x++) {

					for (int y = 0; y < 45; y++) {

						if (lotto[x] == m[0][y]) {

							m[1][y] += 1;

						}

					}

				}

				cnt1++;

			}

			// 빈도수가 많은수대로 내림차순

			for (int x = 0; x < 45 - 1; x++) {

				for (int y = x + 1; y < 45; y++) {

					if (m[1][x] < m[1][y]) {
							
						int temp = m[0][x];
						int temp1 = m[1][x];
						m[0][x] = m[0][y];
						m[1][x] = m[1][y];
						m[0][y] = temp;
						m[1][y] = temp1;

					}

				}

			}

			// 빈도수가 많은 수 추출

			for (int x = 0; x < 6; x++) {

				lotto[x] = m[0][x];

			}

			// 빈도수가 많았던 수 출력

			System.out.println("출력 :");

			for (int x = 0; x < lotto.length; x++) {

				System.out.print(lotto[x] + "\t");

			}

			System.out.println();

			cnt2++;

 

		}

		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}

	}

 

}
