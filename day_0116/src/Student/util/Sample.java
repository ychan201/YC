package Student.util;

public class Sample {
	private int a=10;
	void test() {
		int s=a+20;
	}
}

class BB{
	Sample s = new Sample();
	void test() {
		s.a=30;
	}
}
