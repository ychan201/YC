package school;

import java.util.Scanner;

public class SchoolExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School sch[] = new School[10];
		int cnt=0;
		while (cnt < 10) {
			System.out.print("�Է�:");
			String[] str = sc.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) break;
			if (str.length != 5) {
				System.out.println("�Է¿���");
				continue;
			}
			//sch[cnt]=new School();
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
			if(!bun.equals("")) {
				System.out.println("�Է¿���");
				continue;
			}
			int b = Integer.parseInt(str[0]);
			System.out.println(bun);
			cnt++;
		}
		System.out.println("�Է�����");
	}
}
