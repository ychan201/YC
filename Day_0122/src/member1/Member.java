package member1;

public class Member {
	String name; // �̸�
	String sernum; // �ֹι�ȣ
	String phone; // ��ȭ
	int nai;
	Member(){}
	
	Member(String n,String s, String p){
		this.name=n;
		this.sernum=s;
		this.phone=p;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+sernum+"\t"+phone;
	}
}
