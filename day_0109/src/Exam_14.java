import java.util.Scanner;

/* 키보드로(번호 이름 국어 영어 수학 전산)
 * 입력 : 1 홍길동 77 88 99 80
 * . . . .
 * 입력 : -99  --> 입력 종료(최대10명)
 * 
 * 출력
 * 번호 이름 국어 영어 수학 전산 총점 평균
 *  .  .  .   .  .  .   .  .
 *  .  .  .   .  .  .   .  .
 *  합계     xx  xx  xx  xx xx
 *  평균     xx.x xx.x xx  xx xx
 *  전체 평균 이상인 학생 출력
 *  번호 이름 평균
 *   .   .  .
 * 처리조건
 * 1. 평균은 정수만(소수이하 버림).
 * 2. 전체 평균은 소수 이하 둘째 자리에서 반올림.
 */
public class Exam_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[11][7]; // 번호,국어,영어,수학,전산,총점,평균
		String name[] = new String[10]; // 이름
		double avg[] = new double[10];  // 평균
		int cnt; // 실제 인원수
		for(cnt=0;cnt<10;cnt++) {
			System.out.print((cnt+1)+"번째 입력:");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) break;
			name[cnt]=sc.next();
			for(int x=1;x<5;x++) {
				score[cnt][x]=sc.nextInt();
				score[cnt][5]+=score[cnt][x];  // 총점
				score[10][x]+=score[cnt][x]; //과목별 총점
			}
			score[cnt][6]=score[cnt][5]/4; // 평균값
			score[10][5]+=score[cnt][5];   // 총점 총합
		}
		
		
		//테스트 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t전산\t총점\t평균");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+name[x]+"\t");
			for(int y=1;y<7;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.print("합계"+"\t\t");
		for(int i=1;i<6;i++)
			System.out.print(score[10][i]+"\t");
		System.out.println();
		System.out.print("평균"+"\t\t");
		for(int i=1;i<6;i++)
			System.out.print((int)(score[10][i]/(double)cnt*100+0.5)/100.+"\t");
		System.out.println("\n------------------전체 평균 이상 인원------------------");
		System.out.println("번호\t이름\t평균");
		for(int i=0;i<cnt;i++) {
			if(score[i][5]>=score[10][5]/cnt) {
				System.out.print(score[i][0]+"\t"+name[i]+"\t"+score[i][6]);
			}
			System.out.println();
		}
	}
}
