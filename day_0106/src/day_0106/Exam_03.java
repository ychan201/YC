package day_0106;

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=0,m=50000,s=0,flag=0;
		System.out.print("금액 입력:");
		money = sc.nextInt();
		for (int i=0;i<10;i++) {
			switch(flag){
			case 0:{
				s=money/m;
				System.out.println(m+":"+s);
				money=money%m;
				m=m/5;
				flag=1;
				break;
			}
			case 1:{
				s=money/m;
				System.out.println(m+":"+s);
				money=money%m;
				m=m/2;
				flag=0;
				break;
			}
			
			}
		}
		
	}
}
