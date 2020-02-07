package Sawon1;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon[] sa = new Sawon[10];
		int cnt = 0;
		while (cnt < 10) {
			String temp="";
			System.out.print("ют╥б:");
			String buseo = sc.next();
			if(buseo.equals("end")||buseo.equals("END"))break;
			int sabun = sc.nextInt();
			String name = sc.next();
			int pay = sc.nextInt();
			Sawon s = new Sawon(buseo,sabun,name,pay);
			sa[cnt]=s;
			cnt++;
		}
		SawonData s = new SawonData(sa,cnt);
		s.print();
	}
}
