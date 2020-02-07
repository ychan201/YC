import java.util.ArrayList;
import java.util.List;

/* ArrayList는 문자열,정수,실수 등의 데이터타입만을 저장하겠다고 선언 할 수 있음
 * 
 */

public class Exam_02_CF_list {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("1234");
		list.add("C++");
		list.add("Pytyhon");
		list.add("Program");
		
		String str = list.get(0); // String 형으로 ArrayList으로 미리 선언해 두었기때문에, 캐스팅 하지 않아도 스트링 변수에 저장 가능.
		for(int x=0; x<list.size();x++) {
			System.out.println(list.get(x));
		}
		
		boolean bool = list.contains("C++"); // 포함되어 있으면 트루 contains 없으면 false 리턴
		System.out.println(bool);
		int index = list.indexOf("C+"); // 몇번째에 있냐 indexOf , 없으면 -1, 있으면 인덱스 번호 리턴
		System.out.println(index);
		list.set(0, "Java"); // 0번째 값을 바꿔라 set
		System.out.println(list.get(0));
		
	} 
}
