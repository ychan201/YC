package student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student.db.DBManager;
import student.vo.studentVO;

public class studentDAO {
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
	
	public int newStudent(int bun,String name,String addr, String email,String birth) {
		String query = "insert into student (bun,name,addr,email,birth) values(?,?,?,?,?)";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, email);
			pstmt.setString(5, birth);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	// ture를 반환하면 중복이 없음.
	public boolean checkbun(String bun) {
		boolean ck=true;
		String query ="select name from student where bun=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(bun));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ck=false;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return ck; 
	}
	
	public List<studentVO> studentList(){
		String query = "select bun,name,email,MONTHS_BETWEEN(TRUNC(SYSDATE,'YEAR'),TRUNC(birth,'YEAR'))/12+1 as age from student";
		List<studentVO> list = new ArrayList<studentVO>();
		studentVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new studentVO();
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setTemp(rs.getString("age"));
				list.add(vo);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		
		return list;
	}
	
	public List<studentVO> searchName(String name) {
		String query ="select * from student where name=?";
		List<studentVO> list = new ArrayList<studentVO>();
		studentVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new studentVO();
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setEmail(rs.getString("email"));
				vo.setBirth(rs.getString("birth"));
				list.add(vo);
			}
			}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<studentVO> searchBun(int bun) {
		String query ="select * from student where bun=?";
		List<studentVO> list = new ArrayList<studentVO>();
		studentVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new studentVO();
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setEmail(rs.getString("email"));
				vo.setBirth(rs.getString("birth"));
				list.add(vo);
			}
			}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<studentVO> searchHak(int hak) {
		String query ="select * from student where to_char(bun,'9999') like ?";
		List<studentVO> list = new ArrayList<studentVO>();
		studentVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, " "+hak+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new studentVO();
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setEmail(rs.getString("email"));
				vo.setBirth(rs.getString("birth"));
				list.add(vo);
			}
			}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public int update(String name,String addr,String email,String birth,int bun) {
		String query = "update student set name=?,addr=?,email=?,birth=? where bun=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, email);
			pstmt.setString(4, birth);
			pstmt.setInt(5, bun);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public int delete(int bun) {
		String query = "delete from student where bun=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
}
