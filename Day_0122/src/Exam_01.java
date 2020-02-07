/* String 클래스
 * 장점 : 문자열 상수를 가상머신 전체에서 공유
 * 		 문자열은 불변
 */

class AA{
	
	@Override
	public String toString() {
		return "sss";
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		String str1="123";  // String은 클래스다.
		String str2 ="123";
		String str3 = new String("123");
		String str4=null; // 초기화
		String str5=new String();
		AA a = new AA();
		// 비교(==) : 기본형  / equals() 그 주소가 가지고 있는 실제 데이터를 비교
		System.out.println("str1 == str2 "+ (str1==str2)); // 주소값 비교(값비교X)
		System.out.println("str1 == str3 "+ (str1==str3)); 
		System.out.println("str2 == str3 "+ (str2==str3));
		System.out.println("str1.equals(str3) : "+str1.equals(str3)); // 값 비교 ㅎㅎ
	}
}

