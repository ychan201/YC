package jslhrd3;

public class HakData extends Hak implements Account {
	//int bun;
	//String name;
	//int score;
	
	int score[];
	int tot;
	double avg;
	
	
	HakData(){}
	
	HakData(int bun,String name,int score){
		this.bun = bun;
		this.name = name;
		super.score=score;
		score(score);
	}
	
	HakData(int bun,String name,int score[]){
		this.bun=bun;
		this.name=name;
		this.score=score;
		total(score);
	}
	
	
	
	@Override
	public void total(int[] score) {
		for (int i=0; i<score.length;i++) {
			tot += score[i];
		}
		avg=(double)tot/score.length;
	}
	

	@Override
	public void score(int score) {
		tot = score;
		avg = (double)score;
	}
	
	void print() {
		System.out.print("번호\t이름\t점수");
		if(score==null) { // score 가 배열인가?
			System.out.println();
			super.print();
		}else {
			for(int i=0;i<score.length;i++) {
				System.out.print("\t");
			}
			System.out.println("합계\t평균");
			System.out.print(bun+"\t"+name+"\t");
			for(int i=0;i<score.length;i++) {
				System.out.print(score[i]+"\t");
			}
			System.out.println(tot+"\t"+avg);
		}
	}
	
}