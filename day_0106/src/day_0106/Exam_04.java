package day_0106;

import java.util.Scanner;

/* Ű����� �޿��� �Է�(1~500000)
 * �Է��ڷᰡ -999 �̸� ���� �Ǵ� �ο����� �ִ� 10��
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
			System.out.print("�޿� �Է�:");
			mny = sc.nextInt();
			if(mny==-999) break;
			else if(1<=mny&&mny<=500000) { 
			mny_sum+=mny;
			pcnt++;
			}
			else System.out.println("�Է� �� ����");
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
	
