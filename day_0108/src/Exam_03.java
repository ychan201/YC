import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		char str[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char binary[]=new char[16];
		int cnt=0,input,input_c,var;
		while(true){
			System.out.print("���� ���� �Է�:");
			input = sc.nextInt();
			var=sc.nextInt();
			input_c = input;
			cnt=0;
			if((2<=input&&input<1024) && (1<var&&var<17)) {
				for(int i=0;i<arr.length;i++) {
					binary[i]=str[input_c%var];
					if((input_c/var)>0) cnt++;
					input_c=input_c/var;
				}// �Է�����
				//��½���
				System.out.println("�Է� : "+input);
				System.out.print(var+"���� : ");
				for(int i=cnt;i>=0;i--) {
					System.out.print(binary[i]);
				}
				System.out.println();
			}
			else if(input==-99)break;
			else System.out.println("�߸��� �Է¹���");
			}
		System.out.println("-99�� �Է¹޾� ���α׷� ����.");
	}
}
