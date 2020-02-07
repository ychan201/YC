package test01;
//생성자의 연속 호출 
// 상속 받는 것은 멤버와 메소드만 상속된다. 생성자는 상속되지 않는다.

class FF {
	FF(){
		System.out.println("FF() 생성자 호출");
	}
}

class GG extends FF{
	
	GG(){
		System.out.println("GG() 생성자 호출");
	}
	
	GG(int a){
		System.out.println("a="+a);
	}
}

class HH extends GG{
	HH(){
		System.out.println("HH() 생성자 호출");
	}
}


public class Exam_03 {
	public static void main(String[] args) {
		FF ff = new FF();
		System.out.println();
		GG gg = new GG();
		System.out.println();
		HH hh = new HH();
	}
}
