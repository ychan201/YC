import java.util.regex.Pattern;

/* �̸��� ��ȿ�� �˻�
 * abc@abc.com  or abc@abc.co.kr
 * \\w+ �ѱ��� �̻�   ()? �׷쳻�� �ִ°� �־ �ǰ� ��� �ǰ�
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		String email = "aaa@abc.co.kr";
		String pat = "\\w+@\\w+.\\w+(.\\w+)?";
		String pat2 = "\\w+@\\w+.\\w+";		
		
		boolean bool = Pattern.matches(pat, email);
		if (bool) System.out.println("����");
		else System.out.println("������");
		
		System.out.println("---------------");
		
		boolean bool2 = Pattern.matches(pat2, email);		
		if(bool2) System.out.println("����");
		else System.out.println("������");
		
	}
}
