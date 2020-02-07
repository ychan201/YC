package test02;

/* 인터페이스(interface) - 명세서
 * 상수, 추상메소드만 있음. (일반적인 메소드가 존재하지 않음.)
 * 개발코드와 객체 사이에 존재
 * 개발 코드 (인터페이스) 객체
 */

interface Car{
	static final int MAX=100;
	void test(); // 몸체가 없는 추상메소드			- 인터페이스는 자체로 추상클래스이기 때문에
	int sum(int x,int b); // 몸체가 없는 추상메소드- abstract를 선언하지 않아도 된다.
}
// 인터페이스 구현
// 인터페이스는 다중상속이 가능하다.

class Truck implements Car{
	@Override
	public int sum(int x, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_12 {
	public static void main(String[] args) {
		
	}
}
