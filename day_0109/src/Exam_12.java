import java.util.Scanner;

/* Ű����(�л����������Է�(�ִ� 10��)
 * 1. �Է�(��ȣ �̸� ���� ���� ���� )
 * �Է� : 1 ȫ�浿 89 80 90
 * �Է� : 2 XXX xx xx xx
 * �Է� : 3 XXX xx xx xx
 * .  .   . . . . . . . .
 * �Է� : 10 XXX xx xx xx
 * �Է� : -99 ����
 * 
 * 2. ��� -1
 *   ��ȣ �̸� ���� ���� ���� ���� ��� ����
 * 3. ��� -2 ������ �������� ���
 */

public class Exam_12 {
	public static void main(String[] args) {
		int score[][]=  new int[10][6];
		String[] str = new String[10];
		int cnt=0;
		double avg[] = new double[5];

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�Է�"+(cnt+1)+":");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) {
				score[cnt][0]=0;
				break;}
			str[cnt] = sc.next();
			for(int i=1;i<4;i++) {
				score[cnt][i]=sc.nextInt();
			}
			cnt++;
			if(cnt==10)break;
		}
		
		
		//���� ���
		for(int x=0;x<cnt;x++) {
			for(int y=1;y<score[x].length-2;y++) {
				score[x][4]+=score[x][y];
			}
			avg[x]=(int)(score[x][4]/3.*10+0.5)/10.;
		}
		
		//���� ���
		for(int x=0; x<cnt;x++) {
			score[x][5]++;
			for(int y=0; y<score.length;y++) {
				if(score[x][4]<score[y][4]) // ���� ����
					//r++;
					score[x][5]++;
			}
			//score[x][5]=r;
		}
		
		// �Է� �ڷ� ���
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				for(int x=0;x<cnt;x++) {
					System.out.print(score[x][0]+"\t"+str[x]+"\t");
					for(int y=1;y<score[x].length-1;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println(avg[x]+"\t"+score[x][5]);
				}
	
		// ��ȣ�� �������� �������� ����
		for(int x=0;x<cnt-1;x++) {
			for(int y=x+1;y<cnt;y++) {
				if(score[x][5]>score[y][5]) {
					//����
					for(int i=0;i<score[x].length;i++) {
					int temp=score[x][i];
					score[x][i]=score[y][i];
					score[y][i]=temp;
					}
					String temp_1=str[x];
					str[x]=str[y];
					str[y]=temp_1;
					
					double temp=avg[x];
					avg[x]=avg[y];
					avg[y]=temp;
				}
			}
		}
		System.out.println("---------------------���----------------------");
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+str[x]+"\t");
			for(int y=1;y<score[x].length-1;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(avg[x]+"\t"+score[x][5]);
		}
	}
}
