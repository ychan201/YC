import java.util.ArrayList;
import java.util.List;

/* ArrayList�� ���ڿ�,����,�Ǽ� ���� ������Ÿ�Ը��� �����ϰڴٰ� ���� �� �� ����
 * 
 */

public class Exam_02_CF_list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("1234");
		list.add("C++");
		list.add("Pytyhon");
		list.add("Program");
		
		String str = list.get(0); // String ������ ArrayList���� �̸� ������ �ξ��⶧����, ĳ���� ���� �ʾƵ� ��Ʈ�� ������ ���� ����.
		for(int x=0; x<list.size();x++) {
			System.out.println(list.get(x));
		}
		
		boolean bool = list.contains("C++"); // ���ԵǾ� ������ Ʈ�� contains ������ false ����
		System.out.println(bool);
		int index = list.indexOf("C+"); // ���°�� �ֳ� indexOf , ������ -1, ������ �ε��� ��ȣ ����
		System.out.println(index);
		list.set(0, "Java"); // 0��° ���� �ٲ�� set
		System.out.println(list.get(0));
		
	} 
}
