package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_01 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_01();

		
		if(!list.isEmpty()) {
			//출력
			for(EmpVO a : list) {
				System.out.print(a.getEname()+"\t");
				System.out.print(a.getSalary()+"\t");
				System.out.println(a.getTemp()+"\t");
			}
		}
	}
}
