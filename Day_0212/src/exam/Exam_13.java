package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_13 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_13();
		if(!list.isEmpty()) {
			//출력
			for(EmpVO a : list) {
				System.out.println(a.getEname()+"\t");
			}
		}
	}
}
