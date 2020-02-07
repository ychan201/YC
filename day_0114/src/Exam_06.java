/* 생성자
 * 1. 생성자 오버로딩
 * 2. 생성자 호출 : this(), this
 */

class EE{
	int x;
	int y;
	
	EE(){
		this(100);
		System.out.println("디폴트 생성자 호출");
	}
	
	EE(int x){
		this(100,200);
		this.x=x;
		System.out.println("매개변수 1개 생성자 호출");
	}
	
	EE(int x,int y){
		this.x = x;
		this.y = y;
		System.out.println("매개변수 2개 생성자 호출");
	}
	
}

public class Exam_06 {
	public static void main(String[] args) {
		EE e = new EE();
		System.out.println("x="+e.x);
		System.out.println("y="+e.y);
	}
}
