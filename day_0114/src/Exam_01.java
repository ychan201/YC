/* 객체 지향 프로그래망( OOP )
 * 1. 클래스 : 추상화 (속성 - 멤버변수 , 행위(기능) - 메소드)
 * 2. 인스턴스(객체) : 클래스로 부터 생성된 객체
 * 3. 메시지(메소드) : 객체들 간의 상호 작용하는데 사용되는 수단.
 * 절차지향 - 배열까지 배웠던 것. ( if문 등 ) C가 가장 대표적.
 * 객체 지향 3요소
 * 캡슐화 - 클래스에 여러가지 기능을 넣어두고 숨겨(캡슐화)놓음.
 * 상속성 - 상위 클래스로부터 필요한 기능을 상속받을 수 있음.
 * 다형성 - 여러가지 기능을 수행.
 * 
 * 마우스
 * 1. 속성 : 버튼 수, 유(무)선 , 색상
 * 2. 기능 : 좌클릭, 우클릭,좌 더블클릭
 */
class Mouse{
	// 속성 정의
	private int btnNo=2; // 버튼 수
	private boolean cable=true; // 유선(true) 무선(false)
	private String color="검정"; // 색상
	// 생성자 - 클래스 이름과 같은 메소드 - 생성자 오버로딩
	// 객체 생성시 초기화
	Mouse(){} // 생성자를 하나 만든 경우에는, 디폴트 생성자를 무조건 만들어야 한다.
	Mouse(int btnNo){
		this.btnNo = btnNo;
	}
	Mouse(int btnNo,boolean cable){
		this.btnNo = btnNo;
		this.cable=cable;
	}
	Mouse(int btnNo,boolean cable,String color){
		this.btnNo=btnNo;
		this.cable=cable;
		this.color=color;
	}
	
	// 자신 출력
	
	void info(){
		System.out.print("마우스의 버튼 수는 "+btnNo+"개 이고,");
		if(cable) System.out.println("유선 방식 입니다.");
		else System.out.println("무선 방식 입니다.");
		System.out.println("색상은 "+color+"입니다.");
	}
	
	public void setBtnNo(int btnNo) {
		this.btnNo = btnNo;
	}
	
	//기능정의(메소드)
	
	void leftClick() {
		System.out.println("왼쪽 버튼 클릭됐다");
	}
	void rightClick() {
		System.out.println("오른쪽 버튼 클릭됐다");
	}
	int leftDoubleClick() {
		System.out.println("왼쪽 버튼 더블클릭됐다");
		return 0;
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		Mouse mou1 = new Mouse(); // 인스턴스(레퍼런스) 변수 선언 및 초기화.
		mou1.info();
		mou1.setBtnNo(5);
		mou1.info();
		System.out.println("----------------------");
		Mouse mou2 = new Mouse(3);
		mou2.info();
		System.out.println("----------------------");
		Mouse mou3 = new Mouse(3,true);
		mou3.info();
		System.out.println("----------------------");
		Mouse mou4 = new Mouse(3,true,"그레이");
		mou4.info();
	}
}
