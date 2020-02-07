// 1. 세개의 정수중 대
// 2. 세개의 정수중 소
// 조건 연산자 (조건식)? 참 : 거짓; 
import java.util.Scanner;

public class Exem_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();

		int max = (a>b)? a : b;
		max=(max<c)? c: max;
	}

}
