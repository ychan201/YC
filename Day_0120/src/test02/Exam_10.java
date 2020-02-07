package test02;

/* 추상 클래스 - 미완성 설계도
 * abstract 키워드 사용
 */



abstract class AA{ // 추상 메소드가 하나라도 존재하면, 그 클래스는 추상클래스가 되어야 한다.
	int x=100;
	void test() {
		System.out.println("x = "+x);
		
	}
	abstract int sum(int x, int y); // 메소드는 맞는데 몸통이없음 - 추상 메소드 - 공통된 기능을 할당
}

class BB extends AA{
	
	@Override
	int sum(int x, int y) {
		int su = x+y;
		return su;
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		AA a = new BB();
		System.out.println(a.sum(33, 85));
		
	}
}
