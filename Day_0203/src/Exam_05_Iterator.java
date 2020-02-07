import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam_05_Iterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("!!!!");
		list.add("DDDD");
		
		List list2 = list;
		list2.add("FFFF");
		
		for(String str : list) { // list에서 순서대로 1개씩 꺼내와서 String str에다 대입해줌
			System.out.println(str);
		}
		System.out.println("---------------------------------");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}		
		System.out.println("------------Iterator-----------");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) System.out.println(iter.next());
	}
}
