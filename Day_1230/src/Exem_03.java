import java.util.Scanner;
//키보드로 정수 2개 입력 후 크기 비교하기.

public class Exem_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수1 :");
		int a = scn.nextInt();
		System.out.print("정수2 :");
		int b = scn.nextInt();
		
		if(a>b)
			System.out.println(a>b);
		if(b>a)
			System.out.println(b>a);
		if(a==b)
			System.out.println(a==b);
		
		//내가 해야 될 조건문이 참이 경우가 한가지만 할 때 사용.

		
	}

}
