import java.util.Scanner;

/* Ű���� �Է�(10��)
 *  ���� ���� ���� ���
 *  1. ��, ����� main() ������ ó��
 *  2. ������ �޼ҵ忡�� ó��
 */
public class Exam_09 {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		// �Է�
		for (int i = 0; i < a.length; i++) {
			System.out.print("���� �Է�:");
			a[i] = sc.nextInt();
		}

		// ���
		printData("��ȯ��",a);
		
		sort(a);
		printData("��ȯ��",a);
		
		
	}

	static void sort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}
		}
	}
	
	static void printData(String title,int a[]) {
		System.out.println(title+"��� : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

}
