package lambda;
/* 자바 1.8부터 지원
 * lambda - 메소드를 하나의 수식처럼 표기한 것
 * 			'익명 함수'라고도 함.
 */

class AA{
	int test(int a,int b) {
		System.out.print("AAA");
		return 1;
	}
}

public class Exam_13 {
	public static void main(String[] args) {
		AA a = new AA();
		a.test(1,2);
		
//		()->{System.out.print("AAA")};
//		(int a, int b) ->{return 11;};
	}
}
