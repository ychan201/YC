import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_04_Set_Iterator_for {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("123");
		set.add("AAAA");
		set.add("CCCC");
		set.add("FFFF");
		
		
		Iterator<String> iter = set.iterator();
		System.out.println("-----------------------------");
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("AAAA")) {
				iter.remove();
			}
		}
		
		for(String str : set) {
			System.out.println(str);
		}
		
	}
}
