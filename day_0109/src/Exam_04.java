/* �Է�
 * ��ȣ ���� ���� ����
 * 
 * ���
 * ��ȣ ���� ���� ���� ���� ���
 */

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][6];
		int cnt=0;
		// �Է� �ڷ� ���
			
		for(int x=0;x<score.length;x++) {
				System.out.print((cnt+1)+"�� �Է¹�ȣ:");
				score[x][0]=sc.nextInt();
				score[x][1]=sc.nextInt();
				score[x][2]=sc.nextInt();
				score[x][3]=sc.nextInt();
				score[x][4]=score[x][1]+score[x][2]+score[x][3]; // ����
				score[x][5]=score[x][4]/3; // ���
				cnt++;
			}
	
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
