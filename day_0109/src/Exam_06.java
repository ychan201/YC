/* 1  2  3  4  5  xx
 * 6  7  8  9  10 xx
 * 11 12 13 14 15 xx
 * 16 17 18 19 20 xx
 * 21 22 23 24 25 xx
 * xx xx xx xx xx xx
 */
public class Exam_06 {
	public static void main(String[] args) {
		int[][] a = new int[6][6];
		int cnt=0;
		
		
		// �Է�
		for(int x=0 ;x<a.length-1;x++) {
			for(int y=0;y<a[x].length-1;y++) {
				cnt++;
				a[x][y]=cnt;
				/* a[x][5]=a[x][y];
				 * a[5][y]=a[x][y];
				 * a[5][5]=a[x][y];
				 */
			}
		}
		
		// ��� (���κ� ����)
		for(int x=0 ;x<a.length-1;x++) {
			for(int y=0;y<a[x].length-1;y++) {
				a[x][a[0].length-1]+=a[x][y];
				a[5][5]+=a[x][y];
			}
		}
		// ��� ( ���� ����)
		for(int y=0 ;y<a.length-1;y++) {
			for(int x=0;x<a[x].length-1;x++) {
				a[a.length-1][y]+=a[x][y];
			}
		}
		
		
		
		
		
		// ���
		for(int x=0 ;x<a.length;x++) {
			for(int y=0;y<a[x].length;y++) {
				System.out.print(a[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
