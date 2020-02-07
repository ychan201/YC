package Sawon;

public class Sawon {
	int time,level,pay,timePay;
	String id;
	
	Sawon(){}
	
	Sawon(String id,int level,int time){
		this.time=time;
		this.id=id;
		this.level=level;
		if(level==1) timePay=10000;
		else if(level==2) timePay=5000;
		else if(level==3) timePay=2000;
	}
	
}
