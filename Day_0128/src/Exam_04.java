import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 파일(input.txt)로 학생정보를 입력 받아서
 * 총점 평균을 구하여 출력
 */

class Hak{
	Hak(){}
	Hak(int bun,String name,int kor,int eng,int mat){
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


public class Exam_04 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scF = new Scanner(new File("c:\\Data\\input.txt"));
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(scF.hasNext()) {
			String s[] = scF.next().split(",");
			Hak h = new Hak(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]),Integer.parseInt(s[4]));
		}
	}
}
