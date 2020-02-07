package studnet1;

public class Exam_05 {
	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.aa=100;
		aa.bb=200;
	//	aa.cc=300;  private 이기 때문에 접근불가
	//	aa.ccc();   private 이기 때문에 접근불가
		aa.aaa();
		aa.bbb();
	}
}
