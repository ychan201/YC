
public class Hak {
		int bun;
		String name;
		int score;
		
		Hak(){}
		
		Hak(int bun,String name,int score){ // 생성자 오버로딩
			this.bun=bun;
			this.name=name;
			this.score=score;
		}
		void print() { // 메소드 오버로딩
			System.out.println(bun+"\t"+name+"\t"+score);
		}
		void print(int sw) {
			System.out.println(sw+"\t"+bun+"\t"+name+"\t"+score);
		}
}
