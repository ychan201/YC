/* String Ŭ����
 * ���� : ���ڿ� ����� ����ӽ� ��ü���� ����
 * 		 ���ڿ��� �Һ�
 */

class AA{
	
	@Override
	public String toString() {
		return "sss";
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		String str1="123";  // String�� Ŭ������.
		String str2 ="123";
		String str3 = new String("123");
		String str4=null; // �ʱ�ȭ
		String str5=new String();
		AA a = new AA();
		// ��(==) : �⺻��  / equals() �� �ּҰ� ������ �ִ� ���� �����͸� ��
		System.out.println("str1 == str2 "+ (str1==str2)); // �ּҰ� ��(����X)
		System.out.println("str1 == str3 "+ (str1==str3)); 
		System.out.println("str2 == str3 "+ (str2==str3));
		System.out.println("str1.equals(str3) : "+str1.equals(str3)); // �� �� ����
	}
}

