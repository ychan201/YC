package day_0106;

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		System.out.print("정수 입력:");
		int input = sc.nextInt();
		int[] pnum = new int[input];
		if(2<=input&&input<=1000) {
			for(int i=2;i<=input;i++) {
				for(int j=2;j<=i;j++) {
					if(i%j==0) {
						if(i==j) {
							System.out.print(i+"\t");
							cnt++;
							}
						break;
						}
						if(cnt==5) {
							cnt=0;
							System.out.println();
						}
					}
				}
			}
		else System.out.print("입력 오류");
	}
}
