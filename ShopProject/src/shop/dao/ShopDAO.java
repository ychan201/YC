package shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import shop.db.DBManager;
import shop.vo.ShopVO;

public class ShopDAO {
	
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
	
	public int Join(String cno,String cname,String phone, String gender,String grade) {
		String query = "insert into shop (cno,cname,phone,gender,grade) values(?,?,?,?,?)";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(cno));
			pstmt.setString(2, cname );
			pstmt.setString(3, phone );
			pstmt.setString(4, gender);
			pstmt.setString(5, grade);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public List<ShopVO> ShopList(){
		String query = "select * from shop ";
		List<ShopVO> list = new ArrayList<ShopVO>();
		ShopVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new ShopVO();
				vo.setCno(rs.getInt("cno"));
				vo.setCname(rs.getString("cname"));
				vo.setPhone(rs.getString("phone"));
				vo.setGender(rs.getString("gender"));
				vo.setJoindate(rs.getString("joindate"));
				vo.setGrade(rs.getString("grade"));
				list.add(vo);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		
		return list;
	}
	
	public boolean checkCno(String cno) {
		boolean ck=true;
		String query ="select cname from shop where cno=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(cno));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ck=false;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return ck; 
	}
	
	public ShopVO search(String cno) {
		String query = "select * from shop where cno=?";
		ShopVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(cno));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new ShopVO();
				vo.setCname(rs.getString("cname"));
				vo.setPhone(rs.getString("phone"));
				vo.setGender(rs.getString("gender"));
				vo.setGrade(rs.getString("grade"));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return vo;
	}
	
	public int update(String cname,String phone,String gender,String grade,String cno) {
		String query = "update shop set cname=?,phone=?,gender=?,grade=? where cno=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cname);
			pstmt.setString(2, phone);
			pstmt.setString(3, gender);
			pstmt.setString(4, grade);
			pstmt.setInt(5, Integer.parseInt(cno));
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public int delete(String cno) {
		String query = "delete from shop where cno=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(cno));
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
}
