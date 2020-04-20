package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class SawonDAO {
	DBManager manager = DBManager.getinstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 커넥션 종료
	
	void exit() {
		try {
			if(rs != null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
		}catch (Exception e) {}
	}
	
	public void DList() {
		String Query = "select dno,dname from department order by dno";
		String list="";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list+=rs.getInt("dno")+":"+rs.getString("dname")+", ";
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		System.out.println("부서정보(");
		System.out.println(list.substring(0,list.length()-2)+")");
	}
	
	public List<EmployeeVO> SawonList(){ 
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		String Query = "select e.*,dname from employee e,department d where e.dno=d.dno";
		EmployeeVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmployeeVO();
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setManager(rs.getInt("manager"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				emp.setDno(rs.getInt("dno"));
				emp.setDname(rs.getString("dname"));
				list.add(emp);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public int NewSawon(String name,String job,int manager,String hiredate,int salary,int commission,int dno){ 
		String Query = "insert into employee VALUES(EMPLOYEE_SEQ_ENUM.nextval,?,?,?,?,?,?,?)";
		int row =0;
		try {
			conn = this.manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name);
			if(job.isEmpty()) {
				pstmt.setString(2,"");
			}else pstmt.setString(2, job);
			
			if(manager==0) {
				pstmt.setString(3,"");
			}
			else pstmt.setInt(3, manager);
			
			if(hiredate.isEmpty()) {
				pstmt.setString(4,"");
			}
			else pstmt.setString(4, hiredate);
			
			if(salary==0) {
				pstmt.setString(5,"");
			}
			else pstmt.setInt(5, salary);
			
			if(commission==0) {
				pstmt.setString(6,"");
			}
			else pstmt.setInt(3, commission);
			pstmt.setInt(7, dno);
			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return row;
	}
	
	
	public List<EmployeeVO> searchName(String name) {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		String Query = "select e.name"
				+ "from employee e, department d,employee ee "
				+ "where ee.eno=e.manager and e.ename=?";
		EmployeeVO emp = null;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmployeeVO();
				emp.setEname(rs.getString("ename"));
				list.add(emp);
				
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
}
