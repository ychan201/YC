/* 기본 자료형과 레퍼런스형의 차이점
 * 
 */
class Data{
	int x;
	int y;
	
	
}

public class Exam_04 {
	static void swap(int a, int b) {
		int c=a;
		a=b;
		b=c;
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a="+a+"\tb="+b);
		swap(a,b);
		System.out.println("a="+a+"\tb="+b);
		System.out.println("----------------------");
		Data d = new Data();
		d.x=10;
		d.y=20;
		System.out.println("d.x="+d.x+"\td.y="+d.y);
		swapD(d);
		System.out.println("d.x="+d.x+"\td.y="+d.y);
		System.out.println("----------------------");
		int s[] = {10,20};
		System.out.println("s[0]="+s[0]+"\tS[1]="+s[1]);
		swapS(s);
		System.out.println("s[0]="+s[0]+"\tS[1]="+s[1]);
	}
	
	static void swapD(Data a) { // 참조에 의한 호출.
		int aa=a.x;
		a.x=a.y;
		a.y=aa;
	}
	static void swapS(int[] a) {
		int aa=a[0];
		a[0]=a[1];
		a[1]=aa;
	}
}
