package test02;

/* �߻� Ŭ���� - �̿ϼ� ���赵
 * abstract Ű���� ���
 */



abstract class AA{ // �߻� �޼ҵ尡 �ϳ��� �����ϸ�, �� Ŭ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
	int x=100;
	void test() {
		System.out.println("x = "+x);
		
	}
	abstract int sum(int x, int y); // �޼ҵ�� �´µ� �����̾��� - �߻� �޼ҵ� - ����� ����� �Ҵ�
}

class BB extends AA{
	
	@Override
	int sum(int x, int y) {
		int su = x+y;
		return su;
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		AA a = new BB();
		System.out.println(a.sum(33, 85));
		
	}
}
