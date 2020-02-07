/* 메소드 호출 방식
 * 2. 참조에 의한 호출
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[] a = { 10, 20 };
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);

		swap(a);
		System.out.println("교환 후");

		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
	}

	static void swap(int a[]) { // 참조에 의한 호출 (main문 배열에 영향.)
		int c = a[0];
		a[0] = a[1];
		a[1] = c;
	}
}
