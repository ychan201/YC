import java.util.Scanner;

public class Exem_03 {

	public static void main(String[] args) {
		Scanner scn;//ctrl+shift+o
		scn = new Scanner(System.in); // ��ü ����
		
		int a = scn.nextInt();//���� �Է¹��� ��
		System.out.println("a=" + a);//���� �νĸ���.
		double b = scn.nextDouble();//�Ǽ� �Է¹��� ��
		System.out.println("b=" + b);//������ �Է��ϸ� �ڵ����� �Ǽ��� �ٲ��.
		String c = scn.next();//���ڿ� (��� �Է°���)
		System.out.println("c=" + c);//�������θ� �ν���. ������ �νĸ���.
		//String d = scn.nextLine();//���ڿ� (��� �ԷºҰ���)
		//System.out.println("d=" + d);//������ ��°�� �ν��Ѵ�. ','�� ������ �����Ͱ� ���ٴ� �Ǵ��Ѵ�


	}

}
