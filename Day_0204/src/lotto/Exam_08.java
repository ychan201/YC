package lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

class Member{
	String id,name;
	int age;
	Member(){}
	Member(String s[]){
		id=s[0];
		name=s[1];
		age=Integer.parseInt(s[2]);
	}
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(id.equals(m.id)) {
				System.out.println("���̵� �ߺ�");
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
/* Ű���� �Է�(���̵�,�̸�,����)
 * - �̸��� 'end' �̸� ����
 * - ������ ���̵��� ��� '���̵� �ߺ�' ��� �� ���Է�
 * ��� ���
 * ���̵� �̸� ����
 */

public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Member> set = new HashSet<Member>();
		while(true) {
			System.out.print("���̵�,�̸�,���� �Է�:");
			String str[] = sc.nextLine().split(",");
			if(str[0].equalsIgnoreCase("end")) break;
			if(!(str.length==3)) {
				System.out.println("���̵�,�̸�,���� ���Ŀ� �°� �Է����ּ���");
				continue;
			}
			if(check(str)) {
				System.out.println("�Է°� Ȯ��");
				continue;
			}
			set.add(new Member(str));
		}
		
		System.out.println("���̵�\t�̸�\t����");
		for(Member m:set) {
			System.out.println(m);
		}
	}
	
	static boolean check(String[] str) {
		boolean bool;
		for(int i=0;i<str.length;i++) { 
			if(i<2) {
			bool = Pattern.matches("\\w*", str[i]); // boolean Ÿ���� bool ���� ���� ��, Pattern ����ǥ���� ��� ( \\d ���ڸ� , �˻��� ���ڿ� )
			if(!(bool)) return true;
			}
			else
			bool = Pattern.matches("\\d*", str[i]); 
			if(!(bool)) return true;
		}
		return false;
		
	}
}
