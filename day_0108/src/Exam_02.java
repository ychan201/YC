import java.util.Scanner;

/* Ű���� �Է�(2~1023) �Է�
 * �Է� ���� 2���� ��ȯ�ؼ� ���
 * �Է� ���� -99 �̸� ����.
 * ����)
 * �Է� : 10
 * 2���� : 1010
 * �Է� : 1
 * �Է� ����
 * �Է� : 127
 * 2���� : 1111111
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt=0,input,input_c;
		while(true){
			System.out.print("2������ ��ȯ�� ���� �Է�:");
			input = sc.nextInt();
			input_c = input;
			cnt=0;
			if(2<=input&&input<1024) {
				for(int i=0;i<arr.length;i++) {
					arr[i]=input_c%2;
				if((input_c/2)>0) cnt++;
					input_c=input_c/2;
				} // �Է�����
				//��½���
				System.out.println("�Է� : "+input);
				System.out.print("2���� : ");
				for(int i=cnt;i>=0;i--) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			else if(input==-99)break;
			else System.out.println("�߸��� �Է¹���");
			}
		System.out.println("-99�� �Է¹޾� ���α׷� ����.");
	}
}
