import java.util.ArrayList;

/*
 * Collection Framework
 * �ڹ��� �ڷᱸ��
 * Collection �������̽� ����� �������̽�(List,set), Map - - �÷��� // ������ ũ�Գ���.
 * List (������ �ְ�, �ߺ� ���) - �ε����� ���� ����
 * Set (������ ����, �ߺ� �Ұ�) - �ε����� ���� �Ұ�
 * Map (Ű , ���� ������ ����) - ������ �ְ�, Ű�� �ߺ� �Ұ�
 */
public class Exam_01_Collection_Framework {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		ArrayList list2 = new ArrayList(10);
		
		System.out.println("list empty :" + list.isEmpty());
		System.out.println("list size : " + list.size());
		list.add("123"); // � Ÿ���̴��� ������ �����Ͽ�, ���Ѱ� ����̳� � ������ Ÿ���� �� �ִ��� ���� ������ �𸥴�.
		list.add(123); // List�� ������ ����(index ����). �׷��Ƿ� for���� �̿��Ͽ� �������°͵� ������.
		list.add(3.14);
		list.add('A');
		System.out.println("list empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		System.out.println("list(0) : " +list.get(0)); // �ܼ��� ����� ����������. ������ 0��° �����͸� ����ϱ� ���ؼ� ������ ������ �Ͽ� ����ؾ� ��.
		String str = (String)list.get(0); // list 0���� "123" ���ڿ��� String�� str ������ �����Ϸ��� �õ�������, ����Ÿ���� �̽���ġ (list�� Object Ÿ����)
										  // �׷��Ƿ� list.get(0) ������Ʈ Ÿ���� ������ String������ ĳ���� ����� ������ ��������.
		int a = (int)list.get(1);		  // int ���� ���������� objectŸ���� list�� int ������ ĳ�����Ͽ� ��������� ��.
	}
}
