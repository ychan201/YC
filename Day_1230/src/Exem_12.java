// 1. ������ ������ ��
// 2. ������ ������ ��
// ���� ������ (���ǽ�)? �� : ����; 
import java.util.Scanner;

public class Exem_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 : ");
		int a = scn.nextInt();
		System.out.print("����2 : ");
		int b = scn.nextInt();
		System.out.print("����3 : ");
		int c = scn.nextInt();

		int max, med, min;
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					med=b;
					min=c;
				}else {
					med=c;
					min=b;
				}
			}else {
				max=c;
				med=a;
				min=b;
			}
			
			System.out.print("���� 1: " + a +"\t");
			System.out.print("���� 2: " + b +"\t");
			System.out.print("���� 3: " + c +"\t");
			System.out.print("�߾Ӱ� : " + med);
		}
	}

}
