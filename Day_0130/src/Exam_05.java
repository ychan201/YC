import java.util.Properties;

/* ȯ�� ���� ����
 * os�� ���õ� �ý��� ������ �����ϱ� ���� Ŭ���� System
 */

public class Exam_05 {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
		System.out.println("-----------------------------------------");
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("�ü�� �̸� : "+osName);
		System.out.println("����� �̸� : "+userName);
		System.out.println("����� Ȩ ���丮 : "+userHome);
	}
}
