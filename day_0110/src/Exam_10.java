/*  2���� �迭�� Data �� �Է� �Ǿ� ���� ���
 * 1: 9 90 80 89 80 90
 * 2: 5 77 88 99 90 70
 *  : . . . . . . . . . 
 * 5:55 66 76 89 80 90
 * 
 * 1. �Է� �ڷ� ��� �޼ҵ� ����(dataPrint())
 * 	  ��ȣ ����1 ����2 ����3 ����4 ����5
 * 2. ���� ���ϴ� �޼ҵ� ����(dataTot())
 * 3. ������ �������� �������� ���� �޼ҵ� ����(totSort())
 * 4. ��ü ��� �޼ҵ� ����(dataPrint())
 */
public class Exam_10 {
	public static void main(String[] args) {
		int arr[][] = { { 9, 90, 80, 89, 80, 90, 0 }, { 5, 80, 46, 97, 85, 66, 0 }, { 3, 67, 85, 79, 90, 84, 0 },
				{ 7, 80, 70, 76, 84, 74, 0 }, { 1, 65, 84, 95, 76, 82, 0 } };

		// dataPrint() ȣ��
		dataPrint("�Է� �ڷ�", arr);
		// dataTot() ȣ��
		dataTot(arr);
		// totSort() ȣ��
		totSort(arr);
		// dataPrint() ȣ��
		dataPrint("��ü �ڷ�",arr);

	}

	static void dataPrint(String str, int a[][]) {
		System.out.println("---------------------" + str + " ���-----------------------");
		System.out.print("��ȣ\t����1\t����2\t����3\t����4\t����5");
		if(str=="��ü �ڷ�") System.out.print("\t����");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				System.out.print(a[i][j] + "\t");
			}
			if(str=="��ü �ڷ�") System.out.print(a[i][6]);
			System.out.println();
		}
	}

	static void dataTot(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				a[i][6]+=a[i][j];
			}
		}
	}
	static void totSort(int a[][]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][6] < a[j][6]) {
					for(int k=0;k<a[i].length;k++) {
						int temp=a[i][k];
						a[i][k]=a[j][k];
						a[j][k]=temp;
					}
				}
			}
		}
	}
}
