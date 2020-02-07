import java.util.Scanner;
// 정수 2개 입력
// 두수의 차이가 10이상이면
// 큰수에 -5 작은수에 +5

public class Exem_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 :");
		int a = scn.nextInt();
		System.out.print("정수2 :");
		int b = scn.nextInt();
		// 두수 차이계산.
		int c;
		if(a>=b) { // 참이면
			c=a-b;
		}else { // 거짓이면
			c=b-a;
		if(a>=0) c=a+b;
		}
	}
}

