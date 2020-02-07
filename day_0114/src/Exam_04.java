/*변수의 종류
 * 1. 정적변수(static) - 클래스변수
 * 2. 멤버(인스턴스)
 * 3. 지역변수(매개변수)
 */
class BB{
	int a=10; // 인스턴스 변수
	static int b=20; // 클래스 변수
	
	void print() {
		System.out.print("a ="+a+"\tb ="+b+"\n");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		BB b1 = new BB();
		BB b2 = new BB();
		b1.print();
		b1.b=55;
		b2.print();
	}
}
