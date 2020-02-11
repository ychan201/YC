import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Sawon{
	String name,job,hiredate;
	int eno,manager,salary,commission,dno;
	
	Sawon(){}
	Sawon(String name,String job,String hiredate,int eno,int manager,int salary,int commission,int dno){
		this.name=name;
		this.job=job;
		this.hiredate=hiredate;
		this.eno=eno;
		this.manager=manager;
		this.salary=salary;
		this.commission=commission;
		this.dno=dno;
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		List<Sawon> list = new ArrayList<Sawon>();
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "hr";
		String myPW = "1234";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL, myID, myPW);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				int eno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager=rs.getInt("manager");
				String hiredate=rs.getString("hiredate"); // 형식을 그대로 유지하고 싶으면 local date 타입?
				int salary = rs.getInt("salary");
				int commission = rs.getInt("commission");
				int dno = rs.getInt("dno");
				Sawon s = new Sawon("ename","job","hiredate",eno,manager,salary,commission,dno);
			}
		} catch (Exception e) {e.printStackTrace();};
		
		try {
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {};
	}
}
