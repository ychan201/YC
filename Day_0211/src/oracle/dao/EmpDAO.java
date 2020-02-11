package oracle.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import oracle.db.DBManager;
import oracle.dto.DeptDTO;
import oracle.dto.EmpDTO;
public class EmpDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 부서 정보 테이블 전체 검색 메소드 정의
	public List<EmpDTO> deptList(){
		String query = "select * from employee";
		//리턴타입 정의
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getInt("manager"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
				
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
