import java.util.Scanner;

/* ��ȣ, �̸�, ����n ���� �Է� �޾Ƽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�
 * 1) �Է� �׸� - �ִ� 10�� �Ǵ� ��ȣ�� -99�̸� ��� �� ����
 *    - ��ȣ , �̸�, ���� 5��
 * 2) ó������
 *  - ���� ��� �� ������������ ���
 * 3) ���
 *    ��ȣ �̸� ����
 *     1  AAA 77 80 87 90 95
 */
class Hak{
	int bun;
	String name;
	int[] score=new int[5];
	
	Hak(){}
	Hak(String[] a){
		bun=Integer.parseInt(a[0]);
		name=a[1];
		for(int i=2;i<a.length;i++) {
			score[i-2]=Integer.parseInt(a[i]);
		}
	}
}

class HakData{
	Hak[] hak;
	int cnt;
	HakData(Hak[] hak,int cnt){
		this.hak=hak;
		this.cnt=cnt;
	}
	
	void sort() {
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<hak[i].score.length-1;j++) {
				for(int k=j+1;k<hak[i].score.length;k++) {
					if(hak[i].score[j]>hak[i].score[k]) {
						int temp = hak[i].score[j];
						hak[i].score[j] = hak[i].score[k];
						hak[i].score[k] = temp;
					}
				}
			}
		}
	}
	
	void dataPrint() {
		sort();
		System.out.println("��ȣ\t�̸�\t����");
		for(int i=0;i<cnt;i++) {
			System.out.print(hak[i].bun+"\t"+hak[i].name+"\t");
			for(int j=0;j<hak[i].score.length;j++) {
				System.out.print(hak[i].score[j]+"\t");
			}
			System.out.println();
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hak[] hk = new Hak[10];
		int cnt=0;
		while(cnt<10) {
			boolean flag =false;
			String[] str = sc.nextLine().split(",");
			if(str[0].equals("-99")) break;
			if(!(str.length==7)) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
			for(int j=0;j<str.length;j++) {
				if(j==1);
				else if(str[j].equals("100"));
				else if(str[j].length()>2) {
					flag=true;
				}
				for(int k=0;k<str[j].length();k++) {
					if(j==1) break;
					else if(str[j].charAt(k)<'0' || str[j].charAt(k)>'9') {
						flag=true;
						break;
					}
				}
				if(flag) break;
			}
			if(flag) {
				System.out.println("�Է¹����ʰ�. �ٽ��Է����ּ���.");
				continue;
			}
			Hak h = new Hak(str);
			hk[cnt]=h;
			cnt++;
		}
		HakData hak = new HakData(hk,cnt);
		hak.dataPrint();
	}
}
