package oracle.exam2;

import java.util.List;

import oracle.dao.EmpDAO;
import oracle.dto.EmpDTO;

public class Exam_02 {
	public static void main(String[] args) {
		EmpDAO sd = new EmpDAO();
		List<EmpDTO> list = sd.deptList();
		if(list.size()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getEno()+"\t");
				System.out.print(list.get(i).getEname()+"\t");
				System.out.print(list.get(i).getJob()+"\t");
				System.out.print(list.get(i).getManager()+"\t");
				System.out.print(list.get(i).getHiredate().substring(0,10)+"\t");
				System.out.print(list.get(i).getSalary()+"\t");
				System.out.print(list.get(i).getCommission()+"\t");
				System.out.println(list.get(i).getDno()+"\t");
			}
		}
	}
}
