import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/* key�� �ߺ��� ���� �ʴ´�.
 * collection �����ӿ�ũ�� String�� �������̵� �Ǿ������Ƿ�, ������� �̸����� ���� �����ϴ�.
 */

public class Exam_09_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(1, "DDD");
		
		System.out.println(map);
		
		String s = (String)map.get(1);
		System.out.println(s);
		
		Set set = map.keySet();
		System.out.println(set);
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Integer x = (Integer)iter.next();
			System.out.println("key :" + x + "  Value :" + map.get(x));
		}
		
	}
}
