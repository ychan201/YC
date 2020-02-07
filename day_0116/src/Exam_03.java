
/* 상수 정의
 * 리터럴(10,'a',3.14,"aa")
 * 
 */
class AA{
	final double PI = 3.14; // 상수 (final)
	final static int MAX=100;
}

public class Exam_03 {
	public static void main(String[] args) {
		AA a = new AA();
		int b=3;
		double d=b*a.PI;
	}
}
