import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* ����(input.txt)�� �л������� �Է� �޾Ƽ�
 * ���� ����� ���Ͽ� ���
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
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		while(scF.hasNext()) {
			String s[] = scF.next().split(",");
			Hak h = new Hak(Integer.parseInt(s[0]),s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3]),Integer.parseInt(s[4]));
		}
	}
}
