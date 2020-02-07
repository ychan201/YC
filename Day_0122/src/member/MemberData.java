package member;

public class MemberData {
	Member[] a;
	String[] S=new String[10];
	int cnt;
	int old[] = new int[10];
	
	MemberData(){}
	
	MemberData(Member[] a,int cnt){
		this.a=a;
		this.cnt=cnt;
	}
	
	void update() {
		for(int i=0;i<cnt;i++) {
				int year = Integer.parseInt(a[i].year.substring(0, 2)); // �ֹι�ȣ �� ���ڸ� �����Ͽ� year ������ ���������� ����
				old[i]=year;
				int Scom = Integer.parseInt(a[i].year.substring(7,8));	
				
				if(Scom%2 ==1 )S[i]="��";
				else S[i]="��";
				
				if(Scom==1 || Scom==2 || Scom==5 || Scom==6) {
					old[i]=2020-(year+1900);
				}
				else old[i]=2020-(year+2000);
		}
		
	}
	
	void print() {
		System.out.println("�̸�\t��ȭ\t\t����\t����");
		for(int i=0;i<cnt;i++)
		System.out.println(a[i].name+"\t"+a[i].bunho+"\t"+S[i]+"\t"+old[i]);
	}
}
