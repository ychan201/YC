import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 파일(input.txt)로 학생정보를 입력 받아서
 * 총점 평균을 구하여 출력
 */

class Hak2{
	Hak2(){}
	Hak2(int bun,String name,int kor,int eng,int mat){
		int tot = kor+eng+mat;
		double avg = (Math.round((tot/3.)*100))/100.;
		System.out.println(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}


public class Exam_06 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scF = new Scanner(new File("c:\\Data\\input.txt"));
		StringTokenizer st = null;
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(scF.hasNext()) {
			//String s[] = scF.next().split(",");
			st = new StringTokenizer(scF.next()," ,");
			int bun = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int kor =  Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat =  Integer.parseInt(st.nextToken());
			Hak2 h = new Hak2(bun,name,kor,eng,mat);
		}
	}
}
