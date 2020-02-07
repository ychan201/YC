/* 메소드 정의
 * 접근제어자 리턴타입 메소드명(매개변수){
 * }
 * public 공용
 * private 
 * 안붙이면 지역(그 지역) 
 * 
 */
public class Exam_01 {
	//리턴타입 x, 매개변수x
	static void print(){
		System.out.println("Method test");
	}
	static int adder(int a,int b) {
		int c;
		c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Method Call Test Start");
		print();
		System.out.println("Method Call Test End");
	}
}
