import java.util.Scanner;

/* Ű����� ��ȣ, �̸� , ����, ����, ���� �Է�
 * ������ ���� ����ϴ� Ŭ������ �����Ͻÿ�
 * [ �Է� ���� ] 
 * �Է� : 1  aaaa 90 70 80
 * [ ��� ���� ]
 * ��ȣ : xx
 * �̸� : xx
 * ���� : xx
 * ��� : xx
 */

class Student{
	void print(int a[],String name) {
		System.out.println("��ȣ :"+a[0]);
		System.out.println("�̸� :"+name);
		a[5]=a[4]/3;
		System.out.println("���� :"+a[4]);
		System.out.println("��� :"+(double)a[4]/3.);
		}
	}


public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[6];
		System.out.print("�Է� :");
		student[0]=sc.nextInt();
		String name=sc.next();
		for(int i=1;i<student.length-2;i++) {
			student[i]=sc.nextInt();
			student[4]+=student[i];
		}
		
		Student st = new Student();
		st.print(student, name);
		
		
	}
}
