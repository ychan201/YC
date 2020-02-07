import java.util.Properties;

/* 환경 변수 수집
 * os와 관련된 시스템 정보에 접근하기 위한 클래스 System
 */

public class Exam_05 {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.list(System.out);
		System.out.println("-----------------------------------------");
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("운영체제 이름 : "+osName);
		System.out.println("사용자 이름 : "+userName);
		System.out.println("사용자 홈 디렉토리 : "+userHome);
	}
}
