package reserv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import reserv.db.DBManager;
import reserv.vo.reservVO;

public class reservDAO {
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
	
	public int newReserv(String lentno,String custname,String phone, String bookno,String outdate) {
		String query = "insert into reservation (lentno,custname,phone,bookno,outdate) values(?,?,?,?,?)";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(lentno));
			pstmt.setString(2, custname );
			pstmt.setString(3, phone );
			pstmt.setInt(4, Integer.parseInt(bookno));
			pstmt.setString(5, outdate);
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public List<reservVO> reservList(){
		String query = "select * from reservation ";
		List<reservVO> list = new ArrayList<reservVO>();
		reservVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new reservVO();
				vo.setLentno(rs.getInt("lentno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setBookno(rs.getInt("bookno"));
				vo.setOutdate(rs.getString("outdate"));
				vo.setIndate(rs.getString("indate"));
				vo.setStatus(rs.getString("status"));
				list.add(vo);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		
		return list;
	}
	
	public boolean checkLentNo(String lentno) {
		boolean ck=true;
		String query ="select custname from reservation where lentno=?";
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(lentno));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ck=false;
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return ck; 
	}
	
	
	public reservVO search(String lentno) {
		String query = "select * from reservation where lentno=?";
		reservVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(lentno));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new reservVO();
				vo.setCustname(rs.getString("custName"));
				vo.setPhone(rs.getString("phone"));
				vo.setBookno(rs.getInt("bookno"));
				vo.setOutdate(rs.getString("outdate"));
				vo.setIndate(rs.getString("indate"));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return vo;
	}
	
	public int inbook(String lentno,String time) {
		String query = "update reservation set indate=?,status=? where lentno=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, time);
			pstmt.setString(2, "2");
			pstmt.setInt(3, Integer.parseInt(lentno));
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public int update(String custname,String phone,String bookno,String outdate,String indate,String lentno) {
		String query = "update reservation set custname=?,phone=?,bookno=?,outdate=?,indate=? where lentno=?";
		int check=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custname);
			pstmt.setString(2, phone);
			pstmt.setInt(3, Integer.parseInt(bookno));
			pstmt.setString(4,outdate);
			pstmt.setString(5, indate);
			pstmt.setInt(6, Integer.parseInt(lentno));
			check = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
}
