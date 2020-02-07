package treeset;
import java.util.*;
/* �˻� ����� ��ȭ�� �÷��� 
 * set - ����(INDEX) X �ߺ� X 
 * tree ù��° �� root, ���� �Է°����� root �� ũ����Ͽ�, ������ ����, ũ�� ������ ��ġ.
 * �ߺ��� ������ �ʱ� ������, ���� �Է°��� ������ ���� ���� �� ����.
 * treeset�� ���ĵǾ� ���� ���� ( �ڵ����� )
 */

public class Exam_01_treeset {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Integer(10)); // 10�̶�� ���� ���� ���� ��ü�� �����.
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		System.out.println("-----------------------");
		Set set2 = new HashSet();
		set.add(new Integer(10)); // 10�̶�� ���� ���� ���� ��ü�� �����.
		for(int i=0;set2.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		System.out.println(set2);
	}
}
