import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/* ����(input.txt)�� �л������� �Է� �޾Ƽ�
 * ���� ����� ���Ͽ� ���
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
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
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
