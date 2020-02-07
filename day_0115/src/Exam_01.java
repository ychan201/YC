import java.util.Scanner;

/* 키보드로 번호, 이름 , 국어, 영어, 수학 입력
 * 다음과 같이 출력하는 클래스를 생성하시오
 * [ 입력 예시 ] 
 * 입력 : 1  aaaa 90 70 80
 * [ 출력 예시 ]
 * 번호 : xx
 * 이름 : xx
 * 총점 : xx
 * 평균 : xx
 */

class Student{
	void print(int a[],String name) {
		System.out.println("번호 :"+a[0]);
		System.out.println("이름 :"+name);
		a[5]=a[4]/3;
		System.out.println("총점 :"+a[4]);
		System.out.println("평균 :"+(double)a[4]/3.);
		}
	}


public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[6];
		System.out.print("입력 :");
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
