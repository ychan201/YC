package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import db.DBManager;

public class DataDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//커넥션 시작
	void start(String query) throws Exception{
		conn = manager.getConnection();
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		
		
	}
	//커넥션 종료
	void exit() {
		try {
			if(rs != null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
		}catch (Exception e) {}
	}
	
	// EmpVO에 값 넘겨주기
	EmpVO data(String query) throws Exception{
		EmpVO a = new EmpVO();
		StringTokenizer s = new StringTokenizer(query," ,");
		int cnt=0;String st[]=new String[s.countTokens()];
		while(s.hasMoreTokens()) {
			st[cnt]=s.nextToken();
			cnt++;
		}
		for(int i=0;i<st.length;i++) {
			if(st[i].equals("eno")) a.setEno(rs.getInt("eno"));
			else if(st[i].equals("ename"))a.setEname(rs.getString("ename"));
			else if(st[i].equals("job")) a.setJob(rs.getString("job"));
			else if(st[i].equals("manager")) a.setManager(rs.getInt("manager"));
			else if(st[i].equals("hiredate")) a.setHiredate(rs.getString("hiredate"));
			else if(st[i].equals("salary")) a.setSalary(rs.getInt("salary"));
			else if(st[i].equals("commission")) a.setCommission(rs.getInt("commission"));
			else if(st[i].equals("dno")) a.setDno(rs.getInt("dno"));
			else if(st[i].equals("temp")) a.setTemp(rs.getInt("temp"));
		}
		return a;
	}
	
	//메소드 정의
	public List<EmpVO> exam_01(){
		String query="select ename,salary,salary+300 as temp from employee";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
				
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_02(){
		String query="select ename,salary,salary*12+100 as temp from employee order by temp desc";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_03(){
		String query="select ename,salary from employee where salary>2000 order by salary desc";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public EmpVO exam_04(){
		String query="select ename,dno from employee where eno=7788";
		EmpVO vo=null;
		try {
			start(query);
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setDno(rs.getInt("dno"));				
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return vo;
	}
	
	public List<EmpVO> exam_05(){
		String query="select ename,salary from employee where salary not between 2000 and 3000";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);	
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_06(){
		String query="select ename,job,hiredate from employee where hiredate between '1981/02/20' and '1981/05/01'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	public List<EmpVO> exam_07(){
		String query="select ename,dno from employee where dno in(20,30) order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_08(){
		String query="select ename,salary,dno from employee where salary between 2000 and 3000 and dno in(20,30) order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_09(){
		String query="select ename,hiredate from employee where hiredate like '81/__/__'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_10(){
		String query="select ename,job from employee where manager is null";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_11(){
		String query="select ename,salary,commission from employee where commission>0 order by salary,commission";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_12(){
		String query="select ename from employee where ename like '__R%'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_13(){
		String query="select ename from employee where ename like '%A%' and ename like '%E%'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_14(){
		String query="select ename,job,salary from employee where job in('CLERK','SALESMAN') and salary not in(1600,950,1300)";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
	
	public List<EmpVO> exam_15(){
		String query="select ename,salary,commission from employee where commission>=500";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			start(query);
			EmpVO vo=null;
			while(rs.next()) {
				vo = data(query);
				list.add(vo);
			}
		}catch (Exception e) {e.printStackTrace();}
		finally {exit();}
		return list;
	}
}
