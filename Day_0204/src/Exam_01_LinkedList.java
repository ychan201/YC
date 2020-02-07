import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* List -> ArrayList , Vector(멀티쓰레드방식,동기화지원) , LinkedList : 순차적(index) ,중복 허용
 * LinkedList는 자료구조가 연결형이다.    (앞 인덱스 주소) 데이터 (뒤 인덱스 주소) , List는 끼워넣기 시 뒤쪽 값을 전부 한칸씩 밀어내야 함.
 */
public class Exam_01_LinkedList {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new LinkedList();
	}
}
