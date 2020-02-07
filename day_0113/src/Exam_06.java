class Point{
	int x=10; // 명시적 초기화
	int y=20;
	
	// 생성자 오버로딩 - 메소드 이름은 무조건 같아야함. 매개변수(개수 or 종류)가 달라야함.
	Point(){ // 생성자
		System.out.println("AAAA");
	}
	Point(int a){ // 생성자
		x=a;
		System.out.println("AAAA");
	}
	Point(int a,int b){ // 생성자
		x=a;
		y=b;
		System.out.println("AAAA");
	}
	
	// void print() {}
}
public class Exam_06 {
	public static void main(String[] args) {
		Point pt1 = new Point(10,20); // default 생성자
		Point pt2 = new Point(100,200);
		pt1.x=10;
		pt2.y=4;
		System.out.println("pt1.x="+pt1.x);
		System.out.println("pt2.x="+pt2.x);
		}
}
