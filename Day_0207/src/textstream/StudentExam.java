package textstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* 파일로부터 입력
 * 출력 예시 ( 파일 출력 dataout.txt , 콘솔 출력 )
 * 번호	이름		성별	국어	영어	수학	총점	평균
 *  1	홍길동	남자	55	66	88	xx	xx
 */

public class StudentExam {
	public static void main(String[] args) throws Exception{
		List<Student> list = new ArrayList<Student>();
		TreeSet<Student> set = new TreeSet<Student>();
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\data.txt")));
		String data="";
		while(true) {
			data = br.readLine();
			if(data==null) break;
			String[] s = data.split(",");
			Student st = new Student(s);
			set.add(st);
		}
		
		PrintWriter pw  = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		PrintWriter pwf  = new PrintWriter(new BufferedWriter(new FileWriter(new File("c:\\data\\dataout.txt"))));

		for(Student s :set) {
			pw.println(s);
			pwf.println(s);
		}
		
		pwf.close();
		pw.close();
	}
}
