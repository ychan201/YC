package Sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon sw[] = new Sawon[10];
		int cnt=0;
		
		while(cnt<10) {
			System.out.print("��� ���� :");
			String id = sc.next();
			if(id.equals("end")) break;
			int level = sc.nextInt();
			int time =sc.nextInt();
			if(level == 1 || level ==2 || level ==3 ) {
				Sawon s = new Sawon(id,level,time);
				sw[cnt]=s;
				cnt++;
			}
			else System.out.println("��� ������ �߸��ԷµǾ����ϴ�. �ٽ��Է��ϼ���");
		}
		SawonPay sa = new SawonPay(sw,cnt);
		sa.payList();
		sa.printPayList();
		sa.maxPay();
	}
}
