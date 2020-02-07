package lambda;

interface BBB{
	void test(int x);
}

public class Exam_15_lambda_EX {
	public static void main(String[] args) {
		BBB b;
		b=(a)->{
			int result=100;
			System.out.println(a*result);
		};
		b.test(3);
		
	}
}
