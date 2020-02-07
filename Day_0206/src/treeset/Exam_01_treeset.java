package treeset;
import java.util.*;
/* 검색 기능을 강화한 컬렉션 
 * set - 순서(INDEX) X 중복 X 
 * tree 첫번째 값 root, 다음 입력값부터 root 와 크기비교하여, 작으면 왼쪽, 크면 오른쪽 배치.
 * 중복이 허용되지 않기 때문에, 기존 입력값과 동일한 값은 들어올 수 없다.
 * treeset은 정렬되어 값이 들어간다 ( 자동정렬 )
 */

public class Exam_01_treeset {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Integer(10)); // 10이라는 값을 가진 정수 객체가 저장됨.
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		System.out.println("-----------------------");
		Set set2 = new HashSet();
		set.add(new Integer(10)); // 10이라는 값을 가진 정수 객체가 저장됨.
		for(int i=0;set2.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
	}
}
