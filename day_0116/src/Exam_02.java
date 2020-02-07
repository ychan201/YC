import java.util.Scanner;

/* Ű����� �����ȣ, �̸�, �޿� �Է� (�ִ� 10��)
 * �����ȣ�� -99 ����
 * 
 * �Է� : ��� �̸� �޿�
 *  ..   .   .   .   .
 *  
 *  ���
 *  ��� �̸� �޿� 50,000 10,000 5,000 . . . . 1
 *  . . . . . . . .
 *  �հ�     xxx    xx     xx    xx  x    xx  xx
 *  
 *  ���(Sawon), ���ó��(SawonData)
 */
class Sawon{
	int sabun,pay,mon=50000,flag=0;
	String name;
	int monarr[] = new int[10];
	Sawon(){}
	Sawon(int sabun,String name,int pay){
		this.sabun=sabun;
		this.name=name;
		this.pay=pay;
		
		for(int i=0;i<10;i++) {
			monarr[i]=pay/mon;
			pay%=mon;
			if(flag==0) {
				mon/=5;
				flag=1;
			}
			else {
				mon/=2;
				flag=0;
			}
		}
	}
}

class SawonData{
	Sawon sa[];
	int cnt,sum;
	int sumarr[] = new int[10];
	SawonData(){}
	SawonData(Sawon[] sa,int cnt){
		this.sa=sa;
		this.cnt=cnt;
	}
	
	void paySum() {
		for(int i=0;i<cnt;i++) {
			sum+=sa[i].pay;
			for(int j=0;j<sa[i].monarr.length;j++)
				sumarr[j]=sa[i].monarr[j];
		}
		System.out.print("�հ�\t\t"+sum+"\t");
		for(int i=0;i<sumarr.length;i++)
			System.out.print(sumarr[i]+"\t");
	}
	
	void print() {
		System.out.println("���\t�̸�\t�޿�\t\t50,000\t10,000\t5,000\t1,000\t500\t100\t50\t10\t5\t1");
		for(int i=0;i<cnt;i++) {
			System.out.print(sa[i].sabun+"\t"+sa[i].name+"\t"+sa[i].pay+"\t\t");
			for(int j=0;j<10;j++)
			System.out.print(sa[i].monarr[j]+"\t");
			System.out.println();
		}
		}
}

public class Exam_02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon[] sw = new Sawon[10];
		int cnt = 0;
		for(int i=0;i<10;i++) {
			System.out.print("�Է� :");
			int sabun = sc.nextInt();
			if(sabun==-99) break;
			String name = sc.next();
			int pay = sc.nextInt();
			sw[i]=new Sawon(sabun,name,pay);
			cnt++;
		}
		SawonData ss = new SawonData(sw,cnt);
		ss.print();
		ss.paySum();
	}
}