import java.sql.*;
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("사원이름 :");
		String name = sc.nextLine();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL, myID, myPW);
			//stmt = con.createStatement();
			String query ="select * from employee where ename=? and eno=?"; // 물음표가 pstmt.set의 인덱스 번호가 됨.
			//rs = stmt.executeQuery(query);
			pstmt = con.prepareStatement(query); // 객체가 생성될 때, 쿼리문이 같이 넘어감. prepare
			pstmt.setString(1, name);
			pstmt.setInt(2, 7654);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int eno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager=rs.getInt("manager");
				String hiredate=rs.getString("hiredate"); // 형식을 그대로 유지하고 싶으면 local date 타입?
				int salary = rs.getInt("salary");
				int commission = rs.getInt("commission");
				int dno = rs.getInt("dno");
				System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+hiredate+"\t"+salary+"\t"+commission+"\t"+dno);
			}
		} catch (Exception e) {e.printStackTrace();};
		
		try {
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {};
	}
}
