package Student;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("ют╥б : ");
		int bun = sc.nextInt();
		String name = sc.next();
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		StudentHak st = new StudentHak(bun,name,arr);
		st.title();
		st.account();
		st.scoreMax();
		st.scoreSelection();
		st.scoreBubble();
	}
}
