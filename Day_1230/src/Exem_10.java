import java.util.Scanner;

public class Exem_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 : ");
		int a = scn.nextInt();
		System.out.print("����2 : ");
		int b = scn.nextInt();
		System.out.print("����3 : ");
		int c = scn.nextInt();
		int max=0; // ���� ū�� ����
		if(a>b) {
			if(a>c) {
				max=a;
			}else {
				max=c;
			}
		}else {//a<b
			if(b>c) {
				max=b;
			}else {
				max=c;
			}
		}

	}

}
