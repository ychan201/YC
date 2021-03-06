import java.util.Scanner;

/* 키보드로 사용자, 시작값, 끝값 입력 다음과 같이 출력하는 클래스를 작성하시오
 * 1. [ 입력 예시 ] 
 *  사용자 : 홍길동
 *     시작 : 5
 *         끝 : 20
 * 2. [ 출력 예시 ]
 *  사용자 : 홍길동
 *  연산결과 : 5+6+7+8+9+10+11+ . . . . .+20 = xxx
 */

class SeqNumber {
	String name;
	int start, end, sum;

	SeqNumber() {
	}

	SeqNumber(String n, int s, int e) {
		name = n;
		start = s;
		end = e;
	}

	void print() {
		System.out.println("----------출력----------");
		System.out.println("사용자 :" + name);
		System.out.print("연산결과 :");
		for (int i = start; i <= end; i++) {
			if (i == end)
				System.out.print(i + "=");
			else
				System.out.print(i + "+");
			sum += i;
		}
		System.out.print(sum);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 작성
		System.out.println("----------입력----------");
		System.out.print("사용자 :");
		String name = sc.next();
		System.out.print("시작 :");
		int start = sc.nextInt();
		System.out.print("끝 :");
		int end = sc.nextInt();
		SeqNumber seq = new SeqNumber(name, start, end);
		seq.print();
	}
}
