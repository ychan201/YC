import java.util.Arrays;

/* System Ŭ����
 * �迭����            // ���� Arrays.sort
 * System.arraycopy(�����迭,������ġ,���迭,������ġ,�׸��)   
 */
public class Exam_06 {
	public static void main(String[] args) {
		char arr1[] = {'��','��','��','��'};
		char arr2[] = {'a','b','c','d','e','f'};
		System.out.println("�����迭 ���");
		System.out.print("arr1 :");
		for(char ch : arr1) {
			System.out.print(ch +"\t");
		}
		System.out.println();
		System.out.print("arr2 :");
		for(char ch : arr2) {
			System.out.print(ch +"\t");
		}
		System.out.println();
		
		System.arraycopy(arr1, 0, arr2, 0, 4);
		System.out.print("arr2 :");
		for(char ch : arr2) {
			System.out.print(ch +"\t");
		}
		
	}
}
