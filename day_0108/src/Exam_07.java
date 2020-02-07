
public class Exam_07 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[i].length;j++) {
				cnt++;
				a[i][j]=cnt;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) System.out.print("\t");
				else
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
