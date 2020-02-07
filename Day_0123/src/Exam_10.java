import java.util.Scanner;

/* 키보드로 게임 수 입력
 * 게임수 : 5
 * 1 : 15 34 35 40 43
 *    .      .   .
 * 5 : 1 10 17 23 27 34
 * 처리조건
 * 1게임당 가상으로 100게임 후 발생 빈도가 높은
 * 6개의 숫자를 추출해서 출력
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수:");
		int game = sc.nextInt();
		int[][] lotto = new int[100][6];
		int a[] = {1,5,4,3,2,87,8,5,4};

		for (int k = 0; k < game; k++) {
			int[][] bindo = new int[45][2];
			for(int i=0;i<bindo.length;i++) {
				bindo[i][0]=i+1;
			}
			for (int r = 0; r < 100; r++) {
				for (int i = 0; i < lotto[k].length; i++) {
					lotto[k][i] = (int) (Math.random() * 45 + 1);
					bindo[lotto[k][i]-1][1]++;
					
					// 중복체크
					
					for (int j = 0; j < i; j++) {
						if (lotto[k][i] == lotto[k][j]) {
							bindo[lotto[k][i]-1][1]--;
							i--;
							break;
						}
					}
				}
			}
			sort2(bindo);
			for(int i=0;i<lotto[k].length;i++) {
				lotto[k][i] = bindo[i][0];
			}
			sort(lotto[k]);
			
		}
		
		
		
		
		
		
		
		
		
		for (int k = 0; k < game; k++) {
			System.out.print((k + 1) + ": ");
			for (int i = 0; i < lotto[k].length; i++) {
				System.out.print(lotto[k][i] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	static void sort2(int[][] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][1] < a[j][1]) {
					int temp = a[i][0];
					int temp1 = a[i][1];
					a[i][0] = a[j][0];
					a[i][1] = a[j][1];
					a[j][0] = temp;
					a[j][1] = temp1;
				}
			}
		}
	}
}
