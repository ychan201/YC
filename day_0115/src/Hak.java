
public class Hak {
		int bun;
		String name;
		int score;
		
		Hak(){}
		
		Hak(int bun,String name,int score){ // ������ �����ε�
			this.bun=bun;
			this.name=name;
			this.score=score;
		}
		void print() { // �޼ҵ� �����ε�
			System.out.println(bun+"\t"+name+"\t"+score);
		}
		void print(int sw) {
			System.out.println(sw+"\t"+bun+"\t"+name+"\t"+score);
		}
}
