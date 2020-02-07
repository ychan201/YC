import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"번호","국어","영어","수학"};
		int[][] score = new int[5][4];
		int cnt=0;
		// 입력 자료 출력
		while(true) {
			for(int x=0;x<score[x].length;x++) {
				System.out.print((cnt+1)+"번째입력"+str[x]+":");
				score[cnt][x]=sc.nextInt();
				sc.nextLine(); // nextLine - 버퍼에 있는 내용을 읽어서 버림.
			}
			if(cnt==5) break;
			if((0<=score[cnt][0]&&score[cnt][0]<=40)
					&&(0<=score[cnt][1]&&score[cnt][1]<=100)
					&&(0<=score[cnt][2]&&score[cnt][2]<=100)
					&&(0<=score[cnt][3]&&score[cnt][3]<=100)) cnt++;
			else System.out.println("다시입력.");
		}
		for(int x=0;x<score.length;x++) {
			for(int y=0;y<score[y].length;y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
