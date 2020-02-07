package school;

import java.util.Scanner;

public class SchoolExam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student sch[] = new Student[10];
		int cnt=0;
		while (cnt < 10) {
			System.out.print("�Է�:");
			String[] str = sc.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) break;
			if (str.length != 5) {
				System.out.println("?");
				System.out.println("�Է¿���");
				continue;
			}
						
			// ��ȣ ����üũ - str[0]
			String bun="";
			for(int x=0; x<str[0].length();x++) {
				char ch = str[0].trim().charAt(x); // trim() ���ڿ��� ������ ������. charAt 1���ھ� ����
				if(ch>='0' && ch<='9') { // ���ڸ� �Ǻ���.
					bun+=ch; // String ������ bun�� ch�� �̾ ������( ���� 1���̱� ������ )
				}else {
					bun="";
					break;
				}
			}
			if(bun.equals("")) {
				System.out.println("�Է¿���1");
				continue;
			}
			int b = Integer.parseInt(str[0]);
			if(b>10) {
				System.out.println("�Է¿���2");
				continue;
			}
			//�� ���� ��ȿ�� �˻� -- ��Ÿ�ٷ�
			if(!scoreCheck(str[2])) {
				System.out.println("�Է¿���3");
				continue;
			}
			int kor = Integer.parseUnsignedInt(str[2]);
			if(!scoreCheck(str[3])) {
				System.out.println("�Է¿���4");
				continue;
			}
			int eng = Integer.parseUnsignedInt(str[3]);
			if(!scoreCheck(str[4])) {
				System.out.println("�Է¿���5");
				continue;
			}
			int mat = Integer.parseUnsignedInt(str[4]);
			sch[cnt]=new Student(b,str[2],kor,eng,mat);
			cnt++;
		}
		System.out.println("�Է�����");
		
		School scl = new School(sch,cnt);
		scl.print();
		
	}
	
	
	static boolean scoreCheck(String str) {
		String temp="";
		for(int x=0; x<str.length();x++) {
			char ch = str.trim().charAt(x); // trim() ���ڿ��� ������ ������. charAt 1���ھ� ����
			if(ch>='0' && ch<='9') { // ���ڸ� �Ǻ���.
				temp+=ch; // String ������ bun�� ch�� �̾ ������( ���� 1���̱� ������ )
			}else {
				temp="";
				break;
			}
		}
		if(temp.equals("")) {
			return false;
		}
		
		int var = Integer.parseInt(temp);
		if(var>100) {
			return false;
		}
		
		return true;
	}
}
