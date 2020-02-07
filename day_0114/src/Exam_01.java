/* ��ü ���� ���α׷���( OOP )
 * 1. Ŭ���� : �߻�ȭ (�Ӽ� - ������� , ����(���) - �޼ҵ�)
 * 2. �ν��Ͻ�(��ü) : Ŭ������ ���� ������ ��ü
 * 3. �޽���(�޼ҵ�) : ��ü�� ���� ��ȣ �ۿ��ϴµ� ���Ǵ� ����.
 * �������� - �迭���� ����� ��. ( if�� �� ) C�� ���� ��ǥ��.
 * ��ü ���� 3���
 * ĸ��ȭ - Ŭ������ �������� ����� �־�ΰ� ����(ĸ��ȭ)����.
 * ��Ӽ� - ���� Ŭ�����κ��� �ʿ��� ����� ��ӹ��� �� ����.
 * ������ - �������� ����� ����.
 * 
 * ���콺
 * 1. �Ӽ� : ��ư ��, ��(��)�� , ����
 * 2. ��� : ��Ŭ��, ��Ŭ��,�� ����Ŭ��
 */
class Mouse{
	// �Ӽ� ����
	private int btnNo=2; // ��ư ��
	private boolean cable=true; // ����(true) ����(false)
	private String color="����"; // ����
	// ������ - Ŭ���� �̸��� ���� �޼ҵ� - ������ �����ε�
	// ��ü ������ �ʱ�ȭ
	Mouse(){} // �����ڸ� �ϳ� ���� ��쿡��, ����Ʈ �����ڸ� ������ ������ �Ѵ�.
	Mouse(int btnNo){
		this.btnNo = btnNo;
	}
	Mouse(int btnNo,boolean cable){
		this.btnNo = btnNo;
		this.cable=cable;
	}
	Mouse(int btnNo,boolean cable,String color){
		this.btnNo=btnNo;
		this.cable=cable;
		this.color=color;
	}
	
	// �ڽ� ���
	
	void info(){
		System.out.print("���콺�� ��ư ���� "+btnNo+"�� �̰�,");
		if(cable) System.out.println("���� ��� �Դϴ�.");
		else System.out.println("���� ��� �Դϴ�.");
		System.out.println("������ "+color+"�Դϴ�.");
	}
	
	public void setBtnNo(int btnNo) {
		this.btnNo = btnNo;
	}
	
	//�������(�޼ҵ�)
	
	void leftClick() {
		System.out.println("���� ��ư Ŭ���ƴ�");
	}
	void rightClick() {
		System.out.println("������ ��ư Ŭ���ƴ�");
	}
	int leftDoubleClick() {
		System.out.println("���� ��ư ����Ŭ���ƴ�");
		return 0;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Mouse mou1 = new Mouse(); // �ν��Ͻ�(���۷���) ���� ���� �� �ʱ�ȭ.
		mou1.info();
		mou1.setBtnNo(5);
		mou1.info();
		System.out.println("----------------------");
		Mouse mou2 = new Mouse(3);
		mou2.info();
		System.out.println("----------------------");
		Mouse mou3 = new Mouse(3,true);
		mou3.info();
		System.out.println("----------------------");
		Mouse mou4 = new Mouse(3,true,"�׷���");
		mou4.info();
	}
}
