import java.util.Scanner;

/* Ű���� �Է�(1~10) -> 7�� �Է�
 * �Է� : 5
 * �Է� : 0
 * �Է¿���
 * �Է� : 9
 *  . . . -> 7�� �Է½� ���
 *  [ ��� ]
 *  �Է��ڷ� : 5 9 x x x x x
 *  �ִ밪 : x
 *  �ּҰ� : x
 *  �հ�(�ִ�,�ּҸ� �� �հ�) : xx
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int input,cnt=0,max,min,sum=0;
		while(true) {
			System.out.print("���� �Է�:");
			input = sc.nextInt();
			if(1<=input&&input<=10) {
				arr[cnt]=input;
				sum+=input;
				cnt++;
				if(cnt==7)break;
			}
			else System.out.println("�Է� ���� �ʰ�");
		}
		// �Է� ����. ��� ����.
		max=arr[0];
		min=arr[0];
		for(int i=1;i<cnt;i++) {	// �ִ�/�ּ� ���
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		sum=sum;	// ���� - �ִ� - �ּ� ���.
		
		// ��º�
		
		System.out.print("�Է��ڷ� : ");
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		System.out.println("�ִ� �ּҸ� �� �հ� : "+(sum-max-min));
	}
}
