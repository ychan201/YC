class Hak{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	
	void pp(Hak[] h) {
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int i=0;i<h.length;i++) {
			System.out.print(h[i].bun+"\t");
			System.out.print(h[i].name+"\t");
			System.out.print(h[i].kor+"\t");
			System.out.print(h[i].eng+"\t");
			System.out.print(h[i].mat+"\t");
			System.out.println();
		}
	}
}



public class Exam_04_class {
	public static void main(String[] args) {
		Hak h1[] = {new Hak(),new Hak(),new Hak(),new Hak()}; // 클래스 배열
		h1[0].bun=1;
		h1[0].name="AAAA";
		h1[0].kor=90;
		h1[0].eng=89;
		h1[0].mat=79;
		
		h1[1].bun=2;
		h1[1].name="BBBB";
		h1[1].kor=55;
		h1[1].eng=66;
		h1[1].mat=77;
		
		h1[2].bun=3;
		h1[2].name="CCCC";
		h1[2].kor=56;
		h1[2].eng=78;
		h1[2].mat=89;
		
		h1[3].bun=4;
		h1[3].name="DDDD";
		h1[3].kor=78;
		h1[3].eng=78;
		h1[3].mat=68;

		int hak[][] = {{1,90,89,79},{2,55,66,77},{3,56,78,89},{4,78,78,68}};
		String na[] = {"AAAA","BBBB","CCCC","DDDD"};
		
		System.out.println("번호\t이름\t국어\t영어\t수학");
		for(int i=0;i<hak.length;i++) {
			System.out.print(hak[i][0]+"\t");
			System.out.print(na[i]+"\t");

			for(int j=1;j<hak[i].length;j++) {
				System.out.print(hak[i][j]+"\t");
			}
			System.out.println();
		}
		
		h1[1].pp(h1);
		
		
	}
}
