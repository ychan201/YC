package generics;
/* 제너릭 : 다양한 타입의 객체를 다루는 메소드나 클래스에
 * 컴파일시의 타입체크를 해주는 기능.
 */

import java.util.ArrayList;
import java.util.List;;

public class Exam_05_generics {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <자료형>요것이 제너릭 타입이란 것이라고 합니다
		list.add("홍길동");
		//list.add(100);
		String name = (String)list.get(0);
		//int score = (int)list.get(1);
	}
}
