
public class Tvtest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); // tV T1; T1 = NEW tV(); �� �ѹ������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� "+t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� "+t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
	}
}
