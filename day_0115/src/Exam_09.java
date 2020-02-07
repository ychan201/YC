/*
 * 싱글톤(singleton) -  객체는 모두 같은 주소를 가짐. - 객체를 생성하지 못하게 함.
 */

class DataB{
	private static DataB data = new DataB(); // 다른곳에서 접근하지 못하게, 자신이 자신의 객체를 만든 후에, Data클래스에서만 사용하게 만듬.
	private DataB() {} // 객체생성 new를 막음.
	static DataB getInstance() { // static이 붙은 메소드나 변수들은 객체를 생성하지 않아도 사용 가능하다 , 직접 호출해야한다.(new 사용 불가)
		return data;
	}
}

public class Exam_09 {
	public static void main(String[] args) {
		DataB d1 = DataB.getInstance();
		DataB d2 = DataB.getInstance();
		
		System.out.println("d1==d2" + (d1==d2));
	}
}
