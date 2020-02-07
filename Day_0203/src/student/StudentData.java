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
		System.out.println("��ȣ\t�̸�\t����1\t����2\t����3\t����4\t����5\t����\t���\t����");
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
