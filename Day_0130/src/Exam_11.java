import java.util.Arrays;

/* 검색
 * 
 */

public class Exam_11 {
	public static void main(String[] args) {
		int var[] = {80,90,77,88,56,95};
		String name[] = {"홍길동","김자바","이순신"};
		
		Arrays.parallelSort(var);
		for(int i=0;i<var.length;i++) {
			System.out.print(var[i]+" ");
		}
		System.out.println();
		int index = Arrays.binarySearch(var, 90); // 2진검색은 정렬이 되어있어야 함.
		System.out.println("90 위치는 : " + index);
		
		Member m[] = new Member[10];
		m[0] = new Member("홍길동");
		m[1] = new Member("김길서");
		m[2] = new Member("이길남");
		m[3] = new Member("박길북");
		m[4] = new Member("서길일");
		m[5] = new Member("정길이");
		m[6] = new Member("구길삼");
		m[7] = new Member("총길사");
		m[8] = new Member("표길오");
		m[9] = new Member("원길육");
		Arrays.parallelSort(m);
		int no = Arrays.binarySearch(m, m[2]);
		System.out.println(m[2].name + "는" + no+ "있음");
	}
}
