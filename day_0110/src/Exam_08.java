import java.util.Scanner;

/* ����Ÿ�� O, �Ű����� O
 * Ű����� ���� �Է�
 * �Էµ� �������� �հ� ���
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = sc.nextInt();
		System.out.print("1 ~ "+num+" �� : ");
		System.out.println(sum(num));
	}
	
	static int sum(int a) {
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
}
