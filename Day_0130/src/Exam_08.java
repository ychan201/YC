import java.util.Arrays;

/* Arrays
 *  - 배열 복사, 항목 비교, 정렬, 검색 등을 지원
 */
public class Exam_08 {
	public static void main(String[] args) {
		int var[] = {1,2,3,4,5,6};
		int[] str = Arrays.copyOf(var, var.length);
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		System.out.println("배열 주소비교 : "+(var.equals(str)));
		System.out.println("배열 요소 값 비교 : "+(Arrays.equals(var, str)));
	}
}
