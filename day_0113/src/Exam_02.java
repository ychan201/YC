public class Exam_02 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		String str;
		str = new String("AAA"); // Ư���� ���̽�. ���ڿ��� ���� ����� �� �ֵ��� ������ ������. - �������̵� ���.
		System.out.println("str="+str);
		System.out.println("tv="+tv);
		tv.channel=7;
		System.out.println("����ä���� "+tv.channel+"�Դϴ�.");
		tv.channelDown();
		System.out.println("����ä���� "+tv.channel+"�Դϴ�.");
		tv.power();
		System.out.println("���� TV ���� "+tv.pow+"�Դϴ�.");
		tv.power();
		System.out.println("���� TV ���� "+tv.pow+"�Դϴ�.");

	}
}
