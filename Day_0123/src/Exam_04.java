
public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("MAX : "+Integer.MAX_VALUE);
		System.out.println("MIN : "+Integer.MIN_VALUE);
		System.out.println("SIZE : "+Integer.SIZE);
		int a=1000;
		System.out.println(a+"�� 2������ ��ȯ = "+Integer.toBinaryString(a));
		System.out.println(a+"�� 8������ ��ȯ = "+Integer.toOctalString(a));
		System.out.println(a+"�� 16������ ��ȯ = "+Integer.toHexString(a));
		System.out.println(Integer.parseUnsignedInt("3e8", 16));
	}
}
