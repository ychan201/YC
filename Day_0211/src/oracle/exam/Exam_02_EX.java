package oracle.exam;

import java.util.Scanner;

public class Exam_02_EX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String dname = sc.nextLine();
		oracleSQL oracle = new oracleSQL();
		try {
			oracle.makeConn();
			
			oracle.deptSearchDname(dname);
			
			
			oracle.takeDown();
		}catch(Exception e) {}
		
	}
}