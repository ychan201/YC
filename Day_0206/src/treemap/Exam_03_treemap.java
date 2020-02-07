package treeset;

import java.util.Map;
import java.util.TreeMap;

/*	TreeMap
 */
public class Exam_03_treemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		
		score.put(87, "아배고");
		score.put(90, "프다왜");
		score.put(55, "맨날배");
		score.put(78, "가고프");
		score.put(69, "지진짜");
		score.put(40, "후아..");
		System.out.println(score);
		Map.Entry<Integer, String> entry=null; // retrun타입이 entry라면, key와 value를 꺼내오는게 가능하다.
		
		entry = score.firstEntry();
		System.out.println("가장 작은 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.lowerEntry(85);
		System.out.println("85점 아래 첫번째 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(75);
		System.out.println("75점 위 첫번째 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.floorEntry(50);
		System.out.println("50점 이하 첫번째 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(50);
		System.out.println("50점 이상 첫번째 점수 :"+entry.getKey() + "-" + entry.getValue());
		
		while(!(score.isEmpty())) {
			System.out.println(score.pollFirstEntry()+" \t남은 객체 :"+score.size());
		}
	}
}
