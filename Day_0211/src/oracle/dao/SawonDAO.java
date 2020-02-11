package oracle.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import oracle.db.DBManager;
import oracle.dto.DeptDTO;
public class SawonDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 부서 정보 테이블 전체 검색 메소드 정의
	public List<DeptDTO> deptList(){
		String query = "select * from department";
		//리턴타입 정의
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		}catch(Exception e) {}
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception ee) {}
		}
		return list;
	}
}
