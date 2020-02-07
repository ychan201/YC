
class Mouse3 {
	// 속성 정의
	int btnNo; // 버튼 수
	boolean cable; // 유선(true) 무선(false)
	String color; // 색상

	Mouse3() {
	}

	Mouse3(int btnNo, boolean cable, String color) {
		
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
	}

	void mousePrint() {
		System.out.print("버튼수 :" + btnNo + "\t");
		System.out.print("유무선 :" + cable + "\t");
		System.out.println("색상 :" + color);

	}

	// 버튼 클릭 메소드 구현
	// 버튼이 2개일 경우(1-왼쪽, 2-오른쪽)
	// 버튼이 3개일 경우(1-왼쪽, 2-오른쪽, 3- 휠)
	void buttonClick(int btn) {
		if(btn<1) {
			System.out.println("클릭 오류");
			return;
		}
		if(btn==1) {
			System.out.println("왼쪽버튼 클릭");
			return;
		}
		if(btnNo<2 && btn==2) {
			System.out.println("오른쪽 버튼 클릭 오류");
			return;
		}
		if(btnNo>1 && btn==2) {
			System.out.println("오른쪽 버튼 클릭");
			return;
		}
		if(btnNo<3 && btn==3) {
			System.out.println("휠 버튼 클릭 오류");
			return;
		}
		if(btnNo>2 && btn==3) {
			System.out.println("휠 버튼 클릭");
			return;
		}
		if(btn>3) {
			System.out.println("클릭 오류");
			return;
		}
	}
}

public class Exam_02_1 {
	public static void main(String[] args) {
		Mouse3 m1 = new Mouse3(1,true, "검정");
		m1.mousePrint();
		m1.buttonClick(3);
	}
}
