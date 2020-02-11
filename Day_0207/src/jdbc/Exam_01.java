package jdbc;
/*	JAVA + DB
 * 1. JDBC 드라이버 로딩  - API 로드
 * 2. 커넥션 연결 - 다리를 놓고
 * 3. 명령문 실행 - 자유롭게 왕래
 * DB와 연결할때 가장 기본적인 패키지 import
 */
import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		// JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // API를 불러올 때 쓰는 클래스.
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
			}
		
		// 커넥션 연결
		String myURL="jdbc:oracle:thin:@localhost:1521:orcl";
		String myUser="system";
		String myPass="1234";
		try {
			Connection con = DriverManager.getConnection(myURL, myUser, myPass); // 다리만들기!
			System.out.println("커넥션 연결 성공");
		}catch(Exception e){
			System.out.println("커넥션 연결 실패");
			e.printStackTrace();
			}
		
		
	}
}
