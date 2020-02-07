package Sawon;

public class SawonPay {
	Sawon[] sa;
	int cnt;
	
	SawonPay(Sawon[] a,int cnt){
		this.cnt=cnt;
		sa=a;
	}
	
	void payList() {
		for(int i=0;i<cnt;i++) {
			if(sa[i].level==1) {
				if(sa[i].time>50) sa[i].time=50;
				if(sa[i].time<=36)
					sa[i].pay=sa[i].time*10000;
				else sa[i].pay=(sa[i].time-36)*(15000)+360000;
				
			}
			else if(sa[i].level==2) {
				if(sa[i].time>50) sa[i].time=50;
				if(sa[i].time<=36)
					sa[i].pay=sa[i].time*5000;
				else sa[i].pay=(sa[i].time-36)*(7500)+180000;
			}
			else if(sa[i].level==3) {
				if(sa[i].time>50) sa[i].time=50;
				if(sa[i].time<=36)
					sa[i].pay=sa[i].time*2000;
				else sa[i].pay=(sa[i].time-36)*(3000)+72000;
			}

		}
	}
	
	void maxPay() {
		int max=sa[0].pay,sawon=0;
		
		System.out.println("*주간급여를 가장 많이 받는 사원");
		for(int i=0;i<cnt;i++) {
			if(sa[i].pay>max) {
				max=sa[i].pay;
				sawon=i;
			}
		}
		System.out.println(sa[sawon].id+"\t"+sa[sawon].level+"\t"+sa[sawon].timePay+"\t"+sa[sawon].time+"\t"+sa[sawon].pay);

	}
	
	void printPayList(){
		int tsum=0,psum=0,avg;
		for(int i=0;i<cnt;i++) {
			tsum += sa[i].time;
			psum += sa[i].pay;
		}
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		for(int i=0;i<cnt;i++) {
			System.out.println(sa[i].id+"\t"+sa[i].level+"\t"+sa[i].timePay+"\t"+sa[i].time+"\t");
			if(sa[i].pay>1000) {
				System.out.print(sa[i].pay/1000+",000");
			}
			else System.out.println(sa[i].pay);
		}
		System.out.println("*합계\t\t\t"+tsum+"\t"+psum);
		System.out.println("평균 급여:"+psum/cnt);
	}
}
