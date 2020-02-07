//00, 11,22  (2¹ø)
public class test_03 {
	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
				cnt++;
				a[i][j]=cnt;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]!=0) 
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}