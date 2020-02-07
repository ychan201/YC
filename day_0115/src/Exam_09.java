/*
 * �̱���(singleton) -  ��ü�� ��� ���� �ּҸ� ����. - ��ü�� �������� ���ϰ� ��.
 */

class DataB{
	private static DataB data = new DataB(); // �ٸ������� �������� ���ϰ�, �ڽ��� �ڽ��� ��ü�� ���� �Ŀ�, DataŬ���������� ����ϰ� ����.
	private DataB() {} // ��ü���� new�� ����.
	static DataB getInstance() { // static�� ���� �޼ҵ峪 �������� ��ü�� �������� �ʾƵ� ��� �����ϴ� , ���� ȣ���ؾ��Ѵ�.(new ��� �Ұ�)
		return data;
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		DataB d1 = DataB.getInstance();
		DataB d2 = DataB.getInstance();
		
		System.out.println("d1==d2" + (d1==d2));
	}
}
