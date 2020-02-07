import java.util.regex.Pattern;

/* 이메일 유효성 검사
 * abc@abc.com  or abc@abc.co.kr
 * \\w+ 한글자 이상   ()? 그룹내에 있는건 있어도 되고 없어도 되고
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		String email = "aaa@abc.co.kr";
		String pat = "\\w+@\\w+.\\w+(.\\w+)?";
		String pat2 = "\\w+@\\w+.\\w+";		
		
		boolean bool = Pattern.matches(pat, email);
		if (bool) System.out.println("적합");
		else System.out.println("부적합");
		
		System.out.println("---------------");
		
		boolean bool2 = Pattern.matches(pat2, email);		
		if(bool2) System.out.println("적합");
		else System.out.println("부적합");
		
	}
}
