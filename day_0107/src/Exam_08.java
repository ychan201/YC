import java.util.Scanner;

/* 키보드 입력(1~99)
 * 입력 자료가 -99, 또는 입력자료 건수가 20건이면 종료
 * 입력: 77
 *  .  .  .
 *  입력 : -99 (-99는 입력자료가 아님)
 *  입력자료 	: xx xx xx xx xx xx xx
 *  평균		: xx
 *  평균에 가장 가까운 수 : xx
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] save = new int[20];
		int input,cnt=0,sum=0,avg,min,a_num;
		while(true) {
			System.out.print("자료 입력:");
			input = sc.nextInt();
			if(input==-99) break;
			if(1<=input&&input<=99) {
				save[cnt]=input;
				sum+=input;
				cnt++;
			}
			else System.out.println("입력범위 초과, 다시입력");
			if(cnt==20)break;
		}
		avg = sum/cnt;
		a_num = save[0];
		for(int i=0;i<cnt;i++) {
			if(save[i]>avg) {
				if(a_num>avg){
					if((save[i]-avg)<=(a_num-avg)) a_num=save[i];
					}
				else{
					if((save[i]-avg)<=(avg-a_num)) a_num=save[i];
				}
			}
			
			if(save[i]<avg) {
				if(a_num>avg){
					if((avg-save[i])<=(a_num-avg)) a_num=save[i];
					}
				else{
					if((avg-save[i])<=(avg-a_num)) a_num=save[i];
				}
			}
		}
		System.out.print("입력자료\t:");
		for(int i=0;i<cnt;i++) System.out.print(save[i]+" ");
		System.out.print("\n평균\t:"+avg);
		System.out.println("\n평균에 가장 가까운 수 : "+a_num);
	}
}