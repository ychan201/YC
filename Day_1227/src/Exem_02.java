
public class Exem_02 {

	public static void main(String[] args) {
		int a=5,b=0;
		int aa=5,bb=0;
		
		b=a++; // ������ ���� a�� �ѱ� �� ������Ű�� �� 
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		bb = ++aa; // a�� ���� ������Ų �� �ѱ����
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
		// ���蹮���� �� ���� b�� d�� ���� ��� �޶����°�.

	}

}
