/* 문자열 분리
 * substring (시작, 전까지)
 * substring (시작)
 */
public class Exam_05 {
	public static void main(String[] args) {
		String str = "Hello World Java";
		int length = str.length();
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(6, 11));
		System.out.println(str.substring(12));
		for(int i=0;i<str.length();i++)	
			System.out.print(str.charAt(i));
	}
}
