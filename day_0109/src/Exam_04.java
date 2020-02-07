/* 입력
 * 번호 국어 영어 수학
 * 
 * 출력
 * 번호 국어 영어 수학 총점 평균
 */

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][6];
		int cnt=0;
		// 입력 자료 출력
			
		for(int x=0;x<score.length;x++) {
				System.out.print((cnt+1)+"번 입력번호:");
				score[x][0]=sc.nextInt();
				score[x][1]=sc.nextInt();
				score[x][2]=sc.nextInt();
				score[x][3]=sc.nextInt();
				score[x][4]=score[x][1]+score[x][2]+score[x][3]; // 총점
				score[x][5]=score[x][4]/3; // 평균
				cnt++;
			}
	
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
