package member1;

public class MemberData {
	Member[] mem; // ȸ������ �迭 Ŭ����
	int cnt; // �ο��� ó�� ���� ����
	
	MemberData(){}
	
	MemberData(Member[] m,int c){
		mem=m;
		cnt=c;
	}
	
	void memPrint() {
		System.out.println("�̸�\t��ȭ��ȣ\t����\t����");
		for(int i=0;i<cnt;i++) {
			System.out.println(mem[i].name+"\t"+mem[i].phone+"\t");
			
		}
	}
	
	
	
	void testPrint() {
		System.out.println("�̸�\t�ֹι�ȣ\t\t��ȭ��ȣ");
		for(int i=0;i<cnt;i++) {
			System.out.println(mem[i]);
		}
	}
}
