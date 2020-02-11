package oracle.exam;

import oracle.db.OracleConn;
import java.sql.*;

public class oracleSQL extends OracleConn {
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//전체 검색
	public void deptListPrint() throws Exception{
		String query ="select * from department";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(dno+"\t"+dname+"\t"+loc);
		}
	}
	//부서번호 검색
	public void deptSearchdno(int num) throws Exception{
		String query ="select * from department where dno=?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(dno+"\t"+dname+"\t"+loc);
		}
	}
	
	public void deptSearchDname(String name) throws Exception{
		String query ="select * from department where dname=?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setString(1, name);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(dno+"\t"+dname+"\t"+loc);
		}
	}
	
	//이름 검색
	public void nameSearch(String name)throws Exception{
		String query="select eno, ename ,job, hiredate from employee where ename like ?"; 
		pstmt = myConn.prepareStatement(query);
		pstmt.setString(1, "%"+name+"%");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String hiredate = rs.getString("hiredate");
			System.out.println(eno+"\t"+ename+"\t"+job+"\t"+hiredate.substring(0,10));
		}
	}
	
	public void employeeInfo(int num) throws Exception {
		String query = "select * from employee where dno=?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int manager = rs.getInt("manager");
			String hiredate = rs.getString("hiredate");
			int salary = rs.getInt("salary");
			int commission = rs.getInt("commission");
			int dno = rs.getInt("dno");
			System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+hiredate+"\t"+salary+"\t"+commission+"\t"+dno);
		}
	}
	
	public void emplHireDateSearch(String date) throws Exception {
		String query = "select * from employee where hiredate>=?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setString(1, date);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int manager = rs.getInt("manager");
			String hiredate = rs.getString("hiredate");
			int salary = rs.getInt("salary");
			int commission = rs.getInt("commission");
			int dno = rs.getInt("dno");
			System.out.println(eno+"\t"+ename+"\t"+job+"\t"+manager+"\t"+hiredate+"\t"+salary+"\t"+commission+"\t"+dno);
		}
	}
	@Override
	public void cleanUp() throws Exception {
		if (rs!= null) rs.close();
		if (stmt != null) stmt.close();
		if (pstmt != null) pstmt.close();
	}

}
