/* 10���� �迭�� ����� ������ �� �ִ�, �ּ� �� ã��
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		int[] score = {90,44,77,88,67,94,83,54,86,57};
		int max=score[0];
		int min=score[0];
		
		for(int i=1;i<10;i++) {
			if(max<score[i]) max=score[i];
			if(min>score[i]) min=score[i];
		}
		// ���
		System.out.println("------------�Է��ڷ�------------");
		for(int i=0;i<10;i++) System.out.print(score[i]+" ");
		System.out.println("\n------------------------------");
		System.out.println("�ִ밪 :"+max);
		System.out.println("�ּҰ� :"+min);
		
	}
}
