package test01;
//�������� ���� ȣ�� 
// ��� �޴� ���� ����� �޼ҵ常 ��ӵȴ�. �����ڴ� ��ӵ��� �ʴ´�.

class FF {
	FF(){
		System.out.println("FF() ������ ȣ��");
	}
}

class GG extends FF{
	
	GG(){
		System.out.println("GG() ������ ȣ��");
	}
	
	GG(int a){
		System.out.println("a="+a);
	}
}

class HH extends GG{
	HH(){
		System.out.println("HH() ������ ȣ��");
	}
}


public class Exam_03 {
	public static void main(String[] args) {
		FF ff = new FF();
		System.out.println();
		GG gg = new GG();
		System.out.println();
		HH hh = new HH();
	}
}
