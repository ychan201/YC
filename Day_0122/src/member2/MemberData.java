package member2;

public class MemberData {
	Member[] a;
	int cnt;
	
	MemberData(){}
	
	MemberData(Member[] a,int cnt){
		this.a=a;
		this.cnt=cnt;
	}
	
	void update() {
		for(int i=0;i<cnt;i++) {
				int year = Integer.parseInt(a[i].year.substring(0, 2)); // �ֹι�ȣ �� ���ڸ� �����Ͽ� year ������ ���������� ����
				int Scom = Integer.parseInt(a[i].year.substring(7,8));	// ������� ���� �ĺ���ȣ
				
				if(Scom%2 ==1 )a[i].S="��";
				else a[i].S="��"; 
				
				if(Scom==1 || Scom==2 || Scom==5 || Scom==6) {
					a[i].nai=2020-(year+1900);
				}
				else a[i].nai=2020-(year+2000);
		}
		
	}
	
	void print() {
		System.out.println("�̸�\t��ȭ\t\t����\t����");
		for(int i=0;i<cnt;i++)
		System.out.println(a[i].name+"\t"+a[i].bunho+"\t"+a[i].S+"\t"+a[i].nai);
	}
}
