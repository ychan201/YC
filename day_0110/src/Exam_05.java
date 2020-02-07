/* 
 * 
 */
public class Exam_05 {
	public static void main(String[] args) {
		String name="Java";
		int score[] = {90,67,78,89};
		aaa(name,score);
	}
	
	
	
	
	static void aaa(String a,int b[]) {
		int sum=0;
		System.out.print(a+" : ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"  ");
			sum += b[i];
		}
		System.out.print(sum+"  "+(int)(sum/(double)b.length*100+0.5)/100.);
	}
}
