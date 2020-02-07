배열의 선언과 동시 초기화


package day_1223;

public class exem_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,234,23,4,345,23,,5,6,7,8,9,4,3};
		// 배열 길이
		System.out.println("배열 길이 :" + a.length);
		for(int 1=0; i<a.length;i++)
			System.out.println("a["+i+"]=" + a[i]);
	}

}
