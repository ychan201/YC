class AA{
	int x; // 멤버(인스턴스 변수)
	int y;
}
class BB{
	int sum() {
		int x=100; // 지역변수(변수)
		return x;
	}
	void test(int n) {
		System.out.println("n="+n);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		aa.x=25;
		aa.y=13;
		int s=bb.sum();
		System.out.println(bb.sum()+s);
	}
}
