import java.util.Scanner;

/* 키보드 입력(2~1023) 입력
 * 입력 값을 2진수 변환해서 출력
 * 입력 값이 -99 이면 종료.
 * 예시)
 * 입력 : 10
 * 2진수 : 1010
 * 입력 : 1
 * 입력 오류
 * 입력 : 127
 * 2진수 : 1111111
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt=0,input,input_c;
		while(true){
			System.out.print("2진수로 변환할 정수 입력:");
			input = sc.nextInt();
			input_c = input;
			cnt=0;
			if(2<=input&&input<1024) {
				for(int i=0;i<arr.length;i++) {
					arr[i]=input_c%2;
				if((input_c/2)>0) cnt++;
					input_c=input_c/2;
				} // 입력종료
				//출력시작
				System.out.println("입력 : "+input);
				System.out.print("2진수 : ");
				for(int i=cnt;i>=0;i--) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			else if(input==-99)break;
			else System.out.println("잘못된 입력범위");
			}
		System.out.println("-99를 입력받아 프로그램 종료.");
	}
}
