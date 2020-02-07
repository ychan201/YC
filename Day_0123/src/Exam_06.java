/*
 * Math.random() --> 0~1사이의 난수
 */
public class Exam_06 {
	public static void main(String[] args) {
		//// 1~10사이 난수발생
		for(int x=0;x<10;x++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		System.out.println("-----------------------------------");
		
		//// 1~6사이 난수발생
		for(int x=0;x<10;x++) {
			System.out.println((int)(Math.random()*6)+1);
		}
	}
}
