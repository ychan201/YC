import java.util.Scanner;
// ���� 2�� �Է�
// �μ��� ���̰� 10�̻��̸�
// ū���� -5 �������� +5

public class Exem_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		// �μ� ���̰��.
		int c;
		if(a>=b) { // ���̸�
			c=a-b;
		}else { // �����̸�
			c=b-a;
		if(a>=0) c=a+b;
		}
	}
}

