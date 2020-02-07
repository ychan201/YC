import java.util.Scanner;
import java.util.regex.Pattern;

/* ���� ǥ���� Ư���� ���ڿ��� �˻��ϴ� ��. - Pattern Ŭ�������� ����
 * \\d(����), \\w(������ �Ǵ� ����)
 * \\d? - ���ڷ� �� ��(���ų� �� ��),\\d* - ���ڷ� ���� ��(�� �� �̻�)
 * \\d{3} - ���ڷ� �� ��,\\d{1,3} - ���ڷ� 1�� ~ 3��
 * Ű����� ������ 1�� �̻� �Է��� �޴´�
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ��ĳ�� sc ����
		System.out.print("���� �Է�:"); // �ܼ�â �ȳ��޽���
		String var[] = sc.nextLine().split(","); // ��Ʈ���迭 var�� ���ڿ� 1���� �Է¹޾� ","�� �������� ������ var �迭�� ����
		for(int i=0;i<var.length;i++) { // ��Ʈ���迭 var �� ���̸�ŭ �ݺ���
			boolean bool = Pattern.matches("\\w*", var[i]); // boolean Ÿ���� bool ���� ���� ��, Pattern ����ǥ���� ��� ( \\d ���ڸ� , �˻��� ���ڿ� )
			if(bool) {
				System.out.println(var[i]+" = ����");
			}
			else
				System.out.println(var[i]+" = ����");
		}
	}
}
