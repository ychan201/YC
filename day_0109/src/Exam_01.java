/* 2���� �迭
 * ù��° ���� �迭 ��ȣ - 2,3,4��° ���� ���� 
 */
public class Exam_01 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79},{5,95,80,70},
						{2,79,88,77},{4,75,88,77},{3,95,88,75}};
		
		// �Է� �ڷ� ���
		System.out.println("��ȣ\t����\t����\t����");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[y].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
