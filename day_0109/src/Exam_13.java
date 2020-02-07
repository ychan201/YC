import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[10][6]; // 번호,국어,영어,수학,총점,석차
		String name[] = new String[10]; // 이름
		double avg[] = new double[10];  // 평균
		int cnt; // 실제 인원수
		for(cnt=0;cnt<10;cnt++) {
			System.out.print((cnt+1)+"번째 입력:");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) break;
			name[cnt]=sc.next();
			for(int x=1;x<4;x++) {
				score[cnt][x]=sc.nextInt();  	// 평균
				score[cnt][4]+=score[cnt][x];  // 총점
			}
			avg[cnt]=(int)(score[cnt][4]/3.*100+0.5)/100.; // 평균값
		}
		for(int x=0;x<cnt;x++) {
			score[x][5]++;
			for(int y=0;y<cnt;y++) {
				if(score[x][4]<score[y][4]) score[x][5]++;
			}
		}
		//테스트 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+name[x]+"\t");
			for(int y=1;y<5;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(avg[x]+"\t"+score[x][5]);
		}
	}
}
