public class Exam_02 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		String str;
		str = new String("AAA"); // 특이한 케이스. 문자열을 직접 출력할 수 있도록 변형이 돼있음. - 오버라이딩 기능.
		System.out.println("str="+str);
		System.out.println("tv="+tv);
		tv.channel=7;
		System.out.println("현재채널은 "+tv.channel+"입니다.");
		tv.channelDown();
		System.out.println("현재채널은 "+tv.channel+"입니다.");
		tv.power();
		System.out.println("현재 TV 전원 "+tv.pow+"입니다.");
		tv.power();
		System.out.println("현재 TV 전원 "+tv.pow+"입니다.");

	}
}
