package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBManager;

public class DDLDao {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//. 테이블 생성 메소드 정의
	public int tabCreate() {
		StringBuffer query = new StringBuffer();
		query.append("create table aaa(");
		query.append("dno number(2),");
		query.append("dname varchar2(8) not null,");
		query.append("regdate date,");
		query.append("score number(3),");
		query.append("primary key(dno))");
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
//			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
			pstmt.close();
			conn.close();
			}catch(Exception ee) {}
		}
		
		return row;
	}
	
	// 등록 메소드 정의
	//INSERT INTO AAA(DNO,DNAME,REGDATE,SCORE)
//	 * 		VALUES(10,'AAA',20200212,90)
//	public int insertAAA(int dno,String dname,String date,int score) {
//		StringBuffer query = new StringBuffer();
//		query.append("insert into aaa(");
//		query.append("dno,dname,regdate,score) ");
//		query.append("values("+dno+","+dname);
//		query.append(","+date+","+score+")");
//		int row=0;
//		try {
//			conn = manager.getConnection();
//			pstmt = conn.prepareStatement(query.toString());
//			row = pstmt.executeUpdate();
//		}catch(Exception e) {e.printStackTrace();}
//		finally {
//			try {
//			pstmt.close();
//			conn.close();
//			}catch(Exception ee) {}
//		}
//		
//		return row;
//	}
	
	public int insertAAA(int dno, String dname, String date, int score) {
		String query = "insert into aaa values(?,?,?,?)";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, date);
			pstmt.setInt(4, score);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();

			} catch (Exception e2) {
			}
		}
		return row;
	}
	
	public int insertAAAA(int dno,String dname,String date,int score) {
		String query="insert into aaa values(?,?,?,?)";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,dno);
			pstmt.setString(2,dname);
			pstmt.setString(3,date);
			pstmt.setInt(4, score);
			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
			pstmt.close();
			conn.close();
			}catch(Exception ee) {}
		}
		
		return row;
	}
	
	public int updateAAA(int dno,String dname,int score) {
		String query="update aaa set dname=?,score=? where dno=?";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,dname);
			pstmt.setInt(2, score);
			pstmt.setInt(3,dno);
			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
			pstmt.close();
			conn.close();
			}catch(Exception ee) {}
		}
		
		return row;
	}
	
	public int deleteAAA(int dno) {
		String query="delete from aaa where dno=?";
		int row=0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,dno);
			row = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
			pstmt.close();
			conn.close();
			}catch(Exception ee) {}
		}
		
		return row;
	}
	
}
