import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam_11_Map_set_Collection {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 100); // == map.put("김자바",new Integer(100));
		map.put("홍길동", new Integer(95));
		map.put("호길동", 88);
		map.put("호길도", new Integer(78));
		map.put("홍기동", 90);
		// 학생명단 출력
		Set set = map.keySet();
		System.out.println("학생 :"+set);
		Collection value = map.values(); // 컬렉션은 하나의 자료구조.
		System.out.println("점수 :"+value);
		// 점수 합계
		Iterator iter = value.iterator();
		int tot=0;
		while(iter.hasNext()) {
			Integer a = (Integer)iter.next();
			tot += a.intValue();
			// tot += (int)iter.next();
		}
		System.out.println(tot);
	}
}
