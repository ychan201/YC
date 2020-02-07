
class Mouse3 {
	// �Ӽ� ����
	int btnNo; // ��ư ��
	boolean cable; // ����(true) ����(false)
	String color; // ����

	Mouse3() {
	}

	Mouse3(int btnNo, boolean cable, String color) {
		
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
	}

	void mousePrint() {
		System.out.print("��ư�� :" + btnNo + "\t");
		System.out.print("������ :" + cable + "\t");
		System.out.println("���� :" + color);

	}

	// ��ư Ŭ�� �޼ҵ� ����
	// ��ư�� 2���� ���(1-����, 2-������)
	// ��ư�� 3���� ���(1-����, 2-������, 3- ��)
	void buttonClick(int btn) {
		if(btn<1) {
			System.out.println("Ŭ�� ����");
			return;
		}
		if(btn==1) {
			System.out.println("���ʹ�ư Ŭ��");
			return;
		}
		if(btnNo<2 && btn==2) {
			System.out.println("������ ��ư Ŭ�� ����");
			return;
		}
		if(btnNo>1 && btn==2) {
			System.out.println("������ ��ư Ŭ��");
			return;
		}
		if(btnNo<3 && btn==3) {
			System.out.println("�� ��ư Ŭ�� ����");
			return;
		}
		if(btnNo>2 && btn==3) {
			System.out.println("�� ��ư Ŭ��");
			return;
		}
		if(btn>3) {
			System.out.println("Ŭ�� ����");
			return;
		}
	}
}

public class Exam_02_1 {
	public static void main(String[] args) {
		Mouse3 m1 = new Mouse3(1,true, "����");
		m1.mousePrint();
		m1.buttonClick(3);
	}
}
