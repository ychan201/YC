import java.util.Scanner;

/*if문 연습용
 * 
 * 
 * 
 * 
 * 
 */ 

// 주차요금 계산 프로그램 작성
// 키보드로 차량번호,  주차시간(분)을 입력
// 예) 차량번호 : 1234
//     주차시간 : 42
//
//     주차요금 계산                         72 -> 3000 테스트용
//     차량번호     요금
//      1234   1500원
//  - 주차가능시간은 최대 하루(24시간)
// - 주차요금은 10분미만 무료, 30분까지 500원, 
// - 30분 이후부터는 10분 당 500원 계산+
// - 하루주차요금은 최대 30000원으로 계산하며
// - 30000원 초과하더라도 30000만 징수한다.


public class Exem_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c = 500;
		
		System.out.print("차량번호 : ");
		a=scn.nextInt();
		System.out.print("주차시간(분) : ");
		b=scn.nextInt();
		
		if(b<10) {
			c=0;
		}else if(b>=30)		
		
		
	}

}
