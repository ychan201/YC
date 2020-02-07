import java.util.Scanner;

//키보드로 데이터 입력
//1 입력자료는 1 ~ 100사이 정수.
//2. 입력자료중 7의 배수 합
//3. 전체 자료(오류포함)가 20개면 프로그램은 종료된다.
//4. 입력 예사.
//입력 자료 : 0
//"error 입력 범위가 아님"
//입력자료 : 8
//입력 자료 : 77
//입력 자료 : 200
//"error 입력 범위가 아님"
//입력 자료 : 88
// .	.	.
// .	.	.
//입력 자료 : 88 --> 20개 입력 시
// 입력자료  20개 중 오류율(%) : xx%
// 입력 자료 20개 중 7의 배수 율(%) : xx%
// 평균 : xx.xx
// if문 


public class Exem_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int totcnt = 0; // 입력자료 수
		int errcnt=0;// 에러 갯수 
		int cnt=0; // 7의 개수
		
		int var;// 입력형 변수.
		do {
			System.out.print("입력자료 :");
			var = scn.nextInt();
			totcnt++;
			if(var>=1 && var<=100) {
				if(var%7==0) {
					sum+=var;
					cnt++;
				}
			}else {
				System.out.print("입력오류");
				errcnt++;
			}
		
		}while(totcnt<20);
		
		System.out.println("입력자료  20개 중 오류율(%) : " +(double) errcnt/20);
		System.out.println("입력 자료 20개 중 7의 배수 율(%) : " + cnt/20);
		
	}
}
