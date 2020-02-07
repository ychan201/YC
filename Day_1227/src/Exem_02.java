
public class Exem_02 {

	public static void main(String[] args) {
		int a=5,b=0;
		int aa=5,bb=0;
		
		b=a++; // 대입후 연산 a를 넘긴 후 증가시키는 것 
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		bb = ++aa; // a를 먼저 증가시킨 후 넘기느냐
		System.out.println("a=" + aa);
		System.out.println("b=" + bb);
		
		int c=5, d=0;
		int cc=5, dd=0;
		d=c++ + 5;
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		
		dd = ++c + 5;
		System.out.println("cc=" + c);
		System.out.println("dd=" + d);
		// 시험문제로 잘 나옴 b나 d의 값이 어떻게 달라지는가.

	}

}
