import java.util.ArrayList;

/*
 * Collection Framework
 * 자바의 자료구조
 * Collection 인터페이스 상속한 인터페이스(List,set), Map - - 컬렉션 // 맵으로 크게나눔.
 * List (순서가 있고, 중복 허용) - 인덱스로 접근 가능
 * Set (순서가 없고, 중복 불가) - 인덱스로 접근 불가
 * Map (키 , 값이 쌍으로 저장) - 순서가 있고, 키의 중복 불가
 */
public class Exam_01_Collection_Framework {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		ArrayList list2 = new ArrayList(10);
		
		System.out.println("list empty :" + list.isEmpty());
		System.out.println("list size : " + list.size());
		list.add("123"); // 어떤 타입이던지 저장이 가능하여, 편리한건 사실이나 어떤 데이터 타입이 들어가 있는지 보지 않으면 모른다.
		list.add(123); // List는 순서가 있음(index 존재). 그러므로 for문을 이용하여 꺼내오는것도 가능함.
		list.add(3.14);
		list.add('A');
		System.out.println("list empty : " + list.isEmpty());
		System.out.println("list size : " + list.size());
		System.out.println("list(0) : " +list.get(0)); // 단순한 출력은 문제가없음. 하지만 0번째 데이터를 사용하기 위해선 변수에 대입을 하여 사용해야 함.
		String str = (String)list.get(0); // list 0번의 "123" 문자열을 String형 str 변수에 저장하려고 시도하지만, 리턴타입이 미스매치 (list는 Object 타입임)
										  // 그러므로 list.get(0) 오브젝트 타입의 변수를 String형으로 캐스팅 해줘야 대입이 가능해짐.
		int a = (int)list.get(1);		  // int 형도 마찬가지로 object타입의 list를 int 형으로 캐스팅하여 저장해줘야 함.
	}
}
