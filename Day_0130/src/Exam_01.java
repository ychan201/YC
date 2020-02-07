import java.util.Scanner;
import java.util.regex.Pattern;

/* 정규 표현식 특정한 문자열을 검색하는 것. - Pattern 클래스에서 지원
 * \\d(숫자), \\w(영문자 또는 숫자)
 * \\d? - 숫자로 한 자(없거나 한 자),\\d* - 숫자로 여러 자(한 자 이상)
 * \\d{3} - 숫자로 세 자,\\d{1,3} - 숫자로 1자 ~ 3자
 * 키보드로 정수를 1개 이상 입력을 받는다
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 sc 생성
		System.out.print("점수 입력:"); // 콘솔창 안내메시지
		String var[] = sc.nextLine().split(","); // 스트링배열 var에 문자열 1줄을 입력받아 ","를 기준으로 나누어 var 배열에 삽입
		for(int i=0;i<var.length;i++) { // 스트링배열 var 의 길이만큼 반복함
			boolean bool = Pattern.matches("\\w*", var[i]); // boolean 타입의 bool 변수 선언 후, Pattern 정규표현식 사용 ( \\d 숫자만 , 검사할 문자열 )
			if(bool) {
				System.out.println(var[i]+" = 적합");
			}
			else
				System.out.println(var[i]+" = 오류");
		}
	}
}
