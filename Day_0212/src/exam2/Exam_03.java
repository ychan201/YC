package exam2;

import model.DDLDao;

public class Exam_03 {
	public static void main(String[] args) {
		int dno=10;
		DDLDao dao= new DDLDao();
		int row=dao.deleteAAA(dno);
		if(row==0) {
			System.out.println("실패");
		}else System.out.println("성공");
	}
}
