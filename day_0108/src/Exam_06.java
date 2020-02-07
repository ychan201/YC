/* 2차원 배열
 * 
 */
public class Exam_06 {
	public static void main(String[] args) {
		int[][] score = new int[5][4];//[row][col] 5x5 배열 , score - 주소 , score[0] - 주소
		score[0][0]=10;
		System.out.println("row:"+score.length);
		System.out.println("col:"+score[0].length);
		System.out.println("value:"+score[0][0]);
		
		int[] s = {1,2,3,4,5};
		int[][] ss = {{1,2,3},{1,2,3,4,5},{1,2}};
		System.out.println("row:"+ss.length);
		System.out.println("col:"+ss[1].length);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<ss.length;i++) {
			for(int j=0;j<ss[i].length;j++) {
				System.out.print(ss[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
