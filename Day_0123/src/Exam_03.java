/* Wrapper
 * - 오토박싱 언박싱
 */

public class Exam_03 {
	public static void main(String[] args) {
		int n=10;
		Integer nI=n; // 오토박싱
		Integer nn = new Integer(n); // 오토박싱 미지원시 객체를 직접 생성해줘야함
		System.out.println(nI);
		
		Integer n2 = new Integer(100);
		System.out.println(n2); 
		int n3 = n2; // 오토 언박싱
		System.out.println(n3);
	}
}
