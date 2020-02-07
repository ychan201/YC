import java.util.Scanner;
import java.util.regex.Pattern;

/* uncompress �Լ��� ���ڿ� ���ĺ����� ������ ���ڿ��� �Է¹޾Ƽ�
 * ���ڸ�ŭ ���ĺ��� �ݺ����� ��ȯ�ϴ� �Լ��̴�.
 * ��)
 * uncompress ('2a5b1c' ) -> aabbbbbc
 * uncompress ('3x5y2z' ) -> xxxyyyyyzz
 * �� �� ���ڴ� 1~9 ���̿� �ִ� �����̴�.
 * ���ڿ� ���ڿ��� �ݺ��Ǿ� ���´�. �� 1~9������ ���� �ڿ� ���ĺ��� �ϳ� ������ ������ �ݺ��ȴ�.
 * #main
 * S=['2a5b1c' , '3x5y2z' , '2m4n' , '9o']
 * new_string=uncompress(string)
 * print(string, ':', new_string)
 */
public class Exam_05 {
	
	static String uncompress(String str) {
		String rt="";
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				//cnt = Integer.parseInt(Character.toString(str.charAt(i)));
				cnt=str.charAt(i)-48;
			}
			else for(int j=0;j<cnt;j++){
				rt+=str.charAt(i);
			}
		}
		
		return rt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ��Է� : ");
			String a =sc.nextLine();
			if(!(Pattern.matches("([1-9]{1}[a-zA-Z]{1})+", a))){
				continue;
			}
			String new_String=uncompress(a);
			System.out.println(new_String);

		
		}
	}		
}
