import java.util.Scanner;

/* Ű���� �Է�(100,000 ~ 1,000,000)
 * �Է��ڷᰡ -99�϶� ����.
 * �Է� : 234567
 * �Է� : 345434
 *   .  .  .
 * �Է� : -99
 * �ѱ޿� :  xxxxxxxxx
 * 50,000 10,000 5,000 1,000 500 100 50 10  5  1
 *   xx     xx    xx     xx  xx  xx  xx xx xx xx 
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay=0,pay_tot=0,mon=50000,mon1=50000;
		int mk[]=new int[10];
		while(true) {
			System.out.print("�޿��Է�");
			pay = sc.nextInt();
			if(pay==-99) break;
			if(100000<=pay&&pay<=1000000) {
				pay_tot+=pay;
			}
		}
		int pay_rem = pay_tot;
		for(int i=0;i<mk.length;i++) {
			mk[i]=pay_tot/mon;
			pay_tot=pay_tot%mon;
			if(i%2==0) mon = mon/5;
			else mon = mon/2;
		}
		System.out.println("�� �޿�:"+pay_rem);
		for(int i=0;i<10;i++) {
			if(mon1>=1000) System.out.print(mon1/1000+",000\t");
			else  System.out.print(mon1+"\t");
			if(i%2==0) mon1 = mon1/5;
			else mon1 = mon1/2;
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			if(mk[i]>=1000) System.out.print(mk[i]/1000+",000\t");
			else  System.out.print(mk[i]+"\t");
		}
	}
}
