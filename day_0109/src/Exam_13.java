import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[10][6]; // ��ȣ,����,����,����,����,����
		String name[] = new String[10]; // �̸�
		double avg[] = new double[10];  // ���
		int cnt; // ���� �ο���
		for(cnt=0;cnt<10;cnt++) {
			System.out.print((cnt+1)+"��° �Է�:");
			score[cnt][0]=sc.nextInt();
			if(score[cnt][0]==-99) break;
			name[cnt]=sc.next();
			for(int x=1;x<4;x++) {
				score[cnt][x]=sc.nextInt();  	// ���
				score[cnt][4]+=score[cnt][x];  // ����
			}
			avg[cnt]=(int)(score[cnt][4]/3.*100+0.5)/100.; // ��հ�
		}
		for(int x=0;x<cnt;x++) {
			score[x][5]++;
			for(int y=0;y<cnt;y++) {
				if(score[x][4]<score[y][4]) score[x][5]++;
			}
		}
		//�׽�Ʈ ���
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
		for(int x=0;x<cnt;x++) {
			System.out.print(score[x][0]+"\t"+name[x]+"\t");
			for(int y=1;y<5;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println(avg[x]+"\t"+score[x][5]);
		}
	}
}
