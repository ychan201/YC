import java.util.Scanner;

/* 키보드 입력(1~10) -> 7개 입력
 * 입력 : 5
 * 입력 : 0
 * 입력오류
 * 입력 : 9
 *  . . . -> 7개 입력시 출력
 *  [ 출력 ]
 *  입력자료 : 5 9 x x x x x
 *  최대값 : x
 *  최소값 : x
 *  합계(최대,최소를 뺀 합계) : xx
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int input,cnt=0,max,min,sum=0;
		while(true) {
			System.out.print("정수 입력:");
			input = sc.nextInt();
			if(1<=input&&input<=10) {
				arr[cnt]=input;
				sum+=input;
				cnt++;
				if(cnt==7)break;
			}
			else System.out.println("입력 범위 초과");
		}
		// 입력 종료. 계산 시작.
		max=arr[0];
		min=arr[0];
		for(int i=1;i<cnt;i++) {	// 최대/최소 계산
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		sum=sum;	// 총합 - 최대 - 최소 계산.
		
		// 출력부
		
		System.out.print("입력자료 : ");
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("최대 최소를 뺀 합계 : "+(sum-max-min));
	}
}
