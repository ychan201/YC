package test01;

class Tv{
	String model;
	int inch;
		
	Tv(String model,int inch){
		this.model=model;
		this.inch=inch;
	}
	void printTv() {
		System.out.println("Tv �� : " + model);
		System.out.println("Tv ũ�� : " + inch);
	}
}

final class DigitalTv extends Tv{ // final�� ���̰� �Ǹ�, ���̻� ��� �Ұ����� ���·� �������.
	DigitalTv(){
		super("�Ｚ",16); // ����Ŭ���� ȣ��
	}
}

/*
 class SmartTv extends DigitalTv{ �Ұ�����.

	
}*/

public class exam_04 {
	public static void main(String[] args) {
		DigitalTv tv = new DigitalTv();
	}
}
