import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		int cnt=0;
		// 입력 자료 출력
			
		for(int x=0;x<score.length;x++) {
				System.out.print((cnt+1)+"번 입력번호:");
				score[x][0]=sc.nextInt();
				score[x][1]=sc.nextInt();
				score[x][2]=sc.nextInt();
				score[x][3]=sc.nextInt();
				cnt++;
			}
	

		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[y].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
