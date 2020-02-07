import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam_06_Collections_sort {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("���ڹ�");
		str.add("ȫ�浿");
		str.add("Java");
		str.add("1234");
		str.add("Korea");
		
		for(String s : str) {
			System.out.println(s);
		}
		
		Collections.sort(str); // �⺻�ڷ����� ����.
		System.out.println("--------------------------");
		for(String s : str) {
			System.out.println(s);
		}
	}
}
