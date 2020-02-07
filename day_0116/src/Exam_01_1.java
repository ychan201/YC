import java.util.Scanner;

class Student1{
	int bun,kor,eng,mat,tot,avg,suk=1;
	String name;
	
}

class Student1Data{
	Student1[] st;
	int cnt;
	Student1Data(){}
	Student1Data(Student1[] a,int cnt){
		for(int i=0;i<cnt;i++) {
			a[i].tot=a[i].kor+a[i].eng+a[i].mat; //총점
			a[i].avg=a[i].tot; // 평균
			}
			st=a;
			this.cnt=cnt;
	}
	void studentRank(){
			for(int i=0;i<cnt;i++) { // 석차
				for(int j=0;j<cnt;j++) {
					if(st[i].tot<st[j].tot) {
						st[i].suk++;
					}
				}
			}
	}
	void sort(){
			for(int i=0;i<cnt-1;i++) { // 석차를 오름차순 정렬
				for(int j=i+1;j<cnt;j++) {
					if(st[i].suk>st[j].suk) {
						Student1 temp = st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}
			}
	}
		void print() {
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");

			for(int i=0;i<cnt;i++) {
				System.out.print(st[i].bun+"\t");
				System.out.print(st[i].name+"\t");
				System.out.print(st[i].kor+"\t");
				System.out.print(st[i].eng+"\t");
				System.out.print(st[i].mat+"\t");
				System.out.print(st[i].tot+"\t");
				System.out.print((int)(st[i].tot/3.*100+0.5)/100.+"\t");
				System.out.println(st[i].suk);
			}
		
	}
}


public class Exam_01_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int cnt=0;
		Student1[] std = new Student1[10];
		for(int i=0; i<10;i++){
			Student1 st = new Student1();
			System.out.print("입력 :");
			st.bun=sc.nextInt();
			if(st.bun==-99) break;
			st.name=sc.next();
			st.kor=sc.nextInt();
			st.eng=sc.nextInt();
			st.mat=sc.nextInt();
			std[i]=st;
			cnt++;
		}
		Student1Data sss = new Student1Data(std,cnt);
		sss.print();
		sss.studentRank();
		sss.sort();
		sss.print();
	}
}
