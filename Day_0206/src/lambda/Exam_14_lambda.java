package lambda;
/*	함수적 인터페이스
 *  @FunctionalInterface
 */
@FunctionalInterface // 함수적 인터페이스로 인식시켜줌.
interface AAA{ // 인터페이스는 맞는데, 그 인터페이스 안에 있는 메소드가 단 하나만 존재할 경우 , 함수적 인터페이스라고 한다.
	void method();
}

class BB implements AAA{
	@Override
	public void method() {
		System.out.println("^오^");
	}
}


public class Exam_14_lambda {
	public static void main(String[] args) {
		BB b = new BB();
		b.method();
		
		AAA aa;
		aa=()->{System.out.println("AAAAA");}; // lambda 식 이라고 함.
		aa.method();
		aa=()->System.out.println("BBBBB");
		aa.method();
		}
}
