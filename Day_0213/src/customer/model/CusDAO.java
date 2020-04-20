package customer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import customer.db.DBManager;

public class CusDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//커넥션 시작
	void start(String query) throws Exception{
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
	}
	//커넥션 종료
	void exit() {
		try {
			if(rs != null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
		}catch (Exception e) {}
	}
	
	public List<CusVO> CList() {
		String Query = "select * from custom";
		List<CusVO> list = new ArrayList<CusVO>();
		CusVO cv=null;
		try {
			start(Query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cv=new CusVO();
				cv.setNum(rs.getInt("num"));
				cv.setName(rs.getString("name"));
				cv.setTel(rs.getString("tel"));
				cv.setAddr(rs.getString("addr"));
				cv.setOffice(rs.getString("office"));
				cv.setBirthday(rs.getString("birthday"));
				cv.setSex(rs.getString("sex"));
				cv.setIndate(rs.getString("indate"));
				list.add(cv);
			}
		}catch(Exception e) {}
		finally {exit();}
		return list;
	}
	
	public int NewCustomer(int num,String name,String tel,String addr, String office,String birthday,String sex) {
		String Query = "insert into custom(sequnce1.,name,tel,addr,office,birthday,sex)"
				+ " values(?,?,?,?,?,?,?)";
		int check=0;
		try {
			start(Query);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, addr);
			pstmt.setString(5, office);
			pstmt.setString(6, birthday);
			pstmt.setString(7, sex);
			check=pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public CusVO SearchCustomer(String name) {
		String Query = "select * from custom where name=?";
		CusVO cv=null;
		try {
			start(Query);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			while(rs.next()) {
			cv=new CusVO();
			cv.setNum(rs.getInt("num"));
			cv.setName(rs.getString("name"));
			cv.setTel(rs.getString("tel"));
			cv.setAddr(rs.getString("addr"));
			cv.setBirthday(rs.getString("birthday"));
			cv.setOffice(rs.getString("office"));
			cv.setSex(rs.getString("sex"));
			cv.setIndate(rs.getString("indate"));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return cv;
	}
	
	public int UpdateCustomer(int num,String tel,String office) {
		String Query = "update custom set tel=?,office=? where num=?";
		int check=0;
		try {
			start(Query);
			pstmt.setInt(3, num);
			pstmt.setString(1, tel);
			pstmt.setString(2, office);
			check=pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return check;
	}
	
	public CusVO SearchCustomer(int num) {
		String Query = "select * from custom where num=?";
		CusVO cv=null;
		try {
			start(Query);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
			cv=new CusVO();
			cv.setNum(rs.getInt("num"));
			cv.setName(rs.getString("name"));
			cv.setTel(rs.getString("tel"));
			cv.setAddr(rs.getString("addr"));
			cv.setBirthday(rs.getString("birthday"));
			cv.setOffice(rs.getString("office"));
			cv.setSex(rs.getString("sex"));
			cv.setIndate(rs.getString("indate"));
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {exit();}
		return cv;
	}
	
	public int DleteCustomer(int num) {
		String Query = "delete from custom where num=?";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(Query);
			pstmt.setInt(1, num);
			row = pstmt.executeUpdate();
		}catch(Exception e) {}
		finally {exit();}
		return row;
	}
	
}
