package treemap;

import java.util.Map;
import java.util.TreeMap;

/*	TreeMap
 */
public class Exam_03_treemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		
		score.put(87, "�ƹ��");
		score.put(90, "���ٿ�");
		score.put(55, "�ǳ���");
		score.put(78, "������");
		score.put(69, "����¥");
		score.put(40, "�ľ�..");
		System.out.println(score);
		Map.Entry<Integer, String> entry=null; // retrunŸ���� entry���, key�� value�� �������°� �����ϴ�.
		
		entry = score.firstEntry();
		System.out.println("���� ���� ���� :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("���� ���� ���� :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.lowerEntry(85);
		System.out.println("85�� �Ʒ� ù��° ���� :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(75);
		System.out.println("75�� �� ù��° ���� :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.floorEntry(50);
		System.out.println("50�� ���� ù��° ���� :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(50);
		System.out.println("50�� �̻� ù��° ���� :"+entry.getKey() + "-" + entry.getValue());
		
		while(!(score.isEmpty())) {
			System.out.println(score.pollFirstEntry()+" \t���� ��ü :"+score.size());
		}
	}
}
