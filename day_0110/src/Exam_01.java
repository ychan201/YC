/* �޼ҵ� ����
 * ���������� ����Ÿ�� �޼ҵ��(�Ű�����){
 * }
 * public ����
 * private 
 * �Ⱥ��̸� ����(�� ����) 
 * 
 */
public class Exam_01 {
	//����Ÿ�� x, �Ű�����x
	static void print(){
		System.out.println("Method test");
	}
	static int adder(int a,int b) {
		int c;
		c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Method Call Test Start");
		print();
		System.out.println("Method Call Test End");
	}
}
