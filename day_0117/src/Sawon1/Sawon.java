package Sawon1;

public class Sawon {
	private int sabun,pay;
	private String name,buseo;
	private static String temp;
	
	public Sawon() {}
	
	public Sawon(String buseo,int sabun,String name,int pay) {
		if(!(buseo.equals(temp))) {
			this.buseo=buseo;
			temp=buseo;
		}
		else {
			this.buseo="";
		}
		this.name=name;
		this.sabun=sabun;
		this.pay=pay;
	}
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuseo() {
		return buseo;
	}
	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
}
