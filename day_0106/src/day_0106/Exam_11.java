/* �Ҽ����ϱ�
 * �Ҽ� ����, �Է��ڷᰳ��, �Ҽ��� ��� ���α׷�
 */

package day_0106;

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,cnt_c=0,cnt=0;
		while(true) {
		System.out.print("���� �Է�:");
		int num=sc.nextInt();
		if(num==-99) {
			System.out.println("���α׷� ����");
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
		else System.out.println("�Է¿���");
		}
		System.out.println("�Է��ڷ᰹��="+cnt_c);
		System.out.println("�Ҽ�����="+cnt);
		System.out.println("�Ҽ���="+sum);
	}
		
}
