import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

/* Set : ������ X , �ߺ� ���X
 *  - ���� Ŭ���� HashSet
 *  ������ ���� ������ ���ϴ� ���� ������ �� ����. get ��� �Ұ���.
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
