/*
 * Math.random() --> 0~1������ ����
 */
public class Exam_06 {
	public static void main(String[] args) {
		//// 1~10���� �����߻�
		for(int x=0;x<10;x++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		System.out.println("-----------------------------------");
		
		//// 1~6���� �����߻�
		for(int x=0;x<10;x++) {
			System.out.println((int)(Math.random()*6)+1);
		}
	}
}
