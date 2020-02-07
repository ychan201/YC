import java.util.Scanner;

/* 키보드로 게임 수를 입력받아서 출력.
 * 게임수 : 5
 * 1 : 4 5 6 7 8 9 10
 * 2 : 5 6 7 8 9 10 11 
 */

public class Exam_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수:");
		int game = sc.nextInt();
		int[][] lotto = new int[50][6];

		for (int k = 0; k < game; k++) {
			for (int i = 0; i < lotto[k].length; i++) {
				lotto[k][i] = (int) (Math.random() * 45 + 1);
				// 중복체크
				for (int j = 0; j < i; j++) {
					if (lotto[k][i] == lotto[k][j]) {
						i--;
						break;
					}
				}
			}
		}
		for (int k = 0; k < game; k++) {
			System.out.print((k+1)+": ");
			sort(lotto[k]);
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
}
