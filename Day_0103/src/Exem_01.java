import java.util.Scanner;

//Ű����� ������ �Է�
//1 �Է��ڷ�� 1 ~ 100���� ����.
//2. �Է��ڷ��� 3�� ��� �̸鼭 7�� ����� �հ�� ����� ���Ͽ� ���
//3. �Է� �ڷ���  3�� ��� �̸鼭 7�� ����� 7���̸� ���α׷��� ����ȴ�.
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
//�Է� �ڷ� : 88
// �հ� : xxx
// ��� : xx.xx
// if�� 


public class Exem_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int cnt=0;//������ ������ �̵ΰ��� ���.
		int var;// �Է��� ����.
		while(true) {
			System.out.print("�Է��ڷ� :");
			var = scn.nextInt();
			if(var>=1 && var<=100) {
				if(var%3==0 && var%7==0) {
					cnt++;
					sum+=var;
					if(cnt==7) {
						break;
					}
				}
			}else {
				System.out.println("�Է� ����(�Է� ��������)");
			}
			//if(cnt==7) {  ���⿡ �ᵵ �������.
				//break;
		    //}
		}//while(true) �� // ȥ������ ����� �ǹ̿��� �̸� �����.
		System.out.println("�հ�  : " +sum);
		System.out.println("���  : " +sum/7);
		

	}

}
