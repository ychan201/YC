import java.util.Scanner;

public class Exem_03 {

	public static void main(String[] args) {
		Scanner scn;//ctrl+shift+o
		scn = new Scanner(System.in); // 객체 생성
		
		int a = scn.nextInt();//정수 입력받을 때
		System.out.println("a=" + a);//띄어쓰기 인식못함.
		double b = scn.nextDouble();//실수 입력받을 때
		System.out.println("b=" + b);//정수를 입력하면 자동으로 실수로 바뀐다.
		String c = scn.next();//문자열 (끊어서 입력가능)
		System.out.println("c=" + c);//문자전부를 인식함. 공백을 인식못함.
		//String d = scn.nextLine();//문자열 (끊어서 입력불가능)
		//System.out.println("d=" + d);//한줄을 통째로 인식한다. ','든 공백은 데이터가 없다는 판단한다


	}

}
