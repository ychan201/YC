import java.util.Scanner;

/* 키보드 입력(10개)
 *  오름 차순 정렬 출력
 *  1. 입, 출력은 main() 문에서 처리
 *  2. 정렬은 메소드에서 처리
 */
public class Exam_09 {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		// 입력
		for (int i = 0; i < a.length; i++) {
			System.out.print("정수 입력:");
			a[i] = sc.nextInt();
		}

		// 출력
		printData("변환전",a);
		
		sort(a);
		printData("변환후",a);
		
		
	}

	static void sort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}
		}
	}
	
	static void printData(String title,int a[]) {
		System.out.println(title+"출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}

}
