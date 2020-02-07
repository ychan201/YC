public class Exam_07 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79,0},{5,95,80,7,0},
						{2,79,88,77,0},{4,75,88,77,0},{3,95,88,75,0}};
		
		
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length-1;y++) {
				score[x][4]+=score[x][y];
			}
		}
		
		// 입력 자료 출력
				System.out.println("번호\t국어\t영어\t수학");
				for(int x=0;x<score.length;x++) {
					for(int y=0;y<score[x].length;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println();
				}
	
		// 번호를 기준으로 오름차순 정렬
		for(int x=0;x<score.length;x++) {
			for(int y=x+1;y<score[x].length;y++) {
				if(score[x][0]>score[y][0]) {
					//번호정렬
					int temp=score[x][0];
					score[x][0]=score[y][0];
					score[y][0]=temp;
					//국어점수교환
					temp=score[x][1];
					score[x][1]=score[y][1];
					score[y][1]=temp;
					//영어점수교환
					temp=score[x][2];
					score[x][2]=score[y][2];
					score[y][2]=temp;
					//수학점수교환
					temp=score[x][3];
					score[x][3]=score[y][3];
					score[y][3]=temp;
					//총점교환
					temp=score[x][4];
					score[x][4]=score[y][4];
					score[y][4]=temp;
					
				}
			}
		}
		System.out.println("---------------------출력----------------------");
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
	}
}
