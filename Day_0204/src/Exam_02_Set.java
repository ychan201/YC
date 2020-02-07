import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/* Set : 순차적 X , 중복 허용X
 *  - 구현 클래스 HashSet
 *  순서가 없기 때문에 원하는 값을 꺼내올 수 없다. get 사용 불가능.
 */
public class Exam_02_Set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Tomcat");
		set.add("Java");
		set.add("C#");
		System.out.println(set);
		System.out.println("set size:"+set.size());
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Tomcat");
		list.add("Java");
		list.add("C#");
		System.out.println(list);
		System.out.println("list size:"+list.size());
	}
}
