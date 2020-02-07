package Sawon1;

public class SawonData {
	Sawon[] a;
	int cnt;
	private static String temp;
	
	SawonData(){}
	
	SawonData(Sawon[] a,int cnt){
		this.a=a;
		this.cnt=cnt;
	}
	
	
	
	void print() {
		int sum=0,totsum=0;
		System.out.println("부서명\t사번\t이름\t급여");
		for(int i=0;i<cnt;i++) {
			if(!(i==0))
				if(!(a[i].getBuseo().equals(""))) System.out.println("합계:\t\t\t"+sum);
			System.out.print(a[i].getBuseo()+"\t"+a[i].getSabun()+"\t");
			System.out.println(a[i].getName()+"\t"+a[i].getPay());
			totsum+=a[i].getPay();
			if(i==0)a[i].setBuseo("");
			if(a[i].getBuseo().equals("")) {
				sum+=a[i].getPay();
			}
			else {
				sum=0;
			}
			
		}
		System.out.println("합계:\t\t\t"+totsum);
	}
}
