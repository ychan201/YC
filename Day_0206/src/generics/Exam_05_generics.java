package generics;
/* ���ʸ� : �پ��� Ÿ���� ��ü�� �ٷ�� �޼ҵ峪 Ŭ������
 * �����Ͻ��� Ÿ��üũ�� ���ִ� ���.
 */

import java.util.ArrayList;
import java.util.List;;

public class Exam_05_generics {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <�ڷ���>����� ���ʸ� Ÿ���̶� ���̶�� �մϴ�
		list.add("ȫ�浿");
		//list.add(100);
		String name = (String)list.get(0);
		//int score = (int)list.get(1);
	}
}
