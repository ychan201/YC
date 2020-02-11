package oracle.exam2;

import java.util.List;

import oracle.dao.SawonDAO;
import oracle.dto.DeptDTO;

public class Exam_01 {
	public static void main(String[] args) {
		SawonDAO sd = new SawonDAO();
		List<DeptDTO> list = sd.deptList();
		if(list.size()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getDno()+"\t");
				System.out.print(list.get(i).getDname()+"\t");
				System.out.println(list.get(i).getLoc());
			}
		}
	}
}
