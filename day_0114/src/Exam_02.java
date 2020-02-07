
class Mouse2 {
	// 속성 정의
	int btnNo; // 버튼 수
	boolean cable; // 유선(true) 무선(false)
	String color; // 색상

	Mouse2() {
	}

	Mouse2(int btnNo, boolean cable, String color) {
		if(btnNo==2 || btnNo==3) {
		this.btnNo = btnNo;
		this.cable = cable;
		this.color = color;
		}
		else System.out.println("마우스 생성 불가");
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
		if (btnNo == 2) {
			if (btn == 1)
				System.out.println("왼쪽버튼 클릭");
			else if (btn == 2)
				System.out.println("오른쪽버튼 클릭");
			else
				System.out.println("버튼이 없습니다.");
		} 
		else if (btnNo == 3) {

			if (btn == 1)
				System.out.println("왼쪽버튼 클릭");
			else if (btn == 2)
				System.out.println("오른쪽버튼 클릭");
			else if (btn == 3)
				System.out.println("휠 클릭");
			else
				System.out.println("버튼이 없습니다.");
		}
		else System.out.println("잘못된 마우스");
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Mouse2 m1 = new Mouse2(1, true, "검정");
		m1.mousePrint();
		m1.buttonClick(3);
	}
}
