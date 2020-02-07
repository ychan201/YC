import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][6];
		int cnt=0,sum=0,avg=0;

		for(int x=0;x<score.length;x++) {
				System.out.print((cnt+1)+"번 입력번호:");
				score[x][0]=sc.nextInt();
				score[x][1]=sc.nextInt();
				score[x][2]=sc.nextInt();
				score[x][3]=sc.nextInt();
				cnt++;
			}
	
		// 입력 자료 출력
		
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length-2;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
		// 총점 평균
		for(int x=0; x<score.length;x++) {
			for(int y=1;y<4;y++)
			score[x][4]+=score[x][y];
			score[x][5]=score[x][4]/3;
		}
		
		
		
		System.out.println("----------------------출력-------------------------");
		// 출력 자료 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	
	}
}
