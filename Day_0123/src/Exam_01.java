/* String Ŭ���� �޼ҵ�
 * valueOf(); ������ ���� ���ڿ��� ��ȯ
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a=100;
		String aa = a+""; // "100"; �� ����
		System.out.println(aa);
		String ab = String.valueOf(a);
		String ac = String.valueOf(true);
		//���� Ŭ����(Wrapper)
		// int -> Integer , byte -> Byte
		// char -> Character
		int b = Integer.parseInt(ab);
		// int bb = Integer.parseInt("123a");
		System.out.println(ab);
		int bbb = Integer.valueOf(ab);
		System.out.println(ab);
		
		int var=100;
		double dou=3.141582;
		// ���� var=100 �Ǽ� dou=3.14
		System.out.println("���� var ="+var+"\t�Ǽ� dou ="+dou);
		String ss = String.format("���� var =%5d \t�Ǽ� dou =%.2f ", var, dou);
		System.out.println(ss);
		String sss = String.format("���� var =%10d \t�Ǽ� dou =%10.2f ", var, dou);
		System.out.println(sss);
	}
}

