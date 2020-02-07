/* 1 6  11 16 21 
 * 2 7  12 17 22
 * 3 8  13 18 23
 * 4 9  14 19 24
 * 5 10 15 20 25
 */
public class Exam_08 {
	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				cnt++;
				a[j][i]=cnt;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
