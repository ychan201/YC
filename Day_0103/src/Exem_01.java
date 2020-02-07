import java.util.Scanner;

//키보드로 데이터 입력
//1 입력자료는 1 ~ 100사이 정수.
//2. 입력자료중 3의 배수 이면서 7의 배수만 합계와 평균을 구하여 출력
//3. 입력 자료중  3의 배수 이면서 7의 배수가 7개이면 프로그램은 종료된다.
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
//입력 자료 : 88
// 합계 : xxx
// 평균 : xx.xx
// if문 


public class Exem_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;
		int cnt=0;//누적형 변수는 이두개로 충분.
		int var;// 입력형 변수.
		while(true) {
			System.out.print("입력자료 :");
			var = scn.nextInt();
			if(var>=1 && var<=100) {
				if(var%3==0 && var%7==0) {
					cnt++;
					sum+=var;
					if(cnt==7) {
						break;
					}
				}
			}else {
				System.out.println("입력 오류(입력 범위오류)");
			}
			//if(cnt==7) {  여기에 써도 상관없다.
				//break;
		    //}
		}//while(true) 끝 // 혼돈하지 말라는 의미에서 미리 써놓음.
		System.out.println("합계  : " +sum);
		System.out.println("평균  : " +sum/7);
		

	}

}
