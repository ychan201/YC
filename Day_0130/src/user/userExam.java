package user;
/* Ŭ���� �迭�� �̿��� �˻� ��� ����
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class userExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		user us[] = new user[10];
		// �Է� 
		while(cnt<10) {
			user u = new user();
			System.out.println("ȸ������ �Է�");

			// ȸ���̸� �Է�
			System.out.print("ȸ�� �̸� :");
			String str = sc.nextLine();
			if(str.equals("end")||str==null) break;
			u.name = str;
			
		
			
			// ID�Է¹޴� �ݺ���, ���̵� �ߺ� �˻�
			while(true) {
			System.out.print("ȸ�� ID :");
			str = sc.nextLine();
			if(idCheck(str,us,cnt)) {
				System.out.println("ȸ�� ���̵� �ߺ�, �ٽ��Է����ּ���.");
				continue;
			}
			if(idCheck(str)) {
				System.out.println("���̵�� ����,�����ڸ� �Է� �����մϴ�. �ٽ��Է����ּ���.");
				continue;
			}
			u.userid = str;
			break;
			}
			
			// e-mail �ּ� �Է¹޴� �ݺ���
			while(true) {
			System.out.print("e-mail :");
			str = sc.nextLine();
			if(emailCheck(str)) {
			u.email = str;
			u.bun = cnt+1;
			us[cnt]=u;
			cnt++;
			break;
			}
			else {
				System.out.println("�̸��� ���Ŀ� �°� �Է����ּ���.");
				continue;
			}
			}
		}
		System.out.println("������ȣ\t�̸�\tID\t�̸���");
		for(int i=0;i<cnt;i++) {
			System.out.println(us[i]);
		}
		
		// �˻�
		
		System.out.println("----------------------�˻�-----------------------");
		while(true) {
		System.out.print("�˻�(ID):");
		String serch = sc.nextLine();
		if(serch.equalsIgnoreCase("end")) {
			System.out.println("���α׷� ����");
			break;
		}
		idSearch(serch,us,cnt);
		}
	}
	
	
	
	
	
	
	static boolean idCheck(String a,user[] u,int cnt) {
		for(int i=0;i<cnt;i++) {
			if(u[i].userid.equals(a)) {
				return true;
			}
		}
		return false;
	}
	
	static void idSearch(String id,user[] u,int cnt) {
		boolean flag=true;
		for(int i=0;i<cnt;i++) {
			if(u[i].userid.equals(id)) {
				System.out.println("������ȣ\t�̸�\tID\t�̸���");
				System.out.println(u[i]);
				flag=false;
				break;
			}
		}
		if(flag) System.out.println("�ش����� ����");
	}
	
	static boolean emailCheck(String str) {
		boolean bool = Pattern.matches("\\w+@\\w+.\\w+(.\\w+)?", str);
		return bool;
	}
	
	static boolean idCheck(String str) {
		boolean bool = Pattern.matches("\\w+", str);
		return !(bool);
	}
}
