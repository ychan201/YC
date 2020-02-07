package lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 * Ű�����Է�(���̵�, �̸�, ����) �̸��� end�� ���� �ߺ��� ���̵� �Է½� ����. "���̵� �ߺ� �ٽ� �Է��ϼ���" ���Է��� ����
 * 
 * ��°�� ���̵� �̸� ����
 * 
 */
class Member2 {
	String id;
	String name;
	int age;

	Member2() {
	}

	Member2(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member) obj;
			return m.id.equals(id);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

}

public class Exam_sun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member2> set = new HashSet<Member2>();
		System.out.println("���̵�,�̸�,���̸� �Է��ϼ���");

		while (true) {
			System.out.print("�Է�:");
			String[] arr = sc.nextLine().split(",");
			if (arr[0].equalsIgnoreCase("0"))
				break;

			Member2 mem = new Member2(arr[0], arr[1], Integer.parseInt(arr[2]));

			boolean bool = set.contains(mem);
			if (bool) {
				System.out.println("���̵� �ߺ��ӵ�");
			} else {
				set.add(mem);
			}
		}
		System.out.println("���̵�\t�̸�\t����");

		Iterator<Member2> iter = set.iterator();
		while (iter.hasNext()) {
			Member2 m = iter.next();
			System.out.println("\t");
		}
	}
}
