/* 멤버변수(인스턴스 변수) 초기화
 * 1. 명시적 초기화
 * 2. 생성자를 이용한 초기화
 */

class AA{
	int x=0; // 명시적 초기화
	int y;
	
	AA(){}
	
	/*static { // 정적 초기화 블럭 - 최우선으로 수행.
		x=10;
		y=20;
	}*/
	
	
	{ // 인스턴스 초기화 블럭 - 명시적 초기화와 차이가 없음 - 정적 초기화 블럭 후 우선 수행.
		x=10;
		y=20;
	}
	
	
	AA(int a){ // 생성자를 이용한 초기화.
		y=a;
	}
	
	void data() {
		int x=0;
	}
	
}

public class Exam_03 {
	public static void main(String[] args) {
		AA a = new AA();
	}
}
