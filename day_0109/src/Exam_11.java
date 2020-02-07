public class Exam_11 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79,0,1},{5,95,80,7,0,1},
						{2,79,88,77,0,1},{4,75,88,77,0,1},{3,95,88,75,0,1}};
		double avg[] = new double[5];
		
		
		//총점 계산
		for(int x=0;x<score.length;x++) {
			for(int y=1;y<score[x].length-2;y++) {
				score[x][4]+=score[x][y];
			}
			avg[x]=(int)(score[x][4]/3.*10+0.5)/10.;
		}
		
		//석차 계산
		for(int x=0; x<score.length;x++) {
			//int r=1;
			for(int y=0; y<score.length;y++) {
				if(score[x][4]<score[y][4]) // 총점 기준
					//r++;
					score[x][5]++;
			}
			//score[x][5]=r;
		}
		
		// 입력 자료 출력
				System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
				for(int x=0;x<score.length;x++) {
					for(int y=0;y<score[x].length-1;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println(avg[x]+"\t"+score[x][5]);
				}
	
		// 번호를 기준으로 오름차순 정렬
		for(int x=0;x<score.length;x++) {
			for(int y=x+1;y<score[x].length-1;y++) {
				if(score[x][0]>score[y][0]) {
					//정렬
					for(int i=0;i<score[x].length;i++) {
					int temp=score[x][i];
					score[x][i]=score[y][i];
					score[y][i]=temp;
					}
					double temp=avg[x];
					avg[x]=avg[y];
					avg[y]=temp;
				}
			}
		}
		System.out.println("---------------------출력----------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length-1;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(avg[x]+"\t"+score[x][5]);
		}
		
	}
}
