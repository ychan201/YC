import java.util.Scanner;

/* 키보드 입력(2~100)
 * 입력값이 -99이면 종료한다.
 * 입력자료 중 소수를 구하여 출력(최대 5개)
 * 입력 : 5
 * . . .
 * 입력 : -99
 * 소수 : x x x x x
*/
public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[5];
		int input=0,count=0;
		while(true) {
			System.out.print("정수 입력:");
			input=sc.nextInt();
			if(input==-99) break;
			if(2<=input&&input<=100) {
				for(int i=2;i<=input;i++) {
					if(input%i==0) {
						if(input==i) {
							p[count]=input;
							count++;
						}
						else break;
					}
				}
			}
			else System.out.println("입력범위 초과");
			if(count==5) break;
		}
		System.out.print("소수:");
		for(int i=0;i<count;i++) System.out.print(" "+p[i]);
			
	}
}
