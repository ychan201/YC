import java.util.regex.Pattern;

/* 전화번호 유효성검사
 * 	010-1111-1111
 *  () 그룹을 의미
 *  (010|011)-\\d{3,4}-\\d{4}
 */
public class Exam_02 {
	public static void main(String[] args) {
		String bango ="013-1234-5323";
		String pat ="(01\\d?)-\\d{1,4}-\\d{4}";
		boolean bool = Pattern.matches(pat, bango);
		if(bool) System.out.println("적합");
		else System.out.println("부적합");
	}
}
