import java.util.Scanner;

/* Ű���� �Է�(2~100)
 * �Է°��� -99�̸� �����Ѵ�.
 * �Է��ڷ� �� �Ҽ��� ���Ͽ� ���(�ִ� 5��)
 * �Է� : 5
 * . . .
 * �Է� : -99
 * �Ҽ� : x x x x x
*/
public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[5];
		int input=0,count=0;
		while(true) {
			System.out.print("���� �Է�:");
			input=sc.nextInt();
			if(input==-99) break;
			if(2<=input&&input<=100) {
				for(int i=2;i<=input;i++) {
					if(input%i==0) {
						if(input==i) {
							p[count]=input;
							count++;
						}
						else break;
					}
				}
			}
			else System.out.println("�Է¹��� �ʰ�");
			if(count==5) break;
		}
		System.out.print("�Ҽ�:");
		for(int i=0;i<count;i++) System.out.print(" "+p[i]);
			
	}
}
