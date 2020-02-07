package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Ű���� �Է�
 * ���̵�, �̸�, �����Է� Member ��ü�� ����
 * �Է½� ���̵� 'end' �̸� ��ü ���
 *  - ArrayList �̿�
 *  - ���̵� ���� ��� "�ߺ��� ���̵��Դϴ�." ���� ��� �� ���Է�
 * ������ ���� ���
 *  ���̵�  �̸�   ����
 * user01 ȫ�浿   29
 *    .     .     .
 *    
 */

public class MemberExam_Sun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		while(true) {
			System.out.print("���̵�,�̸�,���� �Է�:");
			String s[] = sc.nextLine().split(",");
			if(s[0].equals("end")) break;
			else if(strCheck(s)) continue;
			else if(ageCheck(s)) continue;	
			
			Member m = new Member(s[0],s[1],s[2]);
			boolean bool = list.contains(m);
			if(bool) {
				System.out.println("�ߺ�");
			}
			else {
				list.add(m);
			}
		}
		
		
		for(Member m : list) {
			System.out.println(m);
		}
		
		
	}
		
	static boolean strCheck(String[] str) {
		
			if(str.length==3) {
				return false;
		}
			System.out.println("���̵�,�̸�,���� �������� �Է����ּ���");
		return true;
	}
	
	static boolean ageCheck(String[] str) {
		for(int i=0;i<str[2].length();i++) {
			if(str[2].charAt(i)>'9' || str[2].charAt(i)<'0') {
				System.out.println("���̴� ���ڸ� �Է����ּ���");
				return true; 
			}
		}
		
	return false;
}
	
}
