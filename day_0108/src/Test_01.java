import java.util.Scanner;

public class Test_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt=0,input,input_c,var;
		while(true){
			System.out.print("정수 진수 입력:");
			input = sc.nextInt();
			var=sc.nextInt();
			input_c = input;
			cnt=0;
			if((2<=input&&input<1024) && (1<var&&var<10)) {
				for(int i=0;i<arr.length;i++) {
					arr[i]=input_c%var;
					if((input_c/var)>0) cnt++;
					input_c=input_c/var;
				}// 입력종료
				//출력시작
				System.out.println("입력 : "+input);
				System.out.print(var+"진수 : ");
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
