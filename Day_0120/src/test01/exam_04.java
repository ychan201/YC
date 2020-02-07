package test01;

class Tv{
	String model;
	int inch;
		
	Tv(String model,int inch){
		this.model=model;
		this.inch=inch;
	}
	void printTv() {
		System.out.println("Tv 모델 : " + model);
		System.out.println("Tv 크기 : " + inch);
	}
}

final class DigitalTv extends Tv{ // final을 붙이게 되면, 더이상 상속 불가능한 상태로 만들어줌.
	DigitalTv(){
		super("삼성",16); // 조상클래스 호출
	}
}

/*
 class SmartTv extends DigitalTv{ 불가능함.

	
}*/

public class exam_04 {
	public static void main(String[] args) {
		DigitalTv tv = new DigitalTv();
	}
}
