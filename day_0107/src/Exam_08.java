import java.util.Scanner;

/* Ű���� �Է�(1~99)
 * �Է� �ڷᰡ -99, �Ǵ� �Է��ڷ� �Ǽ��� 20���̸� ����
 * �Է�: 77
 *  .  .  .
 *  �Է� : -99 (-99�� �Է��ڷᰡ �ƴ�)
 *  �Է��ڷ� 	: xx xx xx xx xx xx xx
 *  ���		: xx
 *  ��տ� ���� ����� �� : xx
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] save = new int[20];
		int input,cnt=0,sum=0,avg,min,a_num;
		while(true) {
			System.out.print("�ڷ� �Է�:");
			input = sc.nextInt();
			if(input==-99) break;
			if(1<=input&&input<=99) {
				save[cnt]=input;
				sum+=input;
				cnt++;
			}
			else System.out.println("�Է¹��� �ʰ�, �ٽ��Է�");
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
		System.out.print("�Է��ڷ�\t:");
		for(int i=0;i<cnt;i++) System.out.print(save[i]+" ");
		System.out.print("\n���\t:"+avg);
		System.out.println("\n��տ� ���� ����� �� : "+a_num);
	}
}