import java.util.Scanner;

/* Ŭ���� �迭 ó��
 * Ű���� �Է� - �ִ� 10��
 * �Է� : ��ȣ �̸� ���� ���� ����
 * .  . . . . . . .  . . . . . .
 * ��� ( ������ �������� �������� )
 * ��ȣ �̸� �� �� �� �� �� ����
 * ��ȣ�� -99 �̸� �Է�����
 * 1. �л� ���� Student
 * 2. �л� ���� ó�� StudentData
 * 3. �ڷ� �Է� main()
 */
class Student {
	int[] std = new int[7];
	String name;
	Student(){
		std[6]=1;
	}
	
		
}

class StudentData{
	StudentData(){}
	StudentData(Student[] a,int cnt){
		for(int i=0;i<cnt;i++) {
		a[i].std[4]=a[i].std[1]+a[i].std[2]+a[i].std[3]; //����
		a[i].std[5]=a[i].std[4]/3; // ���
		}
		
		for(int i=0;i<cnt;i++) { // ����
			for(int j=0;j<cnt;j++) {
				if(a[i].std[4]<a[j].std[4]) {
					a[i].std[6]++;
				}
			}
		}
		for(int i=0;i<cnt-1;i++) { // ������ �������� ����
			for(int j=i+1;j<cnt;j++) {
				if(a[i].std[6]>a[j].std[6]) {
					Student temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");

		for(int i=0;i<cnt;i++) {
			System.out.print(a[i].std[0]+"\t");
			System.out.print(a[i].name+"\t");

			for(int j=1;j<a[i].std.length;j++) {
				System.out.print(a[i].std[j]+"\t");
			}
			System.out.println();
		}
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int cnt=0;
		Student[] student = new Student[10];
		for(int i=0;i<10;i++) {
			System.out.print("�Է�:");
			Student s=new Student();
			s.std[0]=sc.nextInt();
			if(s.std[0]==-99) break;
			s.name=sc.next();
			for(int j=1;j<s.std.length-3;j++) {
				s.std[j]=sc.nextInt();
			}
			student[i]=s;
			cnt++;
		}
				
		StudentData s;
		s = new StudentData(student,cnt);
		
	}
}
