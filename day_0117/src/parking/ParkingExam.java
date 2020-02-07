/*  주차장에 주차된 차량들에 대한 주차요금을 계산하는 프로그램을 작성하시오.
 * 1) 주차장에 주차된 차량들의 관리항목은 다음과 같다
 *  - 자동차번호, 주차시간(분단위), 주차요금
 *  2) 처리조건 
 *  - 주차 가능 시간은 최대 하루 (24시간)으로 한다
 *  - 주차 요금은 10분 미만을 무료, 30분까지는 500원, 30분 이후부터는 10분당 500원으로 계산한다.
 *  EX) 주차 시간이 42분인 경우 주차요금은 1500원이 된다.
 *  - 하루 주차 요금은 최대 30,000원으로 계산하며 30,000원을 초과하더라도 30,000원만 징수한다
 *  - 주차 가능 차량은 100대 이하
 */
package parking;

import java.util.Scanner;

public class ParkingExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking pk[] = new Parking[100];
		int cnt=0;
		
		for(int i=0;i<100;i++) {
			System.out.print("입력 :");
			String carNo=sc.next();
			if(carNo.equals("0000")) break;
			int parkTime = sc.nextInt();
			if(parkTime>1440) parkTime=1440;
			Parking p = new Parking(carNo,parkTime);
			pk[i]=p;
			cnt++;
		}
		
		ParkingData dd = new ParkingData(pk,cnt);
		dd.parkingPay();
		dd.pPayPrint();
		dd.jungsan();
	}
}
