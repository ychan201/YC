
public class Exam_10 {
	public static void main(String[] args) {
		int[][] a =new int[5][5];
		int k=0,c=1,i=0,j=-1;
		int f=a.length;
		while(true) {
			for(int n=0; n<f; n++) {
				k++;
				j+=c;
				a[i][j]=k;
			}
			f--;
			if(f<0)break;
			for(int n=0; n<f;n++) {
				k++;
				i+=c;
				a[i][j]=k;
			}
			c*=(-1);
		}
		
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<a.length;y++) {
				System.out.print(a[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
