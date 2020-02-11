import java.sql.*;

/* 1. DB연동
 * 2. 검색
 */
public class Exam_01 {
	public static void main(String[] args) {
		// 1단계 JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
		
		//2단계 Connection 객체 생성 - 커넥션 연결
		String myURL ="jdbc:oracle:thin:@localhost:1521/xe"; // 오라클의 기본 포트는 1521. 포트번호는 설정 가능
		String myID="hr"; 
		String myPW="1234";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(myURL,myID,myPW);
			System.out.println(con);
		}catch(Exception e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}
		
		//3단계 SQL 사용
		Statement stmt = null; // SQL을 사용하기 위해 필요한 클래스 2가지. 명령문은 Statement가 처리.
		ResultSet rs = null; // select 사용시 필요함 , 결과를 ResultSet이 처리.
		try {
			stmt = con.createStatement(); // 새로운 명령문을 사용하겠다.
			rs=stmt.executeQuery("select * from department");
			while(rs.next()) {
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		};
		//4단계 닫기 
		try { // 닫아주지 않으면 해킹의 위험이 있음.
			rs.close(); // 닫는건 사용의 역순.
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		};
	}
}
