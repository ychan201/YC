/* 2차원 배열
 * 첫번째 값이 배열 번호 - 2,3,4번째 값이 점수 
 */
public class Exam_01 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79},{5,95,80,70},
						{2,79,88,77},{4,75,88,77},{3,95,88,75}};
		
		// 입력 자료 출력
		System.out.println("번호\t국어\t영어\t수학");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[y].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
