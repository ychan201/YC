package school;

public class School {
	Student[] student;
	int cnt;
	
	School(){}
	School(Student[] stu,int cnt){
		this.cnt=cnt;
		student=stu;
	}
	
	//석차계산 메소드 구현
	void rank(){
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<cnt;j++) {
				if(student[i].tot<student[j].tot) student[i].rank++;
			}
		}
	}
	//번호 오름차순 정렬 메소드 구현
	void sort() {
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(student[i].bun>student[j].bun) {
					Student temp = student[i];
					student[i]=student[j];
					student[j]=temp;
				}
			}
		}
	}
	// 출력 메소드 구현
	void print() {
		this.rank();
		this.sort();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<cnt;i++) {
			System.out.print(student[i].bun+"\t"+student[i].name+"\t"+student[i].kor+"\t"+student[i].eng+"\t");
			System.out.println(student[i].mat+"\t"+student[i].tot+"\t"+student[i].avg+"\t"+student[i].rank);
		}
			}
}
