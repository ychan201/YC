/* String(byte[] bytes)
 * byte[] 배열을 string 변환
 */


public class Exam_02 {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; // -128 ~ 127
		String s = new String(bytes);
		System.out.println(s);
		String s1 = new String(bytes, 6, 4);
		System.out.println(s1);

	}
}
