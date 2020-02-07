package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner scF = new Scanner(new File("src\\student\\data.txt"));
		Student std[] = new Student[20];
		int cnt=0;
		System.out.print("정답 입력:");
		String dap = sc.next();
		String d[] = dap.split(",");
		
		
		while(scF.hasNext()) {
			String str = scF.next();
			String s[] = str.split(",");
			Student st = new Student(s);
			std[cnt]=st;
			cnt++;
		}
		
		StudentData sd = new StudentData(d,std,cnt);
	}
}
