public class Exam_10 {
	public static void main(String[] args) {
		int score[][]=  {{1,90,78,79,0,1},{5,95,80,7,0,1},
						{2,79,88,77,0,1},{4,75,88,77,0,1},{3,95,88,75,0,1}};
		
		
		for(int x=0;x<score.length;x++) {
			for(int y=1;y<score[x].length-2;y++) {
				score[x][4]+=score[x][y];
			}
		}
		
		//���� ���
		for(int x=0; x<score.length;x++) {
			//int r=1;
			for(int y=0; y<score.length;y++) {
				if(score[x][4]<score[y][4]) // ���� ����
					//r++;
					score[x][5]++;
			}
			//score[x][5]=r;
		}
		
		// �Է� �ڷ� ���
				System.out.println("��ȣ\t����\t����\t����\t����\t����");
				for(int x=0;x<score.length;x++) {
					for(int y=0;y<score[x].length;y++) {
						System.out.print(score[x][y]+"\t");
					}
					System.out.println();
				}
	
		// ��ȣ�� �������� �������� ����
		for(int x=0;x<score.length;x++) {
			for(int y=x+1;y<score[x].length-1;y++) {
				if(score[x][0]>score[y][0]) {
					//����
					for(int i=0;i<score[x].length;i++) {
					int temp=score[x][i];
					score[x][i]=score[y][i];
					score[y][i]=temp;
					}
				}
			}
		}
		System.out.println("---------------------���----------------------");
		System.out.println("��ȣ\t����\t����\t����\t����\t����");
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[x].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
		
	}
}
