import java.util.Scanner;

//Ű����� ������ �Է�
//1 �Է��ڷ�� 1 ~ 100���� ����.
//2. �Է��ڷ��� 7�� ��� ��
//3. ��ü �ڷ�(��������)�� 20���� ���α׷��� ����ȴ�.
//4. �Է� ����.
//�Է� �ڷ� : 0
//"error �Է� ������ �ƴ�"
//�Է��ڷ� : 8
//�Է� �ڷ� : 77
//�Է� �ڷ� : 200
//"error �Է� ������ �ƴ�"
//�Է� �ڷ� : 88
// .	.	.
// .	.	.
//�Է� �ڷ� : 88 --> 20�� �Է� ��
// �Է��ڷ�  20�� �� ������(%) : xx%
// �Է� �ڷ� 20�� �� 7�� ��� ��(%) : xx%
// ��� : xx.xx
// if�� 


public class Exem_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int totcnt = 0; // �Է��ڷ� ��
		int errcnt=0;// ���� ���� 
		int cnt=0; // 7�� ����
		
		int var;// �Է��� ����.
		do {
			System.out.print("�Է��ڷ� :");
			var = scn.nextInt();
			totcnt++;
			if(var>=1 && var<=100) {
				if(var%7==0) {
					sum+=var;
					cnt++;
				}
			}else {
				System.out.print("�Է¿���");
				errcnt++;
			}
		
		}while(totcnt<20);
		
		System.out.println("�Է��ڷ�  20�� �� ������(%) : " +(double) errcnt/20);
		System.out.println("�Է� �ڷ� 20�� �� 7�� ��� ��(%) : " + cnt/20);
		
	}
}
