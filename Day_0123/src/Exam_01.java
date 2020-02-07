/* String 클래스 메소드
 * valueOf(); 지정된 값을 문자열로 변환
 */
public class Exam_01 {
	public static void main(String[] args) {
		int a=100;
		String aa = a+""; // "100"; 과 동일
		System.out.println(aa);
		String ab = String.valueOf(a);
		String ac = String.valueOf(true);
		//래퍼 클래스(Wrapper)
		// int -> Integer , byte -> Byte
		// char -> Character
		int b = Integer.parseInt(ab);
		// int bb = Integer.parseInt("123a");
		System.out.println(ab);
		int bbb = Integer.valueOf(ab);
		System.out.println(ab);
		
		int var=100;
		double dou=3.141582;
		// 정수 var=100 실수 dou=3.14
		System.out.println("정수 var ="+var+"\t실수 dou ="+dou);
		String ss = String.format("정수 var =%5d \t실수 dou =%.2f ", var, dou);
		System.out.println(ss);
		String sss = String.format("정수 var =%10d \t실수 dou =%10.2f ", var, dou);
		System.out.println(sss);
	}
}

