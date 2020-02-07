package student;
/*	1.Ű���� �Է�
 * 	  �Է� : ��ȣ, �̸�, ����, ����, ����, ����, ����
 *  2. ó������
 *    - �Է� �� ��ȣ�� '0' �̸� �Է� ����
 *    - ��ȣ �ߺ��� �Է� �Ұ� �ϵ��� ó��
 *    - ������ �������� ���� �ο�
 *    - 1�� ����� �Է� �ڷ� ������ ��� �� 
 *    - 2�� ����� ������ �������� ��� (set) �̿�
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		while(true) {
			System.out.print("��ȣ,�̸�,���� 5���� �Է� :");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("0")) break;
			if(numCheck(str) || lengthCheck(str)) continue;
			Student std = new Student(str);
			if (list.contains(std)) System.out.println("��ȣ �ߺ��Դϴ�.");
			else list.add(std);
		}
		StudentData sd = new StudentData(list);
		sd.print();
		sd.sort();
		sd.print();
	}
	
	
	
	static boolean numCheck(String[] str) {
		for(int i=0;i<str.length;i++) {
			if (i==1);
			else for(int j=0;j<str[i].length();j++) {
					if(str[i].charAt(j)>'9' || str[i].charAt(j)<'0' ) {
					System.out.println("��ȣ�� ������ ���ڸ� �Է����ּ���.");
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	static boolean lengthCheck(String[] str) {
		if (str.length==7) return false;
		else {
			System.out.println("��ȣ,�̸�,����,����,����,����,���� �������� �Է����ּ���.");
			return true;
		}
	}
}
