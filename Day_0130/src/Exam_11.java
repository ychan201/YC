import java.util.Arrays;

/* �˻�
 * 
 */

public class Exam_11 {
	public static void main(String[] args) {
		int var[] = {80,90,77,88,56,95};
		String name[] = {"ȫ�浿","���ڹ�","�̼���"};
		
		Arrays.parallelSort(var);
		for(int i=0;i<var.length;i++) {
			System.out.print(var[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(var, 90); // 2���˻��� ������ �Ǿ��־�� ��.
		System.out.println("90 ��ġ�� : " + index);
		
		Member m[] = new Member[10];
		m[0] = new Member("ȫ�浿");
		m[1] = new Member("��漭");
		m[2] = new Member("�̱泲");
		m[3] = new Member("�ڱ��");
		m[4] = new Member("������");
		m[5] = new Member("������");
		m[6] = new Member("�����");
		m[7] = new Member("�ѱ��");
		m[8] = new Member("ǥ���");
		m[9] = new Member("������");
		Arrays.parallelSort(m);
		int no = Arrays.binarySearch(m, m[2]);
		System.out.println(m[2].name + "��" + no+ "����");
	}
}
