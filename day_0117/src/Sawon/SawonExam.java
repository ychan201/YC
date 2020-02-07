package Sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon sw[] = new Sawon[10];
		int cnt=0;
		
		while(cnt<10) {
			System.out.print("사원 정보 :");
			String id = sc.next();
			if(id.equals("end")) break;
			int level = sc.nextInt();
			int time =sc.nextInt();
			if(level == 1 || level ==2 || level ==3 ) {
				Sawon s = new Sawon(id,level,time);
				sw[cnt]=s;
				cnt++;
			}
			else System.out.println("등급 정보가 잘못입력되었습니다. 다시입력하세요");
		}
		SawonPay sa = new SawonPay(sw,cnt);
		sa.payList();
		sa.printPayList();
		sa.maxPay();
	}
}
