package sawon;

import java.text.DecimalFormat;

public class Sawon {
	
	int sabun;
	String name;
	int money;
	
	Sawon(){}
	Sawon(String a[]){
		sabun=Integer.parseInt(a[0]);
		name=a[1];
		money=Integer.parseInt(a[2]);
	}
	void print(){
		System.out.println(sabun+"\t"+name+"\t"+money);
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("#,###,###");
		String m=df.format(money);
		return sabun+"\t"+name+"\t"+m;
	}

}
