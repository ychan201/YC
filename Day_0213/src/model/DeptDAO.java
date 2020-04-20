package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class DeptDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
		//커넥션 종료
		void exit() {
			try {
				if(rs != null) rs.close();
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			}catch (Exception e) {}
		}
		
		// EmpVO에 값 넘겨주기
		DeptVO data(String query) throws Exception{
			DeptVO a = new DeptVO();
			StringTokenizer s = new StringTokenizer(query," ,");
			int cnt=0;String st[]=new String[s.countTokens()];
			while(s.hasMoreTokens()) {
				st[cnt]=s.nextToken();
				cnt++;
			}
			if(st[1].equals("*")) {
				a.setDno(rs.getInt("dno"));
				a.setDname(rs.getString("dname"));
				a.setLoc(rs.getString("loc"));
			}else {
			for(int i=0;i<st.length;i++) {
				if(st[i].equals("dno")) a.setDno(rs.getInt("dno"));
				else if(st[i].equals("dname"))a.setDname(rs.getString("dname"));
				else if(st[i].equals("loc")) a.setLoc(rs.getString("loc"));
				}
			}
			return a;
		}
	
	public List<DeptVO> viewList() {
		String Query = "select * from department";
		List<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO a = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				a = data(Query);
				list.add(a);
			}
		}catch(Exception e) {}
		finally {exit();}
		return list;
	}
	
	public int insertTable(int dno,String dname,String loc) {
		String Query = "insert into department values(?,?,?) ";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			row = pstmt.executeUpdate();
		}catch(Exception e) {}
		finally {exit();}
		return row;
	}
	
	public List<DeptVO> SerchList(int dno) {
		String Query = "select * from department where dno=?";
		List<DeptVO> list = new ArrayList<DeptVO>();
		DeptVO a = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				a = data(Query);
				list.add(a);
			}
		}catch(Exception e) {}
		finally {exit();}
		return list;
	}
	
	public int updateTable(int bdno,int adno,String adname,String aloc) {
		String Query = "update department set dno=?,dname=?,loc=? where dno=?";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, adno);
			pstmt.setString(2, adname);
			pstmt.setString(3, aloc);
			pstmt.setInt(4, bdno);
			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return row;
	}
	
	public int deleteTable(int dno) {
		String Query = "delete from department where dno=?";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();
		}catch(Exception e) {}
		finally {exit();}
		return row;
	}
}
