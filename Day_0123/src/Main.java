import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է� �ޱ�
		Scanner scn = new Scanner(System.in);
		String sex;
		String name = null;
		while (true) {
			System.out.println("�Է��ּ��� : ");
			String input = scn.nextLine(); // ���� ��ü �Է�
			if (input.equalsIgnoreCase("end"))
				;
			String[] array = input.split("-");

			if (array[0].length() > 4)
				System.out.println("�̸��� 4���� �ʰ�");
			if(array[1].length()!=8) {
				System.out.println("�� �ֹ� 8���ھƴϾ� ���ִ� ��������?");
			}
			
			try {
				int imsi = Integer.parseInt(array[0]);
				System.out.println("����");
			} catch (Exception e) {
				name = array[0];
				System.out.println("�� �����ϴ�");
			}
			if ('1' == array[1].charAt(7))
				sex = "����";
			else if ('2' == array[1].charAt(7))
				sex = "����";
			else {
				System.out.println("�ֹ� �Է� ����");
				continue;
			}
			break;
		}
		System.out.println(name+sex);
	}

}
