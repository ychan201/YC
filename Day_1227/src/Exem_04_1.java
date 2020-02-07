
public class Exem_04_1 {

	public static void main(String[] args) {
		//(조건식) ? 참 : 거짓 ;
		int a=11, b=2;
		int max=(a>b)? a : b;//큰값을 찾는 식에는 이거 한줄이면 끝남.
		int min=(a>b)? b : a;//작은값을 찾을 때
		System.out.println("큰값:" + max);
		System.out.println("작은값:" + min);
	}

}
