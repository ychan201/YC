import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam_11_Map_set_Collection {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 100); // == map.put("���ڹ�",new Integer(100));
		map.put("ȫ�浿", new Integer(95));
		map.put("ȣ�浿", 88);
		map.put("ȣ�浵", new Integer(78));
		map.put("ȫ�⵿", 90);
		// �л���� ���
		Set set = map.keySet();
		System.out.println("�л� :"+set);
		Collection value = map.values(); // �÷����� �ϳ��� �ڷᱸ��.
		System.out.println("���� :"+value);
		// ���� �հ�
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
