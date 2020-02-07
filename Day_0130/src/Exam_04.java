/* System 클래스
 *  - 운영체제와 상호작용 - 키보드입력, 모니터 출력
 */
public class Exam_04 {
	public static void main(String[] args) {
		int cnt=0;
		while(true) {
			System.out.println(cnt);
			if (cnt == 10) {
				System.exit(0); // 0 - 정상 종료 , 그 외에는 비정상 종료
			}
			cnt++;
		}
		//System.out.println("프로그램 종료");
		
		//System.gc();  // 가비지 컬렉션 수행부탁드립니다.
	}
}
