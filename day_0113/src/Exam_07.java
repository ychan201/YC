/* Ű���� �Է�
 * ��ȣ, �̸� ,������ �Է�
 * �Է� :  1 ȫ�浿 90
 * ���
 * ��ȣ	 �̸�		 ����	 	�׷���(10���� '*')
 *  1	 ȫ�浿	 90 	*********
 */

class Hak2 {
	int bun;
	String name;
	int score;
	Hak2(){}
	
	Hak2(int a, String b, int c) {
		bun = a;
		name = b;
		score = c;
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		Hak2 hk = new Hak2(1, "CKK", 84);
		int bun = 1;
		String na = "ȫ�浿";
		int score = 90;
		Hak2 h1 = new Hak2();
		h1.bun = bun;
		h1.name = na;
		h1.score = score;
		System.out.println("��ȣ\t�̸�\t����\t�׷���");
		System.out.print(h1.bun+"\t"+h1.name+"\t"+h1.score+"\t");
		for(int i=0;i<h1.score;i++) {
			if(i%10==0) System.out.print('*');
		}
		System.out.println();
		System.out.println("��ȣ\t�̸�\t����\t�׷���");
		System.out.print(hk.bun+"\t"+hk.name+"\t"+hk.score+"\t");
		for(int i=0;i<hk.score;i++) {
			if(i%10==0) System.out.print('*');
		}
		

	}
}
