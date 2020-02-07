package test03;

class AA11{
	int x =10;
	void sum() {
		System.out.println("x = "+x);
	}
}

interface A{
	void test();
}

class AA implements A{
	@Override
	public void test() {
		System.out.println("AA");
	}
}

class BB implements A{
	@Override
	public void test() {
		System.out.println("BB");
	}
}

class CC implements A{
	@Override
	public void test() {
		System.out.println("CC");
	}
}

public class Exam_15 {
	public static void main(String[] args) {
		AA aa = new AA();
		A a = new AA();
		a.test();
		aa.test();
		a = new BB();
		a.test();
		a = new CC();
		a.test();
	}
}
