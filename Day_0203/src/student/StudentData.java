package student;

import java.util.List;

public class StudentData {
	List<Student> list;
	
	StudentData(){}
	StudentData(List<Student> list){
		this.list=list;
		rank();
	}
	
	void print() {
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t총점\t평균\t석차");
		for(Student s : list) {
			System.out.println(s);
		}
	}
	
	void rank() {
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i).tot<list.get(j).tot) {
					list.get(i).rank++;
				}
			}
		}
	}
	
	void sort() {
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).rank>list.get(j).rank) {
					Student temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					}
			}
		}
	}
	
}
