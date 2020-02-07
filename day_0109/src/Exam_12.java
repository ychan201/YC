import java.util.Scanner;

/* 키보드(학생성적정보입력(최대 10명)
 * 1. 입력(번호 이름 국어 영어 수학 )
 * 입력 : 1 홍길동 89 80 90
 * 입력 : 2 XXX xx xx xx
 * 입력 : 3 XXX xx xx xx
 * .  .   . . . . . . . .
 * 입력 : 10 XXX xx xx xx
 * 입력 : -99 종료
 * 
 * 2. 출력 -1
 *   번호 이름 국어 영어 수학 총점 평균 석차
 * 3. 출력 -2 석차를 기준으로 출력
 */

public class Exam_12 {
	public static void main(String[] args) {
		int score[][]=  new int[10][6];
		String[] str = new String[10];
		int cnt=0;
		double avg[] = new double[5];

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("입력"+(cnt+1)+":");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) {
				score[cnt][0]=0;
				break;}
			str[cnt] = sc.next();
			for(int i=1;i<4;i++) {
				score[cnt][i]=sc.nextInt();
			}
			cnt++;
			if(cnt==10)break;
		}
		
		
		//총점 계산
		for(int x=0;x<cnt;x++) {
			for(int y=1;y<score[x].length-2;y++) {
				score[x][4]+=score[x][y];
			}
			avg[x]=(int)(score[x][4]/3.*10+0.5)/10.;
		}
		
		//석차 계산
		for(int x=0; x<cnt;x++) {
			score[x][5]++;
			for(int y=0; y<score.length;y++) {
				if(score[x][4]<score[y][4]) // 총점 기준
					//r++;
					score[x][5]++;
			}
			//score[x][5]=r;
		}
		
		// 입력 자료 출력
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				for(int x=0;x<cnt;x++) {
					System.out.print(score[x][0]+"\t"+str[x]+"\t");
					for(int y=1;y<score[x].length-1;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println(avg[x]+"\t"+score[x][5]);
				}
	
		// 번호를 기준으로 오름차순 정렬
		for(int x=0;x<cnt-1;x++) {
			for(int y=x+1;y<cnt;y++) {
				if(score[x][5]>score[y][5]) {
					//정렬
					for(int i=0;i<score[x].length;i++) {
					int temp=score[x][i];
					score[x][i]=score[y][i];
					score[y][i]=temp;
					}
					String temp_1=str[x];
					str[x]=str[y];
					str[y]=temp_1;
					
					double temp=avg[x];
					avg[x]=avg[y];
					avg[y]=temp;
				}
			}
		}
		System.out.println("---------------------출력----------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+str[x]+"\t");
			for(int y=1;y<score[x].length-1;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(avg[x]+"\t"+score[x][5]);
		}
	}
}
