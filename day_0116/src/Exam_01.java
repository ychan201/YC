import java.util.Scanner;

/* 클래스 배열 처리
 * 키보드 입력 - 최대 10명
 * 입력 : 번호 이름 국어 영어 수학
 * .  . . . . . . .  . . . . . .
 * 출력 ( 석차를 기준으로 오름차순 )
 * 번호 이름 국 영 수 총 평 석차
 * 번호가 -99 이면 입력종료
 * 1. 학생 정보 Student
 * 2. 학생 정보 처리 StudentData
 * 3. 자료 입력 main()
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
		a[i].std[4]=a[i].std[1]+a[i].std[2]+a[i].std[3]; //총점
		a[i].std[5]=a[i].std[4]/3; // 평균
		}
		
		for(int i=0;i<cnt;i++) { // 석차
			for(int j=0;j<cnt;j++) {
				if(a[i].std[4]<a[j].std[4]) {
					a[i].std[6]++;
				}
			}
		}
		for(int i=0;i<cnt-1;i++) { // 석차를 오름차순 정렬
			for(int j=i+1;j<cnt;j++) {
				if(a[i].std[6]>a[j].std[6]) {
					Student temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");

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
			System.out.print("입력:");
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
