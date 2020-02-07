
public class Exam_09 {
	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int cnt=0,flag=0;
		for(int i=0;i<a.length;i++) {
			if(flag==0) {
				for(int j=0;j<a.length;j++) {
					cnt++;
					a[i][j]=cnt;
					flag=1;
				}
			}
			else for(int j=a.length-1;j>=0;j--) {
				cnt++;
				a[i][j]=cnt;
				flag=0;
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
