/* �������(�ν��Ͻ� ����) �ʱ�ȭ
 * 1. ����� �ʱ�ȭ
 * 2. �����ڸ� �̿��� �ʱ�ȭ
 */

class AA{
	int x=0; // ����� �ʱ�ȭ
	int y;
	
	AA(){}
	
	/*static { // ���� �ʱ�ȭ �� - �ֿ켱���� ����.
		x=10;
		y=20;
	}*/
	
	
	{ // �ν��Ͻ� �ʱ�ȭ �� - ����� �ʱ�ȭ�� ���̰� ���� - ���� �ʱ�ȭ �� �� �켱 ����.
		x=10;
		y=20;
	}
	
	
	AA(int a){ // �����ڸ� �̿��� �ʱ�ȭ.
		y=a;
	}
	
	void data() {
		int x=0;
	}
	
}

public class Exam_03 {
	public static void main(String[] args) {
		AA a = new AA();
	}
}
