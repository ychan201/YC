
public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("MAX : "+Integer.MAX_VALUE);
		System.out.println("MIN : "+Integer.MIN_VALUE);
		System.out.println("SIZE : "+Integer.SIZE);
		int a=1000;
		System.out.println(a+"을 2진수로 변환 = "+Integer.toBinaryString(a));
		System.out.println(a+"을 8진수로 변환 = "+Integer.toOctalString(a));
		System.out.println(a+"을 16진수로 변환 = "+Integer.toHexString(a));
		System.out.println(Integer.parseUnsignedInt("3e8", 16));
	}
}
