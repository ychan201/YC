// 1. 세개의  소스코드를 메일로 보내면 수업끝.
import java.util.Scanner;

public class Exem_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = scn.nextInt();
		System.out.print("정수2 : ");
		int b = scn.nextInt();
		System.out.print("정수3 : ");
		int c = scn.nextInt();
		
		int med=0;
		
		
		
		//출력
		System.out.print("정수 1: " + a +"\t");
		System.out.print("정수 2: " + b +"\t");
		System.out.print("정수 3: " + c +"\t");
		System.out.print("중앙값 : " + med);
	}
}


