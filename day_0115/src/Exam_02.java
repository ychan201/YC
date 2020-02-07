import java.util.Scanner;

/* Ű����� �����, ���۰�, ���� �Է� ������ ���� ����ϴ� Ŭ������ �ۼ��Ͻÿ�
 * 1. [ �Է� ���� ] 
 *  ����� : ȫ�浿
 *     ���� : 5
 *         �� : 20
 * 2. [ ��� ���� ]
 *  ����� : ȫ�浿
 *  ������ : 5+6+7+8+9+10+11+ . . . . .+20 = xxx
 */

class SeqNumber {
	String name;
	int start, end, sum;

	SeqNumber() {
	}

	SeqNumber(String n, int s, int e) {
		name = n;
		start = s;
		end = e;
	}

	void print() {
		System.out.println("----------���----------");
		System.out.println("����� :" + name);
		System.out.print("������ :");
		for (int i = start; i <= end; i++) {
			if (i == end)
				System.out.print(i + "=");
			else
				System.out.print(i + "+");
			sum += i;
		}
		System.out.print(sum);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ۼ�
		System.out.println("----------�Է�----------");
		System.out.print("����� :");
		String name = sc.next();
		System.out.print("���� :");
		int start = sc.nextInt();
		System.out.print("�� :");
		int end = sc.nextInt();
		SeqNumber seq = new SeqNumber(name, start, end);
		seq.print();
	}
}
