import java.util.Scanner;

/* Ű�����(��ȣ �̸� ���� ���� ���� ����)
 * �Է� : 1 ȫ�浿 77 88 99 80
 * . . . .
 * �Է� : -99  --> �Է� ����(�ִ�10��)
 * 
 * ���
 * ��ȣ �̸� ���� ���� ���� ���� ���� ���
 *  .  .  .   .  .  .   .  .
 *  .  .  .   .  .  .   .  .
 *  �հ�     xx  xx  xx  xx xx
 *  ���     xx.x xx.x xx  xx xx
 *  ��ü ��� �̻��� �л� ���
 *  ��ȣ �̸� ���
 *   .   .  .
 * ó������
 * 1. ����� ������(�Ҽ����� ����).
 * 2. ��ü ����� �Ҽ� ���� ��° �ڸ����� �ݿø�.
 */
public class Exam_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[11][7]; // ��ȣ,����,����,����,����,����,���
		String name[] = new String[10]; // �̸�
		double avg[] = new double[10];  // ���
		int cnt; // ���� �ο���
		for(cnt=0;cnt<10;cnt++) {
			System.out.print((cnt+1)+"��° �Է�:");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) break;
			name[cnt]=sc.next();
			for(int x=1;x<5;x++) {
				score[cnt][x]=sc.nextInt();
				score[cnt][5]+=score[cnt][x];  // ����
				score[10][x]+=score[cnt][x]; //���� ����
			}
			score[cnt][6]=score[cnt][5]/4; // ��հ�
			score[10][5]+=score[cnt][5];   // ���� ����
		}
		
		
		//�׽�Ʈ ���
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+name[x]+"\t");
			for(int y=1;y<7;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.print("�հ�"+"\t\t");
		for(int i=1;i<6;i++)
			System.out.print(score[10][i]+"\t");
		System.out.println();
		System.out.print("���"+"\t\t");
		for(int i=1;i<6;i++)
			System.out.print((int)(score[10][i]/(double)cnt*100+0.5)/100.+"\t");
		System.out.println("\n------------------��ü ��� �̻� �ο�------------------");
		System.out.println("��ȣ\t�̸�\t���");
		for(int i=0;i<cnt;i++) {
			if(score[i][5]>=score[10][5]/cnt) {
				System.out.print(score[i][0]+"\t"+name[i]+"\t"+score[i][6]);
			}
			System.out.println();
		}
	}
}
