import java.util.Arrays;

/* Arrays
 *  - �迭 ����, �׸� ��, ����, �˻� ���� ����
 */
public class Exam_08 {
	public static void main(String[] args) {
		int var[] = {1,2,3,4,5,6};
		int[] str = Arrays.copyOf(var, var.length);
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		System.out.println("�迭 �ּҺ� : "+(var.equals(str)));
		System.out.println("�迭 ��� �� �� : "+(Arrays.equals(var, str)));
	}
}
