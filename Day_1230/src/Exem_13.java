// 1. 세개의 정수중 대
// 2. 세개의 정수중 소
// 조건 연산자 (조건식)? 참 : 거짓; 
import java.util.Scanner;

public class Exem_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		if(a<b) {
			int imsi = a;
			a=b;
			b=imsi;
		}
		if(a<c) {
			int imsi = a;
			a=c;
			c=imsi;
		}
		if(b<c) {
			int imsi = b;
			b=c;
			c=imsi;
		}
		
		
	}

}
