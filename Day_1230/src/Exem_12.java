// 1. 세개의 정수중 대
// 2. 세개의 정수중 소
// 조건 연산자 (조건식)? 참 : 거짓; 
import java.util.Scanner;

public class Exem_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();

		int max, med, min;
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					med=b;
					min=c;
				}else {
					med=c;
					min=b;
				}
			}else {
				max=c;
				med=a;
				min=b;
			}
			
			System.out.print("정수 1: " + a +"\t");
			System.out.print("정수 2: " + b +"\t");
			System.out.print("정수 3: " + c +"\t");
			System.out.print("중앙값 : " + med);
		}
	}

}
