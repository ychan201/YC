package exam2;

import model.DDLDao;

/* DDL(데이터 정의어): CREATE, ALTER, DROP
 * DML(데이타 조작어): CURD(INSERT, SELECT, UPDATE, DELETE)
 * DCL(데이타 제어어): GRANT, REVOKE
 * TCL(트랜젝션제어): COMMIT, ROLLBACK, SAVEPOINT
 * 
 * INSERT INTO AAA(DNO,DNAME,REGDATE,SCORE)
 * 		VALUES(10,'AAA',20200212,90)
 * 
 * INSERT INTO AAA VALUES(12,'AAA',20200212,90) 순서가 동일하면 생략가능
 * 
 * INSERT INTO AAA(DNO,SCORE)
 * 		VALUES(11,90)
 * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		DDLDao dao = new DDLDao();
//		dao.tabCreate();
		int dno =20;
		String dname="aq";
		String date="20200212";
		int score=50;
		
		int row = dao.insertAAA(dno, dname, date, score);
		if(row==0) System.out.println("등록실패 ㅎㅎ");
		else System.out.println("등록 성공");
	}
}
