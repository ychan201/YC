package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		
		while(true) {
			String hak,ban,bun,name,score;
			boolean flag = false;
			while(true) {
				System.out.print("�г� :");
				hak = sc.nextLine();
				if(hak.contentEquals("0")) {
					flag=true;
					break;
				}
				if(Pattern.matches("[1-3]{1}", hak)) break;
				System.out.println("�г��� �Է¹����� 1~3�Դϴ�. �ٽ��Է����ּ���.");
			}
			if(flag) break;
			while(true) {
				System.out.print("�� :");
				ban=sc.nextLine();
				if(Pattern.matches("^[1-6]{1}$", ban)) break;
				System.out.println("���� �Է¹����� 1~6�Դϴ�. �ٽ��Է����ּ���.");

			}
			
			while(true) {
				System.out.print("��ȣ :");
				bun=sc.nextLine();
				if(Pattern.matches("^[0-9]{1,2}", bun)) {
					if(1<=Integer.parseInt(bun) && Integer.parseInt(bun)<=45)
						break;
				}
				System.out.println("��ȣ�� �Է¹����� 1~45�Դϴ�. �ٽ��Է����ּ���.");

			}
			
			String hakbun=hak+ban+bun;
			if(list.contains(new Student(hakbun))) {
				System.out.println("�й��� �ߺ��Ǿ����ϴ�. ��,��ȣ,�̸��� �ٽ� �Է����ּ���");
				continue;
			}
			
			
			while(true) {
				System.out.print("�̸� :");
				name=sc.nextLine();
				if(Pattern.matches("^[a-zA-Z]{1,10}$", name)) break;
				System.out.println("�̸��� ������ 10�� �̳��� �ٽ��Է����ּ���.");
			}
			
			while(true) {
				System.out.print("���� :");
				score=sc.nextLine();
				if(Pattern.matches("^[0-9]{1,3}$", score)) {
					if(Integer.parseInt(score)<=100) break;
				}
				System.out.println("������ �Է¹����� 1~100�Դϴ�. �ٽ��Է����ּ���.");

			}
			Student std = new Student(hakbun,name,score);
			list.add(std);
		}
		
		System.out.println("�й�\t�̸�\t\t����\t����");
		for(Student std :list) {
			System.out.println(std);
		}
	}
}
