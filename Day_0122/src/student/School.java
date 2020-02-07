package student;

public class School {
	Student[] std;
	int cnt;
	
	School(){}
	
	School(Student[] st,int cnt){
		std=st;
		this.cnt=cnt;
	}
	
	void sort() {
		this.totavgsuk();
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(std[i].bun>std[j].bun) {
					Student temp = std[i];
					std[i]=std[j];
					std[j]=temp;
				}
			}
		}
	}
	
	void totavgsuk(){
		for(int i=0;i<cnt;i++) {
			std[i].tot = std[i].kor+std[i].eng+std[i].mat;
			std[i].avg = (int)((std[i].tot/3.)*100)/100.;
		}
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<cnt;j++) {
				if(std[i].tot<std[j].tot) std[i].suk++;
			}
		}
	}
	
	void print() {
		this.sort();
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i=0;i<cnt;i++) {
			System.out.print(std[i].bun+"\t"+std[i].name+"\t"+std[i].kor+"\t"+std[i].eng+"\t");
			System.out.println(std[i].mat+"\t"+std[i].tot+"\t"+std[i].avg+"\t"+std[i].suk+"\t");
		}
	}
	
}