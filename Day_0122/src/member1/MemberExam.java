package member1;

import java.util.Scanner;

public class MemberExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] mem = new Member[10];
		int cnt=0;
		while(cnt<10) {
			System.out.print("자료입력 "+(cnt+1)+":");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("end")) break;
			String[] arr = str.split(",");
			mem[cnt] = new Member(arr[0],arr[1],arr[2]);
			cnt++;
		}
		MemberData md = new MemberData(mem,cnt);
		md.testPrint();
	}
}
