/* 학생 클래스 정의
 *  static < main문과 동급이기때문에(?)
 */

class Student{ // class - 사용자 정의 변수. 내가 원하는 것들만 모아 놓은 일종의 자료형
	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	void totAccount() { // 총점 계산
		tot = kor + eng + mat;
	}
	
	void avgAccount() { // 평균 계산
		avg = tot/3.;
	}
	
	void dataPrint() {
		System.out.println("--------------성적표--------------");
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println();
		System.out.print(hakbun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.println();
	}
	
}
// 클래스 정의 종료 ( 설계도 작성 완료 )

public class Exam_01 {
	public static void main(String[] args) { //최종 생산 공장 ( 조립 )
		Student st; // 레퍼런스(인스턴스) 변수
		st= new Student(); // 인스턴스 생성 - 붕어빵 틀에다가 재료를 넣고 붕어빵을 생산한 과정
		Student s =new Student();
		st.name="홍길똥";
		st.hakbun=1;
		st.kor=84;
		st.eng=76;
		st.mat=89;
		st.totAccount();
		st.avgAccount();
		st.dataPrint();
		s.dataPrint();
	}
}
