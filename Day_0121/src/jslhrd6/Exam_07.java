package jslhrd6;

class AA { // object Ŭ������ �⺻������ ��ӹ���.
	int a;

	AA() {
	}

	AA(int a) {
		this.a = a;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof AA) {
			return a==((AA)obj).a;
		}
		return false;
	}
}

public class Exam_07 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA(5);
		if (a1.equals(a2))
			System.out.println("a1 == a2 :" + true);
		else
			System.out.println("a1 != a2 :" + false);
	}
}