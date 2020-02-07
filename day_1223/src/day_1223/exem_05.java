키보드로 임의의 점수 data 10개입력
단, data는 50이상 100이하 만 입력

package day_1223;

import javax.print.attribute.IntegerSyntax;

public class exem_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scnner(System.in);
		int[] score = new int[10];
		int cnt=0; // data갯수 카운트(50~100사이 값)
		while(true) {//반복을 무한대로 한다는 의미
			System.out.print("정수 입력:");
			int. jumsu = scn.nestint();
			if(jumsu>=50 && jumsu<=100) {
				cnt++;
				score[cnt]=jumsu;
				if(cnt=10) {
					break;
					
				}
			}
			
		}
		// 출력
		for(int. i=0; i<10; i++) {
			System.out.print(score[i]+" ");
		}

	}

}
