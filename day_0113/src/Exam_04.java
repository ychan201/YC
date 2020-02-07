
public class Exam_04 {
	public static void main(String[] args) {
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
	}
}
