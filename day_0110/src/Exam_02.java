/* 1 ~ 10 합계 출력
 * 출력 : 1 ~ 10 = 55
 */
public class Exam_02 {
	public static void main(String[] args) {
		adder(1,10);
	}
	
	static void adder(int a, int b) {
		int c = 0;
		for(int i=a;i<=b;i++) {
			c+=i;
		}
		System.out.println(a+" ~ "+b+" = "+c);
	}
	
}
