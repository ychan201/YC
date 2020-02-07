
public class Exam_06 {
	public static void main(String[] args) {
		int m[]= {50000,10000,5000,1000,500,100,50,10,5,1};
		// int m[] = new int[10];
		// m[0]=50000;
		
		int money = 375654;
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]+" : "+money/m[i]);
			money=money-((money/m[i])*m[i]);
		}
	}
}
