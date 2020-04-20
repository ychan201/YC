package exam;


import model.DataDAO;
import model.EmpVO;

public class Exam_04 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		EmpVO evo = dao.exam_04();
		if(evo!=null) {
			//출력
			System.out.print(evo.getEname()+"\t");
			System.out.println(evo.getDno());
		}
		else System.out.println("값이없음");
	}
}
