
public class Exem_03 {

	public static void main(String[] args) {
		int a=7,b=5, c;
		c = (int)(a/(double)b);
		System.out.println("c=" + c);
		System.out.println("9/5 =" + 9/5);
		c = a%b;
		System.out.println("c=" + c);
		
		System.out.println("5<<2 = " + (5<<2));
		System.out.println("20>>2 = " + (20>>2));
		
		// = 대입연산자 우측값이 좌측으로 복사될 때 반드시 타입이 같아야 한다.
	}

}
