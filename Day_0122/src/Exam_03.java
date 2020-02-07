/* 1문자 입력
 * System.in.read() --> 1문자를 받아서 int 타입으로 변환하여 저장
 */

public class Exam_03 {
	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력:");
		int cnt = (char)System.in.read(bytes); // 입력받은 문자의 수가 cnt로 들어감.
		System.out.println("글자수 : " + cnt);
		String s = new String(bytes,0,cnt-2);
		System.out.println("입력자료 : "+s);
		System.out.println("글자수 : " + s.length());
		
		String str ="";
		if(str.isEmpty()) System.out.println("빔");
		else System.out.println("값들어있음");

	}
}
