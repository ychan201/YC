/*  �����忡 ������ �����鿡 ���� ��������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1) �����忡 ������ �������� �����׸��� ������ ����
 *  - �ڵ�����ȣ, �����ð�(�д���), �������
 *  2) ó������ 
 *  - ���� ���� �ð��� �ִ� �Ϸ� (24�ð�)���� �Ѵ�
 *  - ���� ����� 10�� �̸��� ����, 30�б����� 500��, 30�� ���ĺ��ʹ� 10�д� 500������ ����Ѵ�.
 *  EX) ���� �ð��� 42���� ��� ��������� 1500���� �ȴ�.
 *  - �Ϸ� ���� ����� �ִ� 30,000������ ����ϸ� 30,000���� �ʰ��ϴ��� 30,000���� ¡���Ѵ�
 *  - ���� ���� ������ 100�� ����
 */
package parking;

import java.util.Scanner;

public class ParkingExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking pk[] = new Parking[100];
		int cnt=0;
		
		for(int i=0;i<100;i++) {
			System.out.print("�Է� :");
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
