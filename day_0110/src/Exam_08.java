import java.util.Scanner;

/* 리턴타입 O, 매개변수 O
 * 키보드로 정수 입력
 * 입력된 정수까지 합계 출력
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		System.out.print("1 ~ "+num+" 합 : ");
		System.out.println(sum(num));
	}
	
	static int sum(int a) {
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
}
