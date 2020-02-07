
public class Exam_04 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b=100;
		bPrint(b);
		aPrint(a);
		int c[][] = {{10,20,30},{20,30,40},{30,40,50}};
		cPrint(c);
	}
	static void aPrint(int a[]) {
		int b[]= a;
		for(int x=0; x<b.length;x++) 
			System.out.println(b[x]);
	}
	static void bPrint(int b) {
		System.out.println(b);
	}
	
	static void cPrint(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
		}
	}
}
