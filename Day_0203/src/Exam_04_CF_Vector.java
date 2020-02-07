import java.util.List;
import java.util.Vector;

public class Exam_04_CF_Vector {
	public static void main(String[] args) {
		List list = new Vector(); // list 에서는 capacity() 메소드를 호출 할 수 없다. capacity는 Vector 것이기 때문.
		
		Vector vc = new Vector(); // Vector로 클래스를 생성해야 capacity() 메소드 호출 가능
		
		System.out.println(vc.size()); // 오브젝트 수
		System.out.println(vc.capacity()); // 물리적 공간 ( defalut 값으로 10이 할당 - 배열로 따지면 10이 들어갔다고 볼 수 있음) 
											// 동기화 지원 ( 멀티쓰레드 환경에서 사용 ) , 단일 쓰레드로는 동기화 미지원 ArrayList를 사용. 
		
		vc.add("AAAA");
		vc.add(0,"BBBB");
		vc.add(1,"cBBc");
		vc.add("dddd");
		for(int i=0;i<vc.size();i++) System.out.println(vc.get(i));
	}
}
 