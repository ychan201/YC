
public class Tvtest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); // tV T1; T1 = NEW tV(); 를 한문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		
		t1.channel = 7;
	}
}
