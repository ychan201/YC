package jslhrd2;

public class HakData extends Hak implements Account {
	
	HakData(){}
	
	HakData(int bun,String name,int score){
		super.bun = bun;
		super.name = name;
		super.score=score;
	}
	
	HakData(int bun,String name,int score[]){
		super.bun=bun;
		super.name=name;
		super.jum=score;
	}
	
	
	void print() {
		if(super.score>0) {
			super.bun = bun;
			super.name = name;
			super.score=score;
			System.out.println("번호\t이름\t점수\t합계\t평균");
			System.out.println(bun+"\t"+name+"\t"+score+"\t"+score+"\t"+score);
		}
		else if(super.jum[0]>0) {
			int sum=0;
			double avg;
			super.bun = bun;
			super.name = name;
			for(int i=0;i<super.jum.length;i++) {
				sum+=super.jum[i];
			}
			avg = (double)sum/super.jum.length;
			System.out.println("번호\t이름\t점수\t\t\t\t\t합계\t평균");
			System.out.print(bun+"\t"+name+"\t");
			for(int i=0;i<super.jum.length;i++) {
				System.out.print(super.jum[i]+"\t");
			}
			System.out.println(sum+"\t"+((int)(avg*100))/100.);
		}
	}
	
	@Override
	public void total(int[] score) {
		
	}
	

	@Override
	public void score(int score) {
		// TODO Auto-generated method stub
	}

}
