
class Mouse2 {
	// �Ӽ� ����
	int btnNo; // ��ư ��
	boolean cable; // ����(true) ����(false)
	String color; // ����

	Mouse2() {
	}

	Mouse2(int btnNo, boolean cable, String color) {
		if(btnNo==2 || btnNo==3) {
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
		}
		else System.out.println("���콺 ���� �Ұ�");
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
		if (btnNo == 2) {
			if (btn == 1)
				System.out.println("���ʹ�ư Ŭ��");
			else if (btn == 2)
				System.out.println("�����ʹ�ư Ŭ��");
			else
				System.out.println("��ư�� �����ϴ�.");
		} 
		else if (btnNo == 3) {

			if (btn == 1)
				System.out.println("���ʹ�ư Ŭ��");
			else if (btn == 2)
				System.out.println("�����ʹ�ư Ŭ��");
			else if (btn == 3)
				System.out.println("�� Ŭ��");
			else
				System.out.println("��ư�� �����ϴ�.");
		}
		else System.out.println("�߸��� ���콺");
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Mouse2 m1 = new Mouse2(1, true, "����");
		m1.mousePrint();
		m1.buttonClick(3);
	}
}
