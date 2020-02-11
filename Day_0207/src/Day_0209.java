/* 1. DB연동
 * 2. 검색
 */
public class Day_0209 {
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
		String myURL ="";
		String myID="";
		String myPW="";
		
	}
}
