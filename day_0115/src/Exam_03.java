import java.util.Scanner;

/* 키보드로 10진수, 변환할 진수 입력 다음과 같이 출력하는 클래스를 작성하시오
 * [입력 예시] 			[입력 예시]			[입력 예시]
 * 10진수 : 25			10진수: 45			10진수:45
 * 		변환 : 2			    변환: 8					변환:16
 * [출력 예시]			[출력 예시]			[출력 예시]
 * 10진수 : 25			10진수: 45			10진수:45
 * 	2진수:11001		8진수:55				16진수:2D
 */
class ConvNumber{
	int dec,conv,cnt;
	int arr[] = new int[16];
	char str[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	char binary[]=new char[16];
	String string="";

	ConvNumber(){}
	ConvNumber(int a,int b){
		dec=a;
		conv=b;
	}
	String coversion(){
			for(int i=0;i<arr.length;i++) {
				binary[i]=str[dec%conv];
				if((dec/conv)>0) cnt++;
				dec=dec/conv;
	}
			for(int i=cnt;i>=0;i--) 
				//System.out.print(binary[i]);
					string+=binary[i];
			return string;
}
}


public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 :");
		int dec,conv;
		dec= sc.nextInt();
		while(true) {
		System.out.print("변환 :");
		conv = sc.nextInt();
		if (conv == 2 || conv == 8 || conv ==16) break;
		else System.out.println("잘못된 변환 값");
		}
		
		ConvNumber cv = new ConvNumber(dec,conv);
		System.out.println("10진수 "+dec);
		System.out.println(conv+"진수 :"+cv.coversion());
	}
}
