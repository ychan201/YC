package lambda;
/*	�Լ��� �������̽�
 *  @FunctionalInterface
 */
@FunctionalInterface // �Լ��� �������̽��� �νĽ�����.
interface AAA{ // �������̽��� �´µ�, �� �������̽� �ȿ� �ִ� �޼ҵ尡 �� �ϳ��� ������ ��� , �Լ��� �������̽���� �Ѵ�.
	void method();
}

class BB implements AAA{
	@Override
	public void method() {
		System.out.println("^��^");
	}
}


public class Exam_14_lambda {
	public static void main(String[] args) {
		BB b = new BB();
		b.method();
		
		AAA aa;
		aa=()->{System.out.println("AAAAA");}; // lambda �� �̶�� ��.
		aa.method();
		aa=()->System.out.println("BBBBB");
		aa.method();
		}
}
