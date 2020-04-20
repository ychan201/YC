package joinexam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import joinexam.db.DBManager;
import joinexam.vo.JoinVO;

public class JoinDAO {
	DBManager manager = DBManager.getinstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	void exit() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) pstmt.close();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public List<JoinVO> joinList(){
		String query = "select userid,name,email,regdate from join order by regdate desc ";
		List<JoinVO> list = new ArrayList<JoinVO>();
		JoinVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setRegdate(rs.getString("regdate"));
				list.add(vo);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		
		return list;
	}
	
	public int newJoin(String userid,String name,String passwd, String email,int age) {
		String query = "insert into join (userid,name,passwd,email,age) values(?,?,?,?,?)";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid );
			pstmt.setString(2, name );
			pstmt.setString(3, passwd );
			pstmt.setString(4, email );
			pstmt.setInt(5, age);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public boolean checkid(String userid) {
		boolean ck=true;
		String query ="select userid from join where userid=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			String check = rs.getString(1);
			if(check==null) {
				ck=true;
				System.out.println(ck);
			}else ck=false;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return ck; 
	}
	
	public boolean checkname(String name) {
		boolean ck=true;
		String query ="select name from join where name=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
			String check = rs.getString(1);
			if(check==null) ck=true;
			else ck=false;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		
		return ck;
		}
	public JoinVO searchID(String userid) {
		String query ="select * from join where userid=?";
		JoinVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setPasswd(rs.getString("passwd"));
			}
			}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return vo;
	}
	
	public JoinVO searchName(String name) {
		String query ="select * from join where name=?";
		JoinVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setPasswd(rs.getString("passwd"));
			}
			}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return vo;
	}
	
	public int update(String name,String passwd,String email,String age,String userid) {
		String query = "update join set name=?,passwd=?,email=?,age=? where userid=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, email);
			pstmt.setInt(4, Integer.parseInt(age));
			pstmt.setString(5, userid);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public int delete(String userid) {
		String query = "delete from join where userid=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			check=pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
}	

