package day_0106;

import java.util.Scanner;

/* 키보드로 급여를 입력(1~500000)
 * 입력자료가 -999 이면 종료 또는 인원수는 최대 10명
 * 50,000 :xx
 * 10,000 :xx
 * 5,000 :xx
 * . . .
 * 1 :xx
 */

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pcnt=0,mny,s,flag=0,mny_sum=0,mk=50000;
		while(true) {
			System.out.print("급여 입력:");
			mny = sc.nextInt();
			if(mny==-999) break;
			else if(1<=mny&&mny<=500000) { 
			mny_sum+=mny;
			pcnt++;
			}
			else System.out.println("입력 값 오류");
			if(pcnt==10) break;
			
		}
		for(int i=0;i<10;i++) {
			switch(flag){
				case 0:{
					s=mny_sum/mk;
					mny_sum=mny_sum%mk;
					if(mk>=1000) System.out.println(mk/1000+","+"000 : "+s);
					else System.out.println(mk+" : "+s);
					mk=mk/5;
					flag=1;
					break;
					}
				case 1:{
					s=mny_sum/mk;
					mny_sum=mny_sum%mk;
					if(mk>=1000) System.out.println(mk/1000+","+"000 : "+s);
					else System.out.println(mk+" : "+s);
					mk=mk/2;
					flag=0;
					break;
				}
			}
		}
	}
}
	
