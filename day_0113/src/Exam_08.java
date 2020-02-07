import java.util.Scanner;

class Hak3{
	int bun;
	String name;
	int score;
	Hak3(){}
	
	Hak3(int bun, String name, int score) {
		this(); // 자기 자신의 생성자
		this.bun = bun;
		this.name = name;
		this.score = score;
		dataPrint();
	}
	void dataPrint() {
		System.out.println("번호\t이름\t점수\t그래프");
		System.out.print(bun+"\t"+name+"\t"+score+"\t");

		for(int i=1;i<score;i++) {
			if(i%10==0) System.out.print('*');
		}
		System.out.println();
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hak3 hak;
		while(true) {
			System.out.print("입력 :");
			hak = new Hak3();
			hak.bun=sc.nextInt();
			if(hak.bun==-99)break;
			hak.name = sc.next();
			hak.score=sc.nextInt();
			hak.dataPrint();
/*			System.out.println("학번\t이름\t점수");
			System.out.print(hak.name+"\t"+hak.name+"\t"+hak.score+"\t");

			for(int i=1;i<hak.score;i++) {
				if(i%10==0) System.out.print('*');
			}
			System.out.println();
		}
	*/	
	}
}
	}
