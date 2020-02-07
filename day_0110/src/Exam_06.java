/* 메소드 호출 방식
 * 1. 값에 의한 호출
 * 2. 참조에 의한 호출
 */
public class Exam_06 {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("교환 후");
/*		int c=a;
		a=b;
		b=c;
*/		swap(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static void swap(int a,int b) {  // 값에 의한 호출 (main에는 변화가 없음.)
		int c=a;
		a=b;
		b=c;
	}
}
