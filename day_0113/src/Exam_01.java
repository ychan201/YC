/* �л� Ŭ���� ����
 *  static < main���� �����̱⶧����(?)
 */

class Student{ // class - ����� ���� ����. ���� ���ϴ� �͵鸸 ��� ���� ������ �ڷ���
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	void totAccount() { // ���� ���
		tot = kor + eng + mat;
	}
	
	void avgAccount() { // ��� ���
		avg = tot/3.;
	}
	
	void dataPrint() {
		System.out.println("--------------����ǥ--------------");
		System.out.print("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println();
		System.out.print(hakbun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.println();
	}
	
}
// Ŭ���� ���� ���� ( ���赵 �ۼ� �Ϸ� )

public class Exam_01 {
	public static void main(String[] args) { //���� ���� ���� ( ���� )
		Student st; // ���۷���(�ν��Ͻ�) ����
		st= new Student(); // �ν��Ͻ� ���� - �ؾ Ʋ���ٰ� ��Ḧ �ְ� �ؾ�� ������ ����
		Student s =new Student();
		st.name="ȫ���";
		st.hakbun=1;
		st.kor=84;
		st.eng=76;
		st.mat=89;
		st.totAccount();
		st.avgAccount();
		st.dataPrint();
		s.dataPrint();
	}
}
