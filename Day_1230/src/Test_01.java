import java.util.Scanner;
public class Test_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		int med=0;
		
		int max, med, min;
		if(b<a) {
			if(b>c) {
				med=b;
				if(a>c) {
					max=a;
					min=c;
				}else {
					max=c;
					min=a;
				}
			}else {
				max=b;
				med=c;
				min=a;
			}
			
			System.out.print("정수 1: " + a +"\t");
			System.out.print("정수 2: " + b +"\t");
			System.out.print("정수 3: " + c +"\t");
			System.out.print("중앙값 : " + med);

	}

}
