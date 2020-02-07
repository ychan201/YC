package student;

public class StudentData {
	Student[] std;
	int jungdap[]=new int[20];
	int jungper[]=new int[20];
	int cnt;
	
	
	StudentData(){}
	StudentData(String[] jungdap,Student[] s,int cnt){
		std=s;
		for(int i=0;i<jungdap.length;i++) {
			this.jungdap[i]=Integer.parseInt(jungdap[i]);
		}
		this.cnt=cnt;
		cal();
		print();
		
		sort();
		
		print();
	}
	
	void print() {
		System.out.print("번호\t이름\t");
		for(int i=0;i<20;i++) {
			System.out.print((i+1)+"\t");
		}
		System.out.println("점수");
		for(int i=0;i<cnt;i++) {
			System.out.print(std[i].bun+"\t"+std[i].name+"\t");
			for(int j=0;j<std[i].ox.length;j++) {
				System.out.print(std[i].ox[j]+"\t");
			}
			System.out.println(std[i].jumsu);
		}
		System.out.print("정답 비율\t\t");
		for(int i=0;i<20;i++) {
			System.out.print(jungper[i]+"%\t");
		}
	}
	
	void sort() {
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(std[i].bun>std[j].bun) {
					Student temp=std[i];
					std[i]=std[j];
					std[j]=temp;
				}
			}
		}
	}
	
	void cal() {
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<std[i].ox.length;j++) {
				if(std[i].dap[j]==jungdap[j]) {
					std[i].ox[j]="o";
					std[i].jumsu+=5;
				}
				else std[i].ox[j]="x";
			}
		}
		for(int i=0;i<cnt;i++) {
			for(int j=0;j<20;j++) {
				if(std[i].ox[j]=="o") jungper[j]++;
			}
		}
		for(int i=0;i<20;i++) {
			jungper[i]=(int)((jungper[i]/(double)cnt)*100);
		}
	}
}
