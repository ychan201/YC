//15 - 24,25  (3��)
public class test_04 {
	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int cnt=0;
		for(int i=0;i<5;i++) {
			for(int j=4-i;j<5;j++) {
				cnt++;
				a[i][j]=cnt;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==0) System.out.print("\t");
				else System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}