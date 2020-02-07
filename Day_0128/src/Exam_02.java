import java.util.Random;

public class Exam_02 {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0;i<100;i++) {
		System.out.print(r.nextInt(45)+1+" "); // 0~44까지의 난수에 +1
		}
	}
}
