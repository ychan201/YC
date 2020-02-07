/* 소수구하기
 * 소수 개수, 입력자료개수, 소수합 출력 프로그램
 */

package day_0106;

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,cnt_c=0,cnt=0;
		while(true) {
		System.out.print("정수 입력:");
		int num=sc.nextInt();
		if(num==-99) {
			System.out.println("프로그램 종료");
			break;
		}
		else if(2<=num&&num<=99) {
			cnt_c++;
			for (int i=2;i<=num;i++) {
				if(num%i==0) {
					if(i==num) {
						cnt++;
						sum+=num;
						break;
					}
						break;					
				}
			}
		}
		else System.out.println("입력오류");
		}
		System.out.println("입력자료갯수="+cnt_c);
		System.out.println("소수개수="+cnt);
		System.out.println("소수합="+sum);
	}
		
}
