package test01;

class AAAA{
	
}

class BBBB extends AAAA{
	
}

public class Exam_09 {
	
	static void test(AAAA parent) {
		if(parent instanceof BBBB) { // instanceof - ������ ��ü������ ��
			BBBB bb = (BBBB)parent;
			System.out.println("BBBB ��ȯ");
		}else {
			System.out.println("BBBB �Ұ�");
		}
	}
	
	public static void main(String[] args) {
		AAAA aa = new BBBB();
		test(aa);
		
		AAAA aaa = new AAAA();
		test(aaa);
	}
}
