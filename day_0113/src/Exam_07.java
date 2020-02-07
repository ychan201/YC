/* 키보드 입력
 * 번호, 이름 ,점수를 입력
 * 입력 :  1 홍길동 90
 * 출력
 * 번호	 이름		 점수	 	그래프(10점당 '*')
 *  1	 홍길동	 90 	*********
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
		String na = "홍길동";
		int score = 90;
		Hak2 h1 = new Hak2();
		h1.bun = bun;
		h1.name = na;
		h1.score = score;
		System.out.println("번호\t이름\t점수\t그래프");
		System.out.print(h1.bun+"\t"+h1.name+"\t"+h1.score+"\t");
		for(int i=0;i<h1.score;i++) {
			if(i%10==0) System.out.print('*');
		}
		System.out.println();
		System.out.println("번호\t이름\t점수\t그래프");
		System.out.print(hk.bun+"\t"+hk.name+"\t"+hk.score+"\t");
		for(int i=0;i<hk.score;i++) {
			if(i%10==0) System.out.print('*');
		}
		

	}
}
