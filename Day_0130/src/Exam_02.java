import java.util.regex.Pattern;

/* ��ȭ��ȣ ��ȿ���˻�
 * 	010-1111-1111
 *  () �׷��� �ǹ�
 *  (010|011)-\\d{3,4}-\\d{4}
 */
public class Exam_02 {
	public static void main(String[] args) {
		String bango ="013-1234-5323";
		String pat ="(01\\d?)-\\d{1,4}-\\d{4}";
		boolean bool = Pattern.matches(pat, bango);
		if(bool) System.out.println("����");
		else System.out.println("������");
	}
}
