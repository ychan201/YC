import java.util.Scanner;

public class Exem_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("��ȣ�Է� : ");
		int bun = scn.nextInt();
		System.out.print("�̸��Է� : ");
		String name=scn.next();
		System.out.print("�������� : ");
		double kor=scn.nextDouble();
		System.out.print("�������� : ");
		double eng=scn.nextDouble();
		System.out.print("�������� : ");
		double mat=scn.nextDouble();
		
		//int tot = (int)(kor+eng+mat);//double tot = kor+eng+mat;
		double tot = kor+eng+mat;
		double ave=tot/3;
		
		System.out.println("����ǥ");
		System.out.println("��ȣ\t�̸�\t����\t���");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);


	}

}

