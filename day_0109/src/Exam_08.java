public class Exam_08 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79,0},{5,95,80,7,0},
						{2,79,88,77,0},{4,75,88,77,0},{3,95,88,75,0}};
		
		
		for(int x=0;x<score.length;x++) {
			for(int y=1;y<score[x].length-1;y++) {
				score[x][4]+=score[x][y];
			}
		}
		
		// 입력 자료 출력
				System.out.println("번호\t국어\t영어\t수학");
				for(int x=0;x<score.length;x++) {
					for(int y=1;y<score[x].length;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println();
				}
	
		// 번호를 기준으로 오름차순 정렬
		for(int x=0;x<score.length;x++) {
			for(int y=x+1;y<score[x].length;y++) {
				if(score[x][0]>score[y][0]) {
					//정렬
					for(int i=0;i<score[x].length;i++) {
					int temp=score[x][i];
					score[x][i]=score[y][i];
					score[y][i]=temp;
					}
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
