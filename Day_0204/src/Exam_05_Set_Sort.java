import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam_05_Set_Sort {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("java");
		set.add("python");
		set.add("c++");
		set.add("jsp");
		set.add("servlet");
		set.add("container");
		set.add("content");
		
		System.out.println("1 :"+set);
		List list = new ArrayList(set);
		System.out.println("2 :"+list);
		System.out.println("3 :"+list);
		list.sort(null);
		System.out.println("4 :"+list);
		Collections.sort(list);
	}
}
